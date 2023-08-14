/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polijframe;

/*
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliJFrame {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliJFrame - Ejemplo de JFrame Completo");

        // Establecer el tamaño del JFrame
        frame.setSize(600, 400);

        // Establecer el color de fondo del JFrame (verde claro)
        frame.getContentPane().setBackground(new Color(144, 238, 144));

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el icono de la ventana
        ImageIcon icono = new ImageIcon("icono.png");
        frame.setIconImage(icono.getImage());

        // Establecer el diseño de la ventana (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Establecer el diseño del panel como GridLayout
        panel.setLayout(new GridLayout(3, 1, 10, 10)); // 3 filas, 1 columna, espacio horizontal y vertical

        // Crear etiquetas
        JLabel etiqueta1 = new JLabel("Bienvenido a PoliJFrame");
        JLabel etiqueta2 = new JLabel("Este es un ejemplo completo de JFrame en Java.");
        JLabel etiqueta3 = new JLabel("¡Disfruta aprendiendo!");

        // Establecer alineación de las etiquetas al centro
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);

        // Agregar las etiquetas al panel
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(etiqueta3);

        // Crear un botón
        JButton boton = new JButton("Cerrar");

        // Agregar acción al botón para cerrar la ventana
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación
            }
        });

        // Agregar el botón al panel
        panel.add(boton);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
