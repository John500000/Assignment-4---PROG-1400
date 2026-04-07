import java.awt.*;
import GUI.MainFrame;

// My GITHUB site for Assignment 4: https://github.com/John500000/Assignment-4---PROG-1400
public class Main {

  public static void main() {
    EventQueue.invokeLater(new Runnable() {

      public void run() {
        try {
          MainFrame frame = new MainFrame();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
}
