package GUI;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextField speciesText;
    private JTextField foodText;
    private JLabel imageLabel;
    private JButton backBtn;
    private JTextArea bigString;

    public DisplayPanel() {

        Font myFont = new Font("Courier", Font.BOLD, 20);

        setLayout(null);

        JLabel speciesLabel = new JLabel("Species:");
        speciesLabel.setFont(myFont);
        speciesLabel.setBounds(30,30,180,50);

        JLabel foodLabel = new JLabel("Amount of Food:");
        foodLabel.setFont(myFont);
        foodLabel.setBounds(30,80,180,50);

        speciesText = new JTextField();
        speciesText.setBounds(220,30,150,50);
        speciesText.setFont(myFont);

        foodText = new JTextField();
        foodText.setBounds(220,80,150,50);
        foodText.setFont(myFont);

        imageLabel = new JLabel();
        imageLabel.setBounds(30,140,200,200);

        backBtn = new JButton();
        backBtn.setFont(myFont);
        backBtn.setText("Go Back");
        backBtn.setBounds(160,500,200,50);

        bigString = new JTextArea();
        bigString.setFont(myFont);
        bigString.setBounds(30,350,400,100);
        bigString.setLineWrap(true);
        bigString.setWrapStyleWord(true);

        add(speciesLabel);
        add(foodLabel);
        add(speciesText);
        add(foodText);
        add(imageLabel);
        add(backBtn);
        add(bigString);

    }

    public JLabel getImageLabel() {
        return imageLabel;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

    public void genDisplay(String a,float b,String c) {
        speciesText.setText(a);
        foodText.setText(String.format("%.2f",b*0.15) +"LB");
        bigString.setText(c);

    }
}
