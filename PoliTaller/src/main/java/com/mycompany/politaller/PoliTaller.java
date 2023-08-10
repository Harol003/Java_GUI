/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.politaller;

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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PoliTaller {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Estadísticas de Estudiantes Programacion - PoliTecnico Internacional");

        // Configurar el tamaño de la ventana
        frame.setSize(600, 400);

        // Configurar la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear una tabla
        String[] columnas = {"Año", " Estudiantes que aprobaron", "Estudiantes que reprobaron", "Estudiantes que aplazaron", "Promedio (%)"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modelo);

        // Centrar el contenido de las celdas de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabla.setDefaultRenderer(Object.class, centerRenderer);

        // Crear botón para agregar datos
        JButton botonAgregarDatos = new JButton("Agregar Datos de Estudiantes Aleatorio");

        // Agregar tabla al panel
        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(botonAgregarDatos, BorderLayout.SOUTH);

        // Agregar panel a la ventana
        frame.add(panel);

        // Mostrar la ventana en la pantalla
        frame.setVisible(true);

        // Acción del botón para agregar datos
        botonAgregarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generar datos aleatorios para los estudiantes
                Random random = new Random();
                int aprobados1 = random.nextInt(71);
                int reprobados1 = random.nextInt(71 - aprobados1);
                int aplazados1 = 70 - aprobados1 - reprobados1;

                int aprobados2 = random.nextInt(71);
                int reprobados2 = random.nextInt(71 - aprobados2);
                int aplazados2 = 70 - aprobados2 - reprobados2;

                int totalAprobados = aprobados1 + aprobados2;
                int totalEstudiantes = totalAprobados + reprobados1 + reprobados2 + aplazados1 + aplazados2;

                double promedioSuperados = (double) totalAprobados / totalEstudiantes * 100;

                // Agregar datos a la tabla
                modelo.addRow(new Object[]{"Año 1", aprobados1, reprobados1, aplazados1, String.format("%.2f", promedioSuperados)});
                modelo.addRow(new Object[]{"Año 2", aprobados2, reprobados2, aplazados2, ""});
            }
        });
    }
}

