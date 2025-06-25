/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoofbostondemostracion.entidades;

import bancoofbostondemostracion.entidades.interfaces.Mostrable;

/**
 *
 * @author jorgecarmona
 */
public class Cliente implements Mostrable {
    
    private String rut;
    private String nombre;
    private String apellidopaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private String telefono;
    private Cuenta cuenta;

    public Cliente(String rut, String nombre, String apellidopaterno, String apellidoMaterno, String domicilio, String comuna, String telefono, Cuenta cuenta) {
        
        if(rut.length() < 11 || rut.length() > 12){
            System.out.println("Rur invalido");
        }else{
            this.rut = rut;
            this.nombre = nombre;
            this.apellidopaterno = apellidopaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.domicilio = domicilio;
            this.comuna = comuna;
            this.telefono = telefono;
            this.cuenta = cuenta;
        }
    }
    

    @Override
    public void mostrarDatosCliente() {
        System.out.println("Rut " + rut);
        System.out.println("Nombre " + nombre);
        System.out.println("y el resto de atributos de cliente..... ");
    }
    
    public Cuenta getCuenta(){
        return cuenta;
    }
    
}
