/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jcomboboxexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;

public class JComboBoxExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ejemplo de JComboBox");

        // Crear un arreglo de opciones para el JComboBox
        String[] options = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};

        // Crear una instancia de JComboBox y pasar el arreglo de opciones
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Crear una etiqueta para mostrar el texto seleccionado
        JLabel selectionLabel = new JLabel("Selección:");

        // Crear un botón para obtener la selección
        JButton getSelectionButton = new JButton("Obtener Selección");
        getSelectionButton.addActionListener(e -> {
            String selectedOption = (String) comboBox.getSelectedItem();
            selectionLabel.setText("Selección: " + selectedOption);
        });

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.add(comboBox);
        panel.add(getSelectionButton);
        panel.add(selectionLabel);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Establecer el tamaño de la ventana
        frame.setSize(300, 150);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }
}

