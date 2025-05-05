/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
// Clase Modelo: contiene los datos del usuario y la lógica de validación
public class Model {
    private String usuarioCorrecto = "Harol";
    private String contrasenaCorrecta = "Torres";

    private String usuarioIngresado;
    private String contrasenaIngresada;

    // Getters y setters
    public String getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    public String getContrasenaIngresada() {
        return contrasenaIngresada;
    }

    public void setContrasenaIngresada(String contrasenaIngresada) {
        this.contrasenaIngresada = contrasenaIngresada;
    }

    // Metodo que valida el login comparando con los datos correctos
    public boolean validarLogin() {
        return usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta);
    }
}
