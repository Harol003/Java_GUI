/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;

// Vista: Interfaz gráfica para votar
public class VotacionView extends JFrame {
    public JRadioButton botonMaximus;
    public JRadioButton botonZara;
    public JRadioButton botonRex;
    public JButton botonVotar;
    public JTextArea areaResultados;
    private ButtonGroup grupoBotones;

    public VotacionView() {
        setTitle("Simulador de Votación");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botones de selección para los candidatos
        botonMaximus = new JRadioButton("Goku");
        botonZara = new JRadioButton("Pikoro");
        botonRex = new JRadioButton("Vegeta");

        // Agrupar los botones para que solo uno se pueda seleccionar a la vez
        grupoBotones = new ButtonGroup();
        grupoBotones.add(botonMaximus);
        grupoBotones.add(botonZara);
        grupoBotones.add(botonRex);

        // Botón para votar
        botonVotar = new JButton("Votar");

        // Área para mostrar los resultados
        areaResultados = new JTextArea(10, 30);
        areaResultados.setEditable(false);

        // Añadir los componentes a la ventana
        add(botonMaximus);
        add(botonZara);
        add(botonRex);
        add(botonVotar);
        add(new JScrollPane(areaResultados));

        // Mostrar la vista
        setVisible(true);
    }
}
