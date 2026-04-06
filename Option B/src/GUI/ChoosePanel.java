package GUI;

import javax.swing.*;
import java.awt.*;

public class ChoosePanel extends JPanel {

    private JRadioButton rdoCat;
    private JRadioButton rdoDog;
    private JRadioButton rdoLion;
    private JLabel myName;



    public ChoosePanel() {

        Font myFont = new Font("Courier", Font.BOLD, 20);

        setLayout(null);
        setVisible(true);



        rdoCat = new JRadioButton("Cat");
        rdoDog = new JRadioButton("Dog");
        rdoLion = new JRadioButton("Lion");

        rdoCat.setBounds(50, 150, 150, 45);
        rdoDog.setBounds(50, 210, 150, 45);
        rdoLion.setBounds(50, 270, 150, 45);

        ButtonGroup grpAnimalRadios = new ButtonGroup();
        grpAnimalRadios.add(rdoCat);
        grpAnimalRadios.add(rdoDog);
        grpAnimalRadios.add(rdoLion);


        JLabel myName = new JLabel("Done by John Warren. W0241228.");
        myName.setFont(myFont);
        myName.setBounds(100, 350, 350, 50);

        add(myName);
        add(rdoCat);
        add(rdoDog);
        add(rdoLion);


        setBackground(Color.green);



    }

    public JRadioButton getRdoCat() {
        return rdoCat;
    }

    public JRadioButton getRdoDog() {
        return rdoDog;
    }

    public JRadioButton getRdoLion() {
        return rdoLion;
    }
}
