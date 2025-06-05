package com.duoc.clanvikingo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Clan {
    private String nombre;
    private List<Guerrero> guerreros = new ArrayList<>();

    public Clan(String nombre) {
        this.nombre = nombre;
    }

    public void reclutar(Guerrero guerrero) {
        guerreros.add(guerrero);
    }

    public List<Guerrero> getGuerreros() {
        return guerreros;
    }

    public String getNombre() {
        return nombre;
    }
}
