package com.duoc.gestiont.entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Desarrollador {

    private String nombre;
    private String especialidad;
    private Set<Tarea> tareasAsignadas;

    public Desarrollador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.tareasAsignadas = new HashSet<Tarea>();
    }

    public void asignarTarea(Tarea tarea) {
        tareasAsignadas.add(tarea);
    }

    public String getNombre(){
        return nombre;
    }

    public Set<Tarea> obtenerTareasAsignadas() {
        return tareasAsignadas;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", tareasAsignadas=" + tareasAsignadas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Desarrollador that = (Desarrollador) o;
        return Objects.equals(tareasAsignadas, that.tareasAsignadas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tareasAsignadas);
    }
}
