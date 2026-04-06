package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {




    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,500,650);
        setTitle("Abc Zoo App");
        setLayout(new CardLayout());

        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        add(chooseScreen);
        add(displayScreen);

        JRadioButton rdoCat = chooseScreen.getRdoCat();
        rdoCat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                chooseScreen.setVisible(false);
                //chooseScreen.createShape();
                //displayScreen.displayChoice();
                displayScreen.setVisible(true);
            }
        });

        JRadioButton rdoDog = chooseScreen.getRdoDog();
        rdoDog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                chooseScreen.setVisible(false);
                //chooseScreen.createShape();
                //displayScreen.displayChoice();
                displayScreen.setVisible(true);
            }
        });

        JRadioButton rdoLion = chooseScreen.getRdoLion();
        rdoLion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                chooseScreen.setVisible(false);
                //chooseScreen.createShape();
                //displayScreen.displayChoice();
                displayScreen.setVisible(true);
            }
        });
    }
}
