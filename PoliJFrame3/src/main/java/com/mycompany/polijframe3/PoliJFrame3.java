/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polijframe3;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PoliJFrame3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo JFrame Politecnico Internacional");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    
                    try {
                        Image image = ImageIO.read(new File("background.jpg"));
                        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            frame.add(panel);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
