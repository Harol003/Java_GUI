/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poliframe2;

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

public class PoliFrame2 {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliFrame2 - Información sobre Desarrollo de Software");

        // Establecer el tamaño del JFrame
        frame.setSize(600, 400);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con GridLayout para organizar la información
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 filas, 2 columnas, espacios

        // Agregar etiquetas y campos de texto al panel
        JLabel etiquetaNombre = new JLabel("Nombre:");
        JTextField campoNombre = new JTextField(20);

        JLabel etiquetaCarrera = new JLabel("Carrera:");
        JTextField campoCarrera = new JTextField(20);

        JLabel etiquetaSemestre = new JLabel("Semestre:");
        JTextField campoSemestre = new JTextField(20);

        // Agregar los componentes al panel
        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(etiquetaCarrera);
        panel.add(campoCarrera);
        panel.add(etiquetaSemestre);
        panel.add(campoSemestre);

        // Crear un botón para guardar la información
        JButton botonGuardar = new JButton("Guardar");

        // Agregar acción al botón
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la información ingresada
                String nombre = campoNombre.getText();
                String carrera = campoCarrera.getText();
                String semestre = campoSemestre.getText();

                // Mostrar un mensaje con la información ingresada
                String mensaje = "Nombre: " + nombre + "\nCarrera: " + carrera + "\nSemestre: " + semestre;
                JOptionPane.showMessageDialog(frame, mensaje);
            }
        });

        // Agregar el panel al JFrame
        frame.add(panel);

        // Agregar el botón al JFrame
        frame.add(botonGuardar);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
