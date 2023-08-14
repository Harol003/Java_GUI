/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jprogressbarexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ejemplo de JProgressBar");

        // Crear un JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100); // Rango del progreso (0 a 100)
        progressBar.setValue(0); // Establecer el valor inicial del progreso
        progressBar.setStringPainted(true); // Mostrar el valor numérico del progreso

        // Crear un JButton para simular el progreso
        JButton startButton = new JButton("Iniciar Progreso");

        // Agregar un ActionListener al JButton
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startProgressBar(progressBar);
            }
        });

        // Crear un JPanel para organizar los componentes
        JPanel panel = new JPanel();
        panel.add(progressBar);
        panel.add(startButton);

        // Agregar el JPanel al JFrame
        frame.add(panel);

        // Establecer el tamaño de la ventana
        frame.setSize(300, 150);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }

    // Método para simular el progreso
    private static void startProgressBar(JProgressBar progressBar) {
        int progress = 0;
        while (progress <= 100) {
            progressBar.setValue(progress);
            try {
                Thread.sleep(100); // Simular un proceso que lleva tiempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progress += 10; // Incrementar el progreso en 10 unidades
        }
    }
}
