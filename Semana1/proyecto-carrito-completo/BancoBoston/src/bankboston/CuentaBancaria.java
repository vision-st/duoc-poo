package bankboston;

public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    public static final int DIGITOS_NUMERO_CUENTA = 9;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        if (numeroCuenta.length() != DIGITOS_NUMERO_CUENTA || !numeroCuenta.matches("\\d+")) {
            throw new IllegalArgumentException("El número de cuenta debe ser de " + DIGITOS_NUMERO_CUENTA + " dígitos numéricos.");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double monto);
    public abstract void girar(double monto);
    public abstract void consultarSaldo();
    public abstract void mostrarDatosCuenta();
}