/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polijbutton;

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

public class PoliJButton {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliJButton - Ejemplo de JButton Completo");

        // Establecer el tamaño del JFrame
        frame.setSize(400, 300);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un botón
        JButton boton1 = new JButton("Botón Normal");

        // Crear un botón con texto y un icono
        ImageIcon icono = new ImageIcon("icono.png");
        JButton boton2 = new JButton("Botón con Icono", icono);

        // Crear un botón deshabilitado
        JButton boton3 = new JButton("Botón Deshabilitado");
        boton3.setEnabled(false);

        // Crear un botón con un tooltip
        JButton boton4 = new JButton("Botón con Tooltip");
        boton4.setToolTipText("¡Pasa el cursor aquí!");

        // Agregar acción al botón 1
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Has hecho clic en el Botón Normal");
            }
        });

        // Agregar acción al botón 2
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Has hecho clic en el Botón con Icono");
            }
        });

        // Agregar el botón 1 al JFrame
        frame.add(boton1);

        // Agregar el botón 2 al JFrame
        frame.add(boton2);

        // Agregar el botón 3 al JFrame
        frame.add(boton3);

        // Agregar el botón 4 al JFrame
        frame.add(boton4);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
