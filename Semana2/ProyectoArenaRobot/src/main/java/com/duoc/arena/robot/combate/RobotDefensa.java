package com.duoc.arena.robot.combate;

import com.duoc.arena.robot.base.Robot;

public class RobotDefensa extends Robot {
    public RobotDefensa(String nombre, int energia) {
        super(nombre, energia);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " activa barrera de impacto defensiva.");
    }
}
