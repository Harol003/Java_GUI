package modelo;

import java.util.ArrayList;

// Modelo que maneja los votos
public class VotacionModel {
    private ArrayList<Candidato> candidatos;

    public VotacionModel() {
        // Inicializamos los candidatos
        candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Goku"));
        candidatos.add(new Candidato("Pikoro"));
        candidatos.add(new Candidato("Vegeta"));
    }

    // Método para agregar un voto al candidato seleccionado
    public void agregarVoto(int indice) {
        candidatos.get(indice).agregarVoto();
    }

    // Método para obtener todos los resultados
    public String obtenerResultados() {
        StringBuilder resultados = new StringBuilder();
        for (Candidato candidato : candidatos) {
            resultados.append(candidato.toString()).append("\n");
        }
        return resultados.toString();
    }
}
