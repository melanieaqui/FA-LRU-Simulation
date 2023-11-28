import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class MainView {
    private JFrame mainFrame;
    private JTextField memoryBlocksField, dataInputField;
    private JButton initializeButton, addButton;
    private JTextArea resultArea;
    private Cache cache;

    public MainView() {
        mainFrame = new JFrame("RA+LRU");
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        memoryBlocksField = new JTextField(10);
        dataInputField = new JTextField(10);
        initializeButton = new JButton("Initialize Cache");
        addButton = new JButton("Add Data");

        resultArea = new JTextArea(15, 50);
        resultArea.setEditable(false);

        // Set the initial state of dataInputField and addButton
        dataInputField.setEnabled(false);
        addButton.setEnabled(false);

        // Add components to the mainFrame
        mainFrame.add(new JLabel("Enter number of memory blocks:"));
        mainFrame.add(memoryBlocksField);
        mainFrame.add(initializeButton);
        mainFrame.add(new JLabel("Enter Data to Add:"));
        mainFrame.add(dataInputField);
        mainFrame.add(addButton);
        mainFrame.add(new JScrollPane(resultArea));

        // Action listener for the initialize button
        initializeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int memoryBlocks = Integer.parseInt(memoryBlocksField.getText());
                    cache = new Cache(memoryBlocks);
                    dataInputField.setEnabled(true);
                    addButton.setEnabled(true);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(mainFrame, "Please enter a valid integer for memory blocks.");
                }
            }
        });

        // Action listener for the add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int data = Integer.parseInt(dataInputField.getText());
                    addDataToCache(data);
                    displayCacheState();
                    dataInputField.setText(""); // Clear the field after adding data
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(mainFrame, "Please enter a valid integer for data.");
                }
            }
        });

        mainFrame.setVisible(true);
    }

    private void addDataToCache(int data) {
        try {
            FileWriter writer = new FileWriter("Log.txt", true); // Open the log file in append mode
            int dataIndex;

            // Check for cache hit
            if ((dataIndex = cache.findData(data)) != -999) {
                cache.ageUp(dataIndex);
                Cache.blocks.get(dataIndex).resetAge();
                cache.incrementCacheHit();
            }
            // Handle cache miss
            else {
                cache.ageUp(-999);
                if (cache.getCacheBlocks() != Cache.blocks.size()) {
                    Cache.blocks.add(new Block(data));
                } else {
                    int oldestIndex = cache.findOldest();
                    Cache.blocks.get(oldestIndex).replaceData(data);
                }
                cache.incrementCacheMiss();
            }

            // Update hit rate and miss rate
            cache.updateRates();

            // Log the current state
            cache.writeTextLog(data, writer, false);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayCacheState() {
        // Build the string representing the current cache state
        StringBuilder displayText = new StringBuilder();
    
        // Display each cache block
        for (int i = 0; i < cache.getCacheBlocks(); i++) {
            try {
                Block block = Cache.blocks.get(i);
                displayText.append("Block: ").append(i)
                           .append(" |Age: ").append(block.getAge())
                           .append(" |Data: ").append(block.getData()).append("\n");
            } catch (IndexOutOfBoundsException e) {
                displayText.append("Block: ").append(i).append(" |Age: ").append(" |Data: Empty").append("\n");
            }
        }
    
        // Display cache statistics
        displayText.append("\nMemory Access Count: ").append(cache.getAccessCount())
                   .append("\nCache Hit Count: ").append(cache.getCacheHit())
                   .append("\nCache Miss Count: ").append(cache.getCacheMiss())
                   .append("\nCache Hit Rate: ").append(cache.getHitRate())
                   .append("\nCache Miss Rate: ").append(cache.getMissRate())
                   .append("\n----------------------------------------\n");
    
        // Append the new results to the existing text
        resultArea.append(displayText.toString());
    }
    
}
