package com.duoc.arena.robot.combate;

import com.duoc.arena.robot.interfaces.Autoreparable;

public class RobotSoporteAutoreparable extends RobotSoporte implements Autoreparable {
    public RobotSoporteAutoreparable(String nombre, int energia, String modelo) {
        super(nombre, energia, modelo);
    }

    @Override
    public void repararse() {
        System.out.println(nombre + " activa protocolo de autorreparación.");
    }
}