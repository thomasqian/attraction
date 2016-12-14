package Attraction;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;

public class Attraction extends JFrame {
  private static int width;
  private static int height;
  private static int res;
  private Controller c;
  private Grid g;

  public Attraction() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    width = (int)screenSize.getWidth() / 2;
    height = (int)screenSize.getHeight() / 2;
    res = Toolkit.getDefaultToolkit().getScreenResolution() / 8;

    setTitle("Attraction: " + width + "x" + height + ", Res: " + res);
    setLayout(new BorderLayout());
    //setPreferredSize(new Dimension(width, height));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    init();

    pack();
    validate();
    setResizable(false);
    setVisible(true);
  }

  private void init() {
    c = new Controller(width / 4, height);
    g = new Grid(width * 3 / 4, height, res, c);
    c.setGrid(g);
    add(g, BorderLayout.CENTER);
    add(c, BorderLayout.EAST);
  }

  public static void main(String[] args) {
    Attraction a = new Attraction();
  }
}
