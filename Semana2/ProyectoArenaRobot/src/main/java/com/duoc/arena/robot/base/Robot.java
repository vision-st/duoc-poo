package com.duoc.arena.robot.base;

public abstract class Robot {
    protected String nombre;
    protected int energia;

    public Robot(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public void mostrarEstado() {
        System.out.println("Robot: " + nombre + " | Energía: " + energia);
    }

    public abstract void atacar();
}