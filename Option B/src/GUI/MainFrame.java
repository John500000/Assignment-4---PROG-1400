package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {




    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,750,750);
        setTitle("Abc Zoo App");
        setLayout(new CardLayout());

        ChoosePanel chosseScreen = new ChoosePanel();
        add(chosseScreen);
    }
}
