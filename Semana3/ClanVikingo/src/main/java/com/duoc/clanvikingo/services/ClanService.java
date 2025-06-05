package com.duoc.clanvikingo.services;


import com.duoc.clanvikingo.modelo.Clan;
import com.duoc.clanvikingo.modelo.Guerrero;

public class ClanService {
    public void mostrarGuerreros(Clan clan) {
        System.out.println("Guerreros del Clan " + clan.getNombre() + ":");
        for (Guerrero g : clan.getGuerreros()) {
            g.atacar(); // polimorfismo
        }
    }
}