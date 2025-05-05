/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Model;
import vista.LoginView;
/**
 *
 * @author Harol
 */
// Clase Controlador: maneja los eventos entre la vista y el modelo
public class LoginController {
    private Model modelo;
    private LoginView vista;

    public LoginController(Model modelo, LoginView vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Asignar accion al boton
        this.vista.botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarLogin();
            }
        });
    }

    // Metodo que toma los datos de la vista y usa el modelo para validar
    private void procesarLogin() {
        String usuario = vista.campoUsuario.getText();
        String contrasena = new String(vista.campoContrasena.getPassword());

        modelo.setUsuarioIngresado(usuario);
        modelo.setContrasenaIngresada(contrasena);

        if (modelo.validarLogin()) {
            vista.etiquetaResultado.setText("¡Acceso concedido!");
        } else {
            vista.etiquetaResultado.setText("Usuario o contraseña incorrectos.");
        }
    }
}