import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cache {
    private int memory_blocks;
    private int cache_blocks = 32;
    private int cache_line = 64;
    private int memory_access_count = 0;
    private int cache_hit = 0;
    private int cache_miss = 0;
    private float hit_rate;
    private float miss_rate;
    private float ave_access_time;
    static List<Block> blocks = new ArrayList<Block>();

    public Cache(int memory_blocks) {
        this.memory_blocks = memory_blocks;
    }

    /*
     * public void addData(){
     * File file= new File("Log.txt");
     * try{
     * FileWriter writer= new FileWriter(file);
     * 
     * Scanner scanner = new Scanner(System.in);
     * int data;
     * for (int i=0;i<memory_blocks; i++){
     * //user input Data
     * System.out.println("Enter Data");
     * 
     * data = scanner.nextInt();
     * 
     * //hit
     * if(findData(data)!=-999){
     * int dataIndex = findData(data);
     * ageUp(dataIndex);
     * blocks.get(dataIndex).resetAge();
     * cache_hit++;
     * }
     * //not yet full
     * else if (cache_blocks!=blocks.size()){
     * //miss
     * if(findData(data) == -999) {
     * ageUp(-999);
     * blocks.add(new Block(data));
     * cache_miss++;
     * }
     * 
     * }
     * //data is full and not hit so replace oldest
     * else if (cache_blocks == blocks.size()){
     * int oldestIndex =findOldest();
     * ageUp(oldestIndex);
     * blocks.get(oldestIndex).replaceData(data);
     * cache_miss++;
     * }
     * memory_access_count++;
     * 
     * hit_rate = (float)cache_hit/ memory_access_count;
     * miss_rate = (float)cache_miss/ memory_access_count;
     * if (i==memory_blocks-1){
     * writeTextLog(data, writer,true);
     * }
     * else
     * writeTextLog(data, writer,false);
     * 
     * //display block step by step in console
     * for (int j = 0; j< cache_blocks;j++){
     * try{
     * System.out.println("Block: "+j+" |Age:"+blocks.get(j).getAge()+" |Data: "+
     * blocks.get(j).getData());
     * 
     * }
     * //if block is null or doesn't exist
     * catch(IndexOutOfBoundsException e) {
     * System.out.println("Block: "+j+ " |Age:  "+ "|Data: Empty");
     * }
     * }
     * 
     * }
     * 
     * System.out.println("");
     * System.out.println("Cache Hit Count: "+cache_hit);
     * System.out.println("Cache Miss Count: "+cache_miss);
     * 
     * System.out.println("Cache Hit Rate: "+ hit_rate);
     * System.out.println("Cache Miss Rate: "+ miss_rate);
     * 
     * scanner.close();
     * 
     * }catch(Exception e){
     * System.out.println(e);
     * }
     * }
     */

    public void addData(int data, FileWriter writer) {
        try {
            // Process the passed data
            if (findData(data) != -999) {
                int dataIndex = findData(data);
                ageUp(dataIndex);
                blocks.get(dataIndex).resetAge();
                cache_hit++;
            } else if (cache_blocks != blocks.size()) {
                ageUp(-999);
                blocks.add(new Block(data));
                cache_miss++;
            } else if (cache_blocks == blocks.size()) {
                int oldestIndex = findOldest();
                ageUp(oldestIndex);
                blocks.get(oldestIndex).replaceData(data);
                cache_miss++;
            }
            memory_access_count++;
            getAveMemAccessTime();

            hit_rate = (float) cache_hit / memory_access_count;
            miss_rate = (float) cache_miss / memory_access_count;

            writeTextLog(data, writer, memory_access_count == memory_blocks);

            // Display block step by step in console
            for (int j = 0; j < cache_blocks; j++) {
                try {
                    System.out.println(
                            "Block: " + j + " |Age: " + blocks.get(j).getAge() + " |Data: " + blocks.get(j).getData());
                }
                // If block is null or doesn't exist
                catch (IndexOutOfBoundsException e) {
                    System.out.println("Block: " + j + " |Age: " + " |Data: Empty");
                }
            }

            if (memory_access_count == memory_blocks) {
                System.out.println("Data input complete. Finalizing calculations...");
            }

            System.out.println("");
            System.out.println("Cache Hit Count: " + cache_hit);
            System.out.println("Cache Miss Count: " + cache_miss);
            System.out.println("Cache Hit Rate: " + hit_rate);
            System.out.println("Cache Miss Rate: " + miss_rate);
            System.out.println("Average Memory Access Time: " + getAveMemAccessTime());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // return index of oldest block
    public int findOldest() {
        int temp = -999;
        int i;
        int index = -999;

        for (i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).getAge() > temp) {
                temp = blocks.get(i).getAge();
                index = i;
            }

        }

        return index;
    }

    public int findData(int data) {
        int i;
        for (i = 0; i < blocks.size(); i++) {
            if (data == blocks.get(i).getData())
                return i;
        }
        return -999; // not found
    }

    public void ageUp(int index) {

        // int oldest= blocks.get(findOldest()).getAge();
        int i;
        int age;
        if (index != -999) {
            age = blocks.get(index).getAge();
            // System.out.println(age);
        } else
            age = -9999;

        // age up
        for (i = 0; i < blocks.size(); i++) {
            // age everything
            if (index == -999) {
                blocks.get(i).addAge();
            }
            // age younger than the block at index
            else if (index != -999 && blocks.get(i).getAge() < age) {
                blocks.get(i).addAge();
            }
        }

    }

    public float getAveMemAccessTime() {
        // load through
        float miss_penalty = 1 + 10 + 1; // load through
        float ave_access_time = hit_rate + miss_rate * miss_penalty;
        return ave_access_time;
    }
    public float getTotalMemAccessTime() {
        return memory_access_count * getAveMemAccessTime();
    }

    public void writeTextLog(int data, FileWriter writer, boolean done) {
        try {
            writer.write("Data Input: " + data + "\n");
            for (int j = 0; j < cache_blocks; j++) {
                try {
                    writer.write("Block: " + j + " |Age:" + blocks.get(j).getAge() + " |Data: "
                            + blocks.get(j).getData() + "\n");
                }
                // If block is null or doesn't exist
                catch (IndexOutOfBoundsException e) {
                    writer.write("Block: " + j + " |Age: " + " |Data: Empty" + "\n");
                }
            }
            writer.write("\n");
            if (done) {
                writer.write("\nCache Hit Count: " + cache_hit + "\n");
                writer.write("Cache Miss Count: " + cache_miss + "\n");
                writer.write("Cache Hit Rate: " + hit_rate + "\n");
                writer.write("Cache Miss Rate: " + miss_rate + "\n");
                writer.write("Average Memory Access Time:" + ave_access_time + "\n");
                writer.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void incrementCacheHit() {
        cache_hit++;
        memory_access_count++;
    }

    public void incrementCacheMiss() {
        cache_miss++;
        memory_access_count++;
    }

    public void updateRates() {
        hit_rate = (float) cache_hit / memory_access_count;
        miss_rate = (float) cache_miss / memory_access_count;
    }

    public int getCacheBlocks() {
        return cache_blocks;
    }

    public int getCacheHit() {
        return cache_hit;
    }

    public int getCacheMiss() {
        return cache_miss;
    }

    public float getHitRate() {
        return hit_rate;
    }

    public float getMissRate() {
        return miss_rate;
    }

    public int getAccessCount() {
        return memory_access_count;
    }

}
