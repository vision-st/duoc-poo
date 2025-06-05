package com.duoc.clanvikingo.app;


import com.duoc.clanvikingo.modelo.Berserker;
import com.duoc.clanvikingo.modelo.Clan;
import com.duoc.clanvikingo.modelo.Explorador;
import com.duoc.clanvikingo.modelo.Guerrero;
import com.duoc.clanvikingo.services.ClanService;

public class Main {
    public static void main(String[] args) {
        Clan clan = new Clan("Lobos del Norte");

        Guerrero g1 = new Berserker("Ragnar");
        Guerrero g2 = new Explorador("Loki");

        clan.reclutar(g1);
        clan.reclutar(g2);

        ClanService servicio = new ClanService();
        servicio.mostrarGuerreros(clan); // se aplica polimorfismo
    }
}