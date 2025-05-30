package com.duoc.arena.robot.combate;


import com.duoc.arena.robot.base.Robot;

class RobotAsalto extends Robot {
    public RobotAsalto(String nombre, int energia) {
        super(nombre, energia);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara su cañón de plasma.");
    }
}