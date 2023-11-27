import java.io.FileReader;
import java.util.*;
import javax.swing.JFrame;
/*
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
		System.out.println("Enter number of memory blocks:");
        
        int memory_blocks =scanner.nextInt();
        Cache cache=new Cache(memory_blocks);
        cache.addData();
        scanner.close();
        javax.swing.SwingUtilities.invokeLater(() -> new MainView(memory_blocks));
	}

}*/

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new MainView());
    }
}
