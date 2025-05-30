package com.duoc.arena.robot.combate;

import com.duoc.arena.robot.interfaces.Volador;

public class RobotAsaltoVolador extends RobotAsalto implements Volador {
    public RobotAsaltoVolador(String nombre, int energia) {
        super(nombre, energia);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " se eleva con propulsores antigravedad.");
    }
}
