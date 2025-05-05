/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;

// Vista: Interfaz gráfica para registrar estudiantes
public class RegistroView extends JFrame {
    public JTextField campoNombre;
    public JTextField campoEdad;
    public JButton botonAgregar;
    public JTextArea areaResultado;

    public RegistroView() {
        setTitle("Registro de Estudiantes");
        setSize(350, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(20, 20, 80, 25);
        add(etiquetaNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(100, 20, 200, 25);
        add(campoNombre);

        JLabel etiquetaEdad = new JLabel("Edad:");
        etiquetaEdad.setBounds(20, 60, 80, 25);
        add(etiquetaEdad);

        campoEdad = new JTextField();
        campoEdad.setBounds(100, 60, 200, 25);
        add(campoEdad);

        botonAgregar = new JButton("Agregar");
        botonAgregar.setBounds(100, 100, 100, 30);
        add(botonAgregar);

        areaResultado = new JTextArea();
        areaResultado.setBounds(20, 140, 300, 100);
        areaResultado.setEditable(false);
        add(areaResultado);
    }
}
