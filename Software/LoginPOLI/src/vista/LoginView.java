/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
/**
 *
 * @author Harol
 */
// Clase Vista: crea la interfaz grafica
public class LoginView extends JFrame {
    public JTextField campoUsuario;
    public JPasswordField campoContrasena;
    public JButton botonIngresar;
    public JLabel etiquetaResultado;

    public LoginView() {
        setTitle("Login Simulado");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Layout absoluto para simplicidad

        // Componentes
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(20, 20, 80, 25);
        add(etiquetaUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(100, 20, 150, 25);
        add(campoUsuario);

        JLabel etiquetaContrasena = new JLabel("Contraseña:");
        etiquetaContrasena.setBounds(20, 60, 80, 25);
        add(etiquetaContrasena);

        campoContrasena = new JPasswordField();
        campoContrasena.setBounds(100, 60, 150, 25);
        add(campoContrasena);

        botonIngresar = new JButton("Ingresar");
        botonIngresar.setBounds(100, 100, 100, 30);
        add(botonIngresar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 140, 250, 25);
        add(etiquetaResultado);
    }
}