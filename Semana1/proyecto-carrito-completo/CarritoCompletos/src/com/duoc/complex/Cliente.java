package com.duoc.complex;

/**
 * Clase que representa un cliente del carrito.
 * Aplica ENCAPSULAMIENTO y ABSTRACCIÓN: oculta cómo se descuenta el dinero y entrega solo una interfaz simple (pagar).
 */
public class Cliente {
    private String nombre;
    private int dineroDisponible;

    public Cliente(String nombre, int dineroDisponible) {
        this.nombre = nombre;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDineroDisponible() {
        return dineroDisponible;
    }

    public boolean pagar(int precio) {
        if (dineroDisponible >= precio) {
            dineroDisponible -= precio;
            System.out.println(nombre + " pagó $" + precio);
            return true;
        } else {
            System.out.println(nombre + " no tiene suficiente dinero.");
            return false;
        }
    }
}