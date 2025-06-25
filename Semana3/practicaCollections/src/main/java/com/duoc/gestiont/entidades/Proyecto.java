package com.duoc.gestiont.entidades;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private String nombre;

    private List<Tarea> listaTareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.listaTareas = new ArrayList<Tarea>();
    }

    public Proyecto(){}


    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public List<Tarea> obtenerTareas(){
        return listaTareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", listaTareas=" + listaTareas +
                '}';
    }
}
