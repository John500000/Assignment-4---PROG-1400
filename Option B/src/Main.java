import java.awt.*;
import GUI.MainFrame;

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
