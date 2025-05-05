/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

// Modelo que gestiona la lista de estudiantes
public class EstudianteModel {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

    public String obtenerEstudiantes() {
        StringBuilder resultado = new StringBuilder();
        for (Estudiante e : listaEstudiantes) {
            resultado.append(e.toString()).append("\n");
        }
        return resultado.toString();
    }
}
