package com.duoc.clanvikingo.modelo;

public abstract class Guerrero {
    protected String nombre;
    protected int nivelFuerza;

    public Guerrero(String nombre, int nivelFuerza) {
        this.nombre = nombre;
        this.nivelFuerza = nivelFuerza;
    }

    public Guerrero(String nombre) {
        this(nombre, 10); // sobrecarga
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }

    public abstract void atacar();
}