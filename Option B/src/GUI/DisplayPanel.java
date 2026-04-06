package GUI;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextField speciesText;
    private JTextField foodText;

    public DisplayPanel() {

        Font myFont = new Font("Courier", Font.BOLD, 20);

        setLayout(null);

        JLabel speciesLabel = new JLabel("Species:");
        speciesLabel.setFont(myFont);
        speciesLabel.setBounds(30,30,180,50);

        JLabel foodLabel = new JLabel("Amount of Food:");
        foodLabel.setFont(myFont);
        foodLabel.setBounds(30,100,180,50);

        speciesText = new JTextField();
        speciesText.setBounds(220,30,150,50);
        speciesText.setFont(myFont);

        foodText = new JTextField();
        foodText.setBounds(220,100,150,50);
        foodText.setFont(myFont);

        add(speciesLabel);
        add(foodLabel);
        add(speciesText);
        add(foodText);

    }


}
