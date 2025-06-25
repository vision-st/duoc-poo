package bancoofbostondemostracion.entidades;

/**
 *
 * @author jorgecarmona
 */
public abstract class Cuenta {
    
    public String numeroCuenta;
    public double saldo;
    
    public Cuenta(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public Cuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta() {
        //this("0000000", 0.0); truco para inicializar.
        this.numeroCuenta = "0000";
        this.saldo = 0.0;
    }
    
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Deposito realizado de manera exitosa");
            System.out.println("Usted tiene un saldo actual de " + saldo);
        }else{
            System.out.println("Error: El monto debe ser mayor a 0");
        }
    }
    
    public void girar(double monto){
         if(monto <= 0){
            System.out.println("Error: El monto debe ser mayor a 0");
        } else if(monto > saldo){
            System.out.println("Error: El saldo es insufuciente");
        } else {
            saldo -= monto;
            System.out.println("Giro realizado correctamente");
            System.out.println("Usted tiene un saldo actual de " + saldo);
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Usted tiene un saldo actual de " + saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Metodo abstracto
    public abstract void mostrarTipoCuenta();
    
}
