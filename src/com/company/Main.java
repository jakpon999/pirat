package com.company;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedImage img = ImageIO.read(Main.class.getResourceAsStream("pirat.jpg"));
        ImageIcon icon = new ImageIcon(img);

        JFrame frame = new JFrame();
        frame.setSize(500, 742);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel();
        label.setIcon(icon);

        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
