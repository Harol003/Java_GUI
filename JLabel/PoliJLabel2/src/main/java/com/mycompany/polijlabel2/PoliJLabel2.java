/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polijlabel2;

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

public class PoliJLabel2 {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliJLabel2 - Información sobre Desarrollo de Software");

        // Establecer el tamaño del JFrame
        frame.setSize(400, 300);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta con texto simple
        JLabel etiquetaTitulo = new JLabel("Programa de Desarrollo de Software");
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        // Crear una etiqueta con texto y alineación centrada
        JLabel etiquetaSubtitulo = new JLabel("Bienvenido al Politécnico Internacional");
        etiquetaSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);

        // Crear una etiqueta con texto HTML formateado
        JLabel etiquetaHTML = new JLabel("<html><p style='text-align:center;'>Explora nuestro programa de<br>Desarrollo de Software<br>para una carrera exitosa.</p></html>");

        // Crear una etiqueta con icono
        ImageIcon icono = new ImageIcon("icono.png");
        JLabel etiquetaIcono = new JLabel(icono);

        // Crear un botón para obtener más información
        JButton botonInfo = new JButton("Más Información");

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
        frame.add(etiquetaHTML);
        frame.add(etiquetaIcono);
        frame.add(botonInfo);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
