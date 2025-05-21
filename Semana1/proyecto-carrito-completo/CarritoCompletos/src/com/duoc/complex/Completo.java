package com.duoc.complex;

/**
 * Clase que representa un completo con ingredientes personalizados.
 * Se aplica ENCAPSULAMIENTO: atributos privados y acceso controlado mediante getters.
 */
public class Completo {
    private String tipo;
    private boolean tienePalta;
    private boolean tieneTomate;
    private boolean tieneMayonesa;

    public Completo(String tipo, boolean tienePalta, boolean tieneTomate, boolean tieneMayonesa) {
        this.tipo = tipo;
        this.tienePalta = tienePalta;
        this.tieneTomate = tieneTomate;
        this.tieneMayonesa = tieneMayonesa;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isTienePalta() {
        return tienePalta;
    }

    public boolean isTieneTomate() {
        return tieneTomate;
    }

    public boolean isTieneMayonesa() {
        return tieneMayonesa;
    }

    public void describir() {
        System.out.println(">> Completo tipo: " + tipo);
        System.out.println("   Palta: " + (tienePalta ? "Sí" : "No"));
        System.out.println("   Tomate: " + (tieneTomate ? "Sí" : "No"));
        System.out.println("   Mayonesa: " + (tieneMayonesa ? "Sí" : "No"));
    }
}