/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.politaller2;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PoliTaller2 {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Estadísticas de Estudiantes - PoliTaller");

        // Configurar el tamaño de la ventana
        frame.setSize(400, 300);

        // Configurar la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10)); // Filas, Columnas, Espacio entre celdas

        // Crear etiquetas y campos de texto
        JLabel etiquetaAprobados1 = new JLabel("Aprobados Año 1:");
        JTextField campoAprobados1 = new JTextField();

        JLabel etiquetaReprobados1 = new JLabel("Reprobados Año 1:");
        JTextField campoReprobados1 = new JTextField();

        JLabel etiquetaAplazados1 = new JLabel("Aplazados Año 1:");
        JTextField campoAplazados1 = new JTextField();

        JLabel etiquetaAprobados2 = new JLabel("Aprobados Año 2:");
        JTextField campoAprobados2 = new JTextField();

        JLabel etiquetaReprobados2 = new JLabel("Reprobados Año 2:");
        JTextField campoReprobados2 = new JTextField();

        JLabel etiquetaAplazados2 = new JLabel("Aplazados Año 2:");
        JTextField campoAplazados2 = new JTextField();

        // Crear botón para calcular promedio
        JButton botonCalcularPromedio = new JButton("Calcular Promedio");

        // Agregar componentes al panel
        panel.add(etiquetaAprobados1);
        panel.add(campoAprobados1);
        panel.add(etiquetaReprobados1);
        panel.add(campoReprobados1);
        panel.add(etiquetaAplazados1);
        panel.add(campoAplazados1);
        panel.add(etiquetaAprobados2);
        panel.add(campoAprobados2);
        panel.add(etiquetaReprobados2);
        panel.add(campoReprobados2);
        panel.add(etiquetaAplazados2);
        panel.add(campoAplazados2);

        // Agregar panel al centro de la ventana
        frame.add(panel, BorderLayout.CENTER);

        // Agregar botón en la parte inferior de la ventana
        frame.add(botonCalcularPromedio, BorderLayout.SOUTH);

        // Mostrar la ventana en la pantalla
        frame.setVisible(true);

        // Acción del botón para calcular el promedio
        botonCalcularPromedio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generar datos aleatorios para los estudiantes
                Random random = new Random();
                int aprobados1 = Integer.parseInt(campoAprobados1.getText());
                int reprobados1 = Integer.parseInt(campoReprobados1.getText());
                int aplazados1 = Integer.parseInt(campoAplazados1.getText());
                int aprobados2 = Integer.parseInt(campoAprobados2.getText());
                int reprobados2 = Integer.parseInt(campoReprobados2.getText());
                int aplazados2 = Integer.parseInt(campoAplazados2.getText());

                int totalAprobados = aprobados1 + aprobados2;
                int totalEstudiantes = totalAprobados + reprobados1 + reprobados2 + aplazados1 + aplazados2;

                double promedioSuperados = (double) totalAprobados / totalEstudiantes * 100;

                JOptionPane.showMessageDialog(frame,
                        "Promedio de estudiantes que han superado el curso: " + promedioSuperados + "%",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
