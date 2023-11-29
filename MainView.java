import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainView {
    private JFrame mainFrame = new JFrame("FA+LRU");
    private JTextField memoryBlocksField;
    private JTextField dataInputField;
    private JButton initializeButton;
    private JButton addButton;
    private JTextArea resultArea;
    private Cache cache;

    public MainView() {
        this.mainFrame.setLayout(new FlowLayout());
        this.mainFrame.setSize(600, 400);
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.memoryBlocksField = new JTextField(10);
        this.dataInputField = new JTextField(10);
        this.initializeButton = new JButton("Initialize Cache");
        this.addButton = new JButton("Add Data(Separate with Spaces)");
        this.resultArea = new JTextArea(15, 50);
        this.resultArea.setEditable(false);
        this.dataInputField.setEnabled(false);
        this.addButton.setEnabled(false);
        this.mainFrame.add(new JLabel("Enter number of memory blocks:"));
        this.mainFrame.add(this.memoryBlocksField);
        this.mainFrame.add(this.initializeButton);
        this.mainFrame.add(new JLabel("Enter Data to Add:"));
        this.mainFrame.add(this.dataInputField);
        this.mainFrame.add(this.addButton);
        this.mainFrame.add(new JScrollPane(this.resultArea));

        this.initializeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int memoryBlocks = Integer.parseInt(MainView.this.memoryBlocksField.getText());
                    MainView.this.cache = new Cache(memoryBlocks);
                    MainView.this.dataInputField.setEnabled(true);
                    MainView.this.addButton.setEnabled(true);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(MainView.this.mainFrame,
                            "Please enter a valid integer for memory blocks.");
                }
            }
        });

        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputData = MainView.this.dataInputField.getText();
                MainView.this.addDataToCache(inputData);
                MainView.this.displayCacheState();
                MainView.this.dataInputField.setText("");
            }
        });
        this.mainFrame.setVisible(true);
    }

    private void addDataToCache(String inputData) {
        // Split the input data by spaces
        String[] dataItems = inputData.split("\\s+");
        try (FileWriter writer = new FileWriter("Log.txt", true)) {
            for (String item : dataItems) {
                try {
                    int data = Integer.parseInt(item);
                    this.cache.addData(data, writer);
                } catch (NumberFormatException e) {
                    // Handle the case where the input is not a valid integer
                    System.out.println("Invalid input: " + item);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayCacheState() {
        StringBuilder displayText = new StringBuilder();
        for (int i = 0; i < this.cache.getCacheBlocks(); i++) {
            try {
                Block block = Cache.blocks.get(i);
                displayText.append("Block: ").append(i)
                        .append(" |Age: ").append(block.getAge())
                        .append(" |Data: ").append(block.getData()).append("\n");
            } catch (IndexOutOfBoundsException e) {
                displayText.append("Block: ").append(i).append(" |Age: ").append(" |Data: Empty").append("\n");
            }
        }
        displayText.append("\nMemory Access Count: ").append(this.cache.getAccessCount())
                .append("\nCache Hit Count: ").append(this.cache.getCacheHit())
                .append("\nCache Miss Count: ").append(this.cache.getCacheMiss())
                .append("\nCache Hit Rate: ").append(this.cache.getHitRate())
                .append("\nCache Miss Rate: ").append(this.cache.getMissRate())
                .append("\nAverage Memory Access Time:").append(this.cache.getAveMemAccessTime())
                .append("\nTotal Memory Access Time: ").append(this.cache.getTotalMemoryAccessTime()).append("\n")
                .append("\n----------------------------------------\n");
        this.resultArea.append(displayText.toString());
    }
}
