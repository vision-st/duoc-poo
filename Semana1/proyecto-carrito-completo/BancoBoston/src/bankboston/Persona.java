/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankboston;

public abstract class Persona {
    protected String rut;
    protected String nombre;
    protected String apellido;

    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String rut, String nombre) {
        this(rut, nombre, "Sin apellido definido");
        System.out.println("DEBUG: Se creó una persona con RUT: " + rut + " y Nombre: " + nombre + " (Apellido por defecto)");
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public abstract void mostrarDatosPersonales();
}