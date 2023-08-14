/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.politaller3;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliTaller3 {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("PoliTaller3");
        // Configurar el tamaño de la ventana
        frame.setSize(400, 300);
        // Configurar la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para organizar los componentes con FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear botón para visualizar estudiantes inscritos
        JButton botonVerEstudiantes = new JButton("Ver Estudiantes Inscritos");
        panel.add(botonVerEstudiantes);

        // Crear botón para adicionar estudiantes
        JButton botonAdicionarEstudiante = new JButton("Adicionar Estudiante");
        panel.add(botonAdicionarEstudiante);

        // Crear botón para información del curso
        JButton botonInformacionCurso = new JButton("Información del Curso");
        panel.add(botonInformacionCurso);

        // Crear botón para salir de la aplicación
        JButton botonSalir = new JButton("Salir");
        panel.add(botonSalir);

        // Agregar el panel al centro de la ventana
        frame.add(panel, BorderLayout.CENTER);

        // Mostrar la ventana en la pantalla
        frame.setVisible(true);

        // Acción del botón para visualizar estudiantes inscritos
        botonVerEstudiantes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Agregar aquí la lógica para visualizar estudiantes inscritos
                JOptionPane.showMessageDialog(frame,
                        "Lista de Estudiantes Inscritos:\n- Estudiante 1\n- Estudiante 2\n- Estudiante 3",
                        "Estudiantes Inscritos", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Acción del botón para adicionar estudiantes
        botonAdicionarEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Agregar aquí la lógica para adicionar estudiantes
                JOptionPane.showMessageDialog(frame,
                        "Funcionalidad para Adicionar Estudiante",
                        "Adicionar Estudiante", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Acción del botón para información del curso
        botonInformacionCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Agregar aquí la lógica para mostrar información del curso
                JOptionPane.showMessageDialog(frame,
                        "Curso de Programación:\n- Horario: Lunes y Miércoles de 14:00 a 16:00\n- Profesor: Juan Pérez",
                        "Información del Curso", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Acción del botón para salir de la aplicación
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la aplicación
                System.exit(0);
            }
        });
    }
}
