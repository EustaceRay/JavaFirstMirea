package ru.mirea.task12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Art {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1080,1040));
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(args[0]));
        }catch(Exception e){
            System.out.println(e);
        }
        if("C:\\Users\\prizm\\Desktop\\Animation\\1.png"!=null) {
            JLabel picLabel = new JLabel(new ImageIcon("C:\\Users\\prizm\\Desktop\\Animation\\1.png"));

            frame.getContentPane().add(picLabel);
            frame.pack();
        }
        frame.setVisible(true);
    }
}