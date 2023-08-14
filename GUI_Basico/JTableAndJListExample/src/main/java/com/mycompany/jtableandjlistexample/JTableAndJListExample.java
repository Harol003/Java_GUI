/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jtableandjlistexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class JTableAndJListExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ejemplo de JTable y JList");

        // Crear datos para el JTable
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Nombre");
        columnNames.add("Edad");
        columnNames.add("Género");

        Vector<Vector<Object>> data = new Vector<>();
        Vector<Object> row1 = new Vector<>();
        row1.add("Goku");
        row1.add(35);
        row1.add("Masculino");
        Vector<Object> row2 = new Vector<>();
        row2.add("Vegeta");
        row2.add(40);
        row2.add("Masculino");
        data.add(row1);
        data.add(row2);

        // Crear un modelo de datos para el JTable
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Crear un JTable con el modelo de datos
        JTable table = new JTable(tableModel);

        // Crear un JScrollPane para el JTable
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Crear datos para el JList
        String[] listData = {"Goku", "Vegeta", "Gohan", "Piccolo", "Trunks"};

        // Crear un JList con los datos
        JList<String> list = new JList<>(listData);

        // Crear un JScrollPane para el JList
        JScrollPane listScrollPane = new JScrollPane(list);

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(tableScrollPane);
        panel.add(listScrollPane);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Establecer el tamaño de la ventana
        frame.setSize(600, 300);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }
}
