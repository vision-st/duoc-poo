package bankboston;

public class Cliente extends Persona implements Mostrable {
    private CuentaCorriente cuenta;

    public Cliente(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
    }

    public Cliente(String rut, String nombre) {
        super(rut, nombre);
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void mostrarDatosPersonales() {
        System.out.println("\n--- Datos del Cliente ---");
        System.out.println("RUT: " + this.rut);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        if (this.cuenta != null) {
            this.cuenta.mostrarDatosCuenta();
        } else {
            System.out.println("El cliente no tiene una cuenta asociada.");
        }
    }

    @Override
    public void mostrarInformacion() {
        mostrarDatosPersonales();
    }

    public void depositar(double monto) {
        if (cuenta != null) {
            cuenta.depositar(monto);
        } else {
            System.out.println("El cliente no tiene una cuenta asociada para depositar.");
        }
    }

    public void girar(double monto) {
        if (cuenta != null) {
            cuenta.girar(monto);
        } else {
            System.out.println("El cliente no tiene una cuenta asociada para girar.");
        }
    }

    public void consultarSaldo() {
        if (cuenta != null) {
            cuenta.consultarSaldo();
        } else {
            System.out.println("El cliente no tiene una cuenta asociada para consultar saldo.");
        }
    }
}