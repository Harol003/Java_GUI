package modelo;

// Clase que representa un candidato
public class Candidato {
    private String nombre;
    private int votos;

    public Candidato(String nombre) {
        this.nombre = nombre;
        this.votos = 0;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para votos
    public int getVotos() {
        return votos;
    }

    // Incrementar el contador de votos
    public void agregarVoto() {
        votos++;
    }

    @Override
    public String toString() {
        return nombre + ": " + votos + " votos";
    }
}
