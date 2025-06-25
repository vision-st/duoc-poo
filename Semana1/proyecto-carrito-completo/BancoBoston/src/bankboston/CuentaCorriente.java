/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankboston;

public class CuentaCorriente extends CuentaBancaria implements Mostrable {

    public CuentaCorriente(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito de $" + monto + " realizado con éxito en la cuenta " + this.numeroCuenta + ".");
            consultarSaldo();
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }

    public void depositar(double monto, String descripcion) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito de $" + monto + " (" + descripcion + ") realizado con éxito en la cuenta " + this.numeroCuenta + ".");
            consultarSaldo();
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }

    @Override
    public void girar(double monto) {
        if (monto > 0) {
            if (this.saldo >= monto) {
                this.saldo -= monto;
                System.out.println("Giro de $" + monto + " realizado con éxito de la cuenta " + this.numeroCuenta + ".");
                consultarSaldo();
            } else {
                System.out.println("Saldo insuficiente para realizar el giro.");
            }
        } else {
            System.out.println("El monto a girar debe ser mayor que cero.");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo actual de la cuenta " + this.numeroCuenta + ": $" + this.saldo);
    }

    @Override
    public void mostrarDatosCuenta() {
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo en Cuenta Corriente: $" + this.saldo);
    }

    @Override
    public void mostrarInformacion() {
        mostrarDatosCuenta();
    }
}