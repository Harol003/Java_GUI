/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jframeexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;

public class JFrameExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("|Politecnico Internacional | Ejemplo de JFrame");

        // Establecer el tamaño de la ventana (ancho x alto en píxeles)
        frame.setSize(600, 150);
      
        // Establecer la operación de cierre predeterminada cuando se hace clic en el botón de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un componente JLabel (etiqueta)
        JLabel label = new JLabel("¡Politecnico Internacional, Programacion I!");

        // Agregar el componente JLabel al contenido del JFrame
        frame.getContentPane().add(label);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }
}
