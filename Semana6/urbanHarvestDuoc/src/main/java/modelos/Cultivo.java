package modelos;

public class Cultivo {
    private String nombre;
    private String temporada;
    private int diasCosecha;

    public Cultivo(String nombre, String temporada, int diasCosecha) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.diasCosecha = diasCosecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public int getDiasCosecha() {
        return diasCosecha;
    }

    @Override
    public String toString() {
        return nombre + " ( " + temporada + " - " + diasCosecha + " días de cosecha)";
    }
}
