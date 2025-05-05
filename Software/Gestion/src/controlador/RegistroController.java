/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Estudiante;
import modelo.EstudianteModel;
import vista.RegistroView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controlador que conecta vista y modelo
public class RegistroController {
    private EstudianteModel modelo;
    private RegistroView vista;

    public RegistroController(EstudianteModel modelo, RegistroView vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarEstudiante();
            }
        });
    }

    // Metodo para registrar el estudiante
    private void registrarEstudiante() {
        String nombre = vista.campoNombre.getText();
        String edadTexto = vista.campoEdad.getText();

        try {
            int edad = Integer.parseInt(edadTexto);
            Estudiante estudiante = new Estudiante(nombre, edad);
            modelo.agregarEstudiante(estudiante);
            vista.areaResultado.setText(modelo.obtenerEstudiantes());
            vista.campoNombre.setText("");
            vista.campoEdad.setText("");
        } catch (NumberFormatException ex) {
            vista.areaResultado.setText("Edad invalida. Ingresa un numero.");
        }
    }
}