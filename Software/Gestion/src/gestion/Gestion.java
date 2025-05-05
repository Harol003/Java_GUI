/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion;

import controlador.RegistroController;
import modelo.EstudianteModel;
import vista.RegistroView;
/**
 *
 * @author Harol
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteModel modelo = new EstudianteModel();
        RegistroView vista = new RegistroView();
        RegistroController controlador = new RegistroController(modelo, vista);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
}
