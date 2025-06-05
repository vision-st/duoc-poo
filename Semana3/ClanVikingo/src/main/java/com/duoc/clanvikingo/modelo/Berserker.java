package com.duoc.clanvikingo.modelo;

import com.duoc.clanvikingo.modelo.interfaces.InfoGuerrero;

public class Berserker extends Guerrero implements InfoGuerrero {

    public Berserker(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con furia berserker (+" + nivelFuerza + " fuerza).");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Berserker " + nombre + " - Fuerza: " + nivelFuerza);
    }
}