/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polijbutton2;

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

public class PoliJButton2 {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Politecnico Internacional - Información sobre Desarrollo de Software");

        // Establecer el tamaño del JFrame
        frame.setSize(400, 300);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un botón para mostrar información general
        JButton botonInfo = new JButton("Información General");

        // Agregar acción al botón de Información General
        botonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Bienvenido al Programa de Desarrollo de Software en Politécnico Internacional.\n" +
                        "Este programa te preparará para una carrera exitosa en el mundo del software.",
                        "Información General", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Crear un botón para ver carreras ofrecidas
        JButton botonCarreras = new JButton("Carreras Ofrecidas");

        // Agregar acción al botón de Carreras Ofrecidas
        botonCarreras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] carreras = {"Ingeniería en Desarrollo de Software", "Ingeniería en Sistemas de Información",
                                    "Tecnología en Desarrollo de Aplicaciones Móviles"};
                JOptionPane.showMessageDialog(frame, carreras, "Carreras Ofrecidas", JOptionPane.PLAIN_MESSAGE);
            }
        });

        // Crear un botón para contactar al departamento
        JButton botonContacto = new JButton("Contacto");

        // Agregar acción al botón de Contacto
        botonContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Para más información, comuníquese con:\n" +
                        "Departamento de Desarrollo de Software\n" +
                        "Teléfono: 123-456-7890\n" +
                        "Email: harol.torres@pi.edu.co",
                        "Contacto", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar los botones al JFrame
        frame.add(botonInfo);
        frame.add(botonCarreras);
        frame.add(botonContacto);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
