package GUI;

import javax.swing.*;
import java.awt.*;

public class ChoosePanel extends JPanel {

//    private JRadioButton rdoCat;
//    private JRadioButton rdoDog;
//    private JRadioButton rdoLion;
//    private JLabel myName;

    public ChoosePanel() {

        Font myFont = new Font("Courier", Font.BOLD, 20);

        setLayout(null);
        setVisible(true);

//        add(rdoCat);
//        add(rdoDog);
//        add(rdoLion);

        JRadioButton rdoCat = new JRadioButton("Cat");
        JRadioButton rdoDog = new JRadioButton("Dog");
        JRadioButton rdoLion = new JRadioButton("Lion");

        rdoCat.setBounds(50,200,150,50);
        rdoDog.setBounds(50,250,150,50);
        rdoLion.setBounds(50,250,150,50);

        ButtonGroup grpAnimalRadios = new ButtonGroup();
        grpAnimalRadios.add(rdoCat);
        grpAnimalRadios.add(rdoDog);
        grpAnimalRadios.add(rdoLion);


        JLabel myName = new JLabel("Done by John Warren. W0241228.");
        myName.setFont(myFont);
        myName.setBounds(50, 350, 250, 50);



    }


}
