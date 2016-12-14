package Attraction;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Attraction extends JFrame {
    private static int width;
    private static int height;
    private static int res;
    private Grid g;

    public Attraction() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int)screenSize.getWidth() / 2;
        height = (int)screenSize.getHeight() / 2;
        res = Toolkit.getDefaultToolkit().getScreenResolution() / 8;

        setTitle("Attraction: " + width + "x" + height + ", Res: " + res);
        //setPreferredSize(new Dimension(width, height));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        init();

        pack();
        validate();
        setVisible(true);
    }

    private void init() {
        g = new Grid(width, height, res);
        add(g);
    }

    public static void main(String[] args) {
        Attraction a = new Attraction();
    }
}
