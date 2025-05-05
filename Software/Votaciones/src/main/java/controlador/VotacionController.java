/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.VotacionModel;
import vista.VotacionView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controlador que conecta la vista y el modelo
public class VotacionController {
    private VotacionModel modelo;
    private VotacionView vista;

    public VotacionController(VotacionModel modelo, VotacionView vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Acción del botón Votar
        vista.botonVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                votar();
            }
        });
    }

    // Método para votar
    private void votar() {
        // Verificar cuál botón está seleccionado
        if (vista.botonMaximus.isSelected()) {
            modelo.agregarVoto(0); // 0 -> Maximus
        } else if (vista.botonZara.isSelected()) {
            modelo.agregarVoto(1); // 1 -> Zara
        } else if (vista.botonRex.isSelected()) {
            modelo.agregarVoto(2); // 2 -> Rex
        }

        // Mostrar los resultados actualizados
        vista.areaResultados.setText(modelo.obtenerResultados());
    }
}
