/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polijlabel;

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

public class PoliJLabel {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliJLabel - Ejemplo de JLabel Completo");

        // Establecer el tamaño del JFrame
        frame.setSize(400, 300);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Establecer el diseño del JFrame (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta con texto
        JLabel etiqueta1 = new JLabel("Etiqueta con Texto");

        // Crear una etiqueta con texto y alineación a la derecha
        JLabel etiqueta2 = new JLabel("Etiqueta Derecha", SwingConstants.RIGHT);

        // Crear una etiqueta con texto, icono y alineación centrada
        ImageIcon icono = new ImageIcon("icono.png");
        JLabel etiqueta3 = new JLabel("Etiqueta con Icono", icono, SwingConstants.CENTER);

        // Establecer un tooltip a la etiqueta 3
        etiqueta3.setToolTipText("¡Esta etiqueta tiene un icono!");

        // Crear una etiqueta con texto y fuente personalizada
        JLabel etiqueta4 = new JLabel("Etiqueta con Fuente Personalizada");
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 16));

        // Crear una etiqueta con HTML formateado
        JLabel etiqueta5 = new JLabel("<html><b>Etiqueta HTML</b><br>Con<br>Múltiples<br>Líneas</html>");

        // Agregar las etiquetas al JFrame
        frame.add(etiqueta1);
        frame.add(etiqueta2);
        frame.add(etiqueta3);
        frame.add(etiqueta4);
        frame.add(etiqueta5);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
