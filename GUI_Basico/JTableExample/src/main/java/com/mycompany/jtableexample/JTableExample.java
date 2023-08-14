/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jtableexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ejemplo de JTable");

        // Crear un modelo de datos de tabla
        DefaultTableModel tableModel = new DefaultTableModel();

        // Agregar columnas al modelo de datos
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Edad");
        tableModel.addColumn("País");

        // Agregar filas al modelo de datos
        tableModel.addRow(new Object[]{"Juan", 25, "España"});
        tableModel.addRow(new Object[]{"María", 30, "México"});
        tableModel.addRow(new Object[]{"Luis", 22, "Argentina"});

        // Crear una instancia de JTable con el modelo de datos
        JTable table = new JTable(tableModel);

        // Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Agregar el JScrollPane al JFrame
        frame.add(scrollPane);

        // Establecer el tamaño de la ventana
        frame.setSize(400, 300);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }
}

