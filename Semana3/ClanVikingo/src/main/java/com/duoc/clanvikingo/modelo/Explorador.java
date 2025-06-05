package com.duoc.clanvikingo.modelo;

import com.duoc.clanvikingo.modelo.interfaces.InfoGuerrero;

public class Explorador extends Guerrero implements InfoGuerrero {

    public Explorador(String nombre) {
        super(nombre, 5); // más débil, pero ágil
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza una flecha certera (+" + nivelFuerza + " daño).");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Explorador " + nombre + " - Fuerza: " + nivelFuerza);
    }
}