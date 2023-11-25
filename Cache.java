import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cache{
    private int memory_blocks;
    private int cache_blocks = 4; //for testing purposes
    static List<Block> blocks = new ArrayList<Block>();
    public Cache(int memory_blocks){
        this.memory_blocks=memory_blocks;
    }
    public void addData(){
        int cache_hit = 0;
        int cache_miss = 0;
        float hit_rate;
        float miss_rate;
        Scanner scanner = new Scanner(System.in);
        int data;
        for (int i=0;i<memory_blocks; i++){
            //user input Data
            System.out.println("Enter Data");

            data = scanner.nextInt(); 

            //hit
            if(findData(data)!=-999){
                int dataIndex = findData(data);
                ageUp(dataIndex);
                blocks.get(dataIndex).resetAge(); 
                cache_hit++;
            }      
            //not yet full
            else if (cache_blocks!=blocks.size()){
                //miss
                if(findData(data) == -999)  {
                ageUp(-999);
                blocks.add(new Block(data));
                cache_miss++;
            }
            
            }
            //data is full and not hit so replace oldest 
            else if (cache_blocks == blocks.size()){
                int oldestIndex =findOldest();
                ageUp(oldestIndex);
                blocks.get(oldestIndex).replaceData(data);
                cache_miss++;
            }
           //display block step by step
            for (int j = 0; j< cache_blocks;j++){
                try{
                    System.out.println("Block: "+j+" |Age:"+blocks.get(j).getAge()+" |Data: "+ blocks.get(j).getData());

                }
                catch(IndexOutOfBoundsException e) {
                    System.out.println("Block: "+j+ " |Age:  "+ "|Data: Empty");
                }
            }      
            
        }
        System.out.println("");
        hit_rate = (float)cache_hit/memory_blocks;
        miss_rate = (float)cache_miss/memory_blocks;

        System.out.println("Cache hit count: "+cache_hit);
        System.out.println("Cache miss count: "+cache_miss);
        
        System.out.println("Cache hit rate: "+ hit_rate);
        System.out.println("Cache miss count: "+ miss_rate);

        scanner.close();
        

    }
    
    //return index of oldest block
    private  int findOldest(){
        int temp = -999;
        int i;
        int index=-999;

        for(i=0;i<blocks.size();i++){
            if (blocks.get(i).getAge()>temp){
                temp = blocks.get(i).getAge();
                index=i;
            }
               
        }

        return index;
    }
    private static int findData(int data){
        int i;
        for(i=0;i<blocks.size();i++){
            if(data== blocks.get(i).getData())
                return i;
        }
        return -999; //not found
    }
    
    private static void ageUp(int index){
        
        //int oldest= blocks.get(findOldest()).getAge();
        int i;
        int age;
        if (index!=-999){
            age= blocks.get(index).getAge();
            //System.out.println(age);
        }
        else
            age=-9999;

        //age up 
        for (i=0;i<blocks.size();i++){ 
            //age everything
            if (index ==-999){
                blocks.get(i).addAge();
            }
            //age younger than the block at index
            else if(index!=-999 && blocks.get(i).getAge()<age){
                 blocks.get(i).addAge();
            }
        }
        
    }

}