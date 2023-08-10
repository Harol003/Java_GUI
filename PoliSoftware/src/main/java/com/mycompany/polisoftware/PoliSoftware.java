/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polisoftware;

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

public class PoliSoftware {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliSoftware - Información sobre Desarrollo de Software");

        // Establecer el tamaño del JFrame
        frame.setSize(600, 400);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (BorderLayout)
        frame.setLayout(new BorderLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para el título
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(Color.DARK_GRAY);
        JLabel etiquetaTitulo = new JLabel("Programa de Desarrollo de Software en Politécnico Internacional");
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        etiquetaTitulo.setForeground(Color.WHITE);
        panelTitulo.add(etiquetaTitulo);

        // Crear un panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 3, 10, 10)); // 1 fila, 3 columnas, espacios

        // Crear botones
        JButton botonInformacion = new JButton("Información");
        JButton botonCarreras = new JButton("Carreras");
        JButton botonContacto = new JButton("Contacto");

        // Agregar acción al botón de Información
        botonInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Información sobre el Programa de Desarrollo de Software");
            }
        });

        // Agregar acción al botón de Carreras
        botonCarreras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Carreras relacionadas con el Desarrollo de Software");
            }
        });

        // Agregar acción al botón de Contacto
        botonContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Información de contacto del Politécnico Internacional");
            }
        });

        // Agregar los botones al panel de botones
        panelBotones.add(botonInformacion);
        panelBotones.add(botonCarreras);
        panelBotones.add(botonContacto);

        // Agregar los paneles al JFrame
        frame.add(panelTitulo, BorderLayout.NORTH);
        frame.add(panelBotones, BorderLayout.CENTER);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
