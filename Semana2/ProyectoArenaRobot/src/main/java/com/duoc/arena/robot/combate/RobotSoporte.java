package com.duoc.arena.robot.combate;

import com.duoc.arena.robot.base.Robot;

public class RobotSoporte extends Robot {
    private String modelo;

    // Constructor básico
    public RobotSoporte(String nombre, int energia) {
        super(nombre, energia);
        this.modelo = "Estándar";
    }

    // Constructor sobrecargado
    public RobotSoporte(String nombre, int energia, String modelo) {
        super(nombre, energia);
        this.modelo = modelo;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " (" + modelo + ") lanza pulso de soporte.");
    }

    public void mostrarDetalles() {
        mostrarEstado();
        System.out.println("Modelo: " + modelo);
    }
}