/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polisoftware2;

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

public class PoliSoftware2 {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliSoftware2 - Información sobre Desarrollo de Software");

        // Establecer el tamaño del JFrame
        frame.setSize(400, 300);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cambiar el color de fondo a azul rey
        frame.getContentPane().setBackground(new Color(0, 51, 102));

        // Crear una etiqueta con texto
        JLabel etiquetaTitulo = new JLabel("Programa de Desarrollo de Software");
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        etiquetaTitulo.setForeground(Color.WHITE);

        // Crear una etiqueta con texto y alineación centrada
        JLabel etiquetaSubtitulo = new JLabel("Politécnico Internacional - Desarrollo de Software");
        etiquetaSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaSubtitulo.setForeground(Color.WHITE);

        // Crear un botón para obtener más información
        JButton botonInfo = new JButton("Más Información");
        botonInfo.setBackground(Color.BLACK);
        botonInfo.setForeground(Color.WHITE);

        // Agregar acción al botón de Más Información
        botonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "El Programa de Desarrollo de Software te brinda las habilidades necesarias\n" +
                        "para una exitosa carrera en el mundo del software.\n\n" +
                        "¡Explora las oportunidades que te esperan!",
                        "Información Detallada", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar las etiquetas y el botón al JFrame
        frame.add(etiquetaTitulo);
        frame.add(etiquetaSubtitulo);
        frame.add(botonInfo);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
