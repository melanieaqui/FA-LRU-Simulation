import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of memory blocks:");

        int memory_blocks =scanner.nextInt();
        Cache cache=new Cache(memory_blocks);
        cache.addData();
        scanner.close();

	}

}
