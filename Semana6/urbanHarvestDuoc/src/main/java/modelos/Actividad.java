package modelos;

import java.util.Objects;

public class Actividad {
    private String descripcion;
    private String fecha;

    public Actividad(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actividad actividad = (Actividad) o;
        return Objects.equals(descripcion, actividad.descripcion) && Objects.equals(fecha, actividad.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, fecha);
    }

    @Override
    public String toString() {
        return fecha + " : " + descripcion;
    }
}
