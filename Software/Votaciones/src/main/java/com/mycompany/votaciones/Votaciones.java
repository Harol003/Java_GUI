/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.votaciones;

import controlador.VotacionController;
import modelo.VotacionModel;
import vista.VotacionView;
/**
 *
 * @author Harol
 */
public class Votaciones {

    public static void main(String[] args) {
        // Crear el modelo y la vista
        VotacionModel modelo = new VotacionModel();
        VotacionView vista = new VotacionView();

        // Crear el controlador y vincularlo con el modelo y la vista
        VotacionController controlador = new VotacionController(modelo, vista);

        // Mostrar la ventana
        vista.setVisible(true);
        
        vista.setLocationRelativeTo(null);    }
}
