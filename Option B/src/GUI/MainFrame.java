package GUI;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private Cat theCat;
    private Dog theDog;
    private Lion theLion;

    //private Cat changeCatImage = null;


    public MainFrame() {

        theCat = new Cat("Cat", "Mountains", 70, true, 10);
        theDog = new Dog("Dog","Home",200,false,"Husky");
        theLion = new Lion("Lion","Jungle",800,true,100);

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
                displayScreen.getImageLabel().setIcon(theCat.getCatPic());
                chooseScreen.setVisible(false);
                displayScreen.setVisible(true);
            }
        });

        JRadioButton rdoDog = chooseScreen.getRdoDog();
        rdoDog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                displayScreen.getImageLabel().setIcon(theDog.getDogPic());
                chooseScreen.setVisible(false);
                displayScreen.setVisible(true);
            }
        });

        JRadioButton rdoLion = chooseScreen.getRdoLion();
        rdoLion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                displayScreen.getImageLabel().setIcon(theLion.getLionPic());
                chooseScreen.setVisible(false);
                displayScreen.setVisible(true);
            }
        });
    }
}
