/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jlistexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;

public class JListExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ejemplo de JList");

        // Crear un arreglo de elementos para el JList
        String[] items = {"Manzana", "Banana", "Cereza", "Damasco", "Uva"};

        // Crear una instancia de JList y pasar el arreglo de elementos
        JList<String> list = new JList<>(items);

        // Permitir selección múltiple en el JList
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Crear un JScrollPane y agregar el JList
        JScrollPane scrollPane = new JScrollPane(list);

        // Agregar el JScrollPane al JFrame
        frame.add(scrollPane);

        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }
}
