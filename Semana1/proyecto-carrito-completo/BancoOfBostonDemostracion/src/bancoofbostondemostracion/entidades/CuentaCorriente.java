/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoofbostondemostracion.entidades;

/**
 *
 * @author jorgecarmona
 */
public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(String numeroCuenta){
        super(numeroCuenta);
    }
    
    @Override
    public void mostrarTipoCuenta(){
        System.out.println("Tipo de cuenta:::::  Cuenta Corriente ");
    }
    
}
