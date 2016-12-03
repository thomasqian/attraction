package Attraction;

import javax.swing.*;

public class Attraction extends JFrame {
    private static int width = 400;
    private static int height = 400;
    private Grid g;

    public Attraction() {
        setTitle("Attraction");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        init();

        setVisible(true);
    }

    private void init() {
        g = new Grid(width, height);
        add(g);
    }

    public static void main(String[] args) {
        Attraction a = new Attraction();
    }
}
