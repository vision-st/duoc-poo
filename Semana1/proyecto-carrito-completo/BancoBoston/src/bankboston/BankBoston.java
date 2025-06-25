package bankboston;

import java.util.*;

public class BankBoston implements BankBoston2{

    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void arrancar() {
        System.out.println("Sistema BankBoston iniciado.");
        mostrarMenuPrincipal();
    }

    @Override
    public void detener() {
        System.out.println("Sistema BankBoston detenido. ¡Gracias por usar nuestros servicios!");
        scanner.close();
    }

    public static void main(String[] args) {
        BankBoston bank = new BankBoston();
        bank.arrancar();
    }

    private static void mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("\n--- Menú Principal BankBoston ---");
            System.out.println("1. Registrar Nuevo Cliente");
            System.out.println("2. Ver Datos de Cliente");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Realizar Giro");
            System.out.println("5. Consultar Saldo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> registrarCliente();
                    case 2 -> verDatosCliente();
                    case 3 -> realizarDeposito();
                    case 4 -> realizarGiro();
                    case 5 -> consultarSaldoCliente();
                    case 6 -> {
                        BankBoston2 bank = new BankBoston();
                        bank.detener();
                    }
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine();
                opcion = 0;
            }
        } while (opcion != 6);
    }

    private static void registrarCliente() {
        System.out.println("\n--- Registrar Nuevo Cliente ---");
        System.out.print("Ingrese RUT del cliente: ");
        String rut = scanner.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getRut().equalsIgnoreCase(rut)) {
                System.out.println("Error: Ya existe un cliente con este RUT.");
                return;
            }
        }

        System.out.print("Ingrese Nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese Apellido del cliente (opcional, presione Enter para omitir): ");
        String apellido = scanner.nextLine();

        Cliente nuevoCliente = apellido.isEmpty()
            ? new Cliente(rut, nombre)
            : new Cliente(rut, nombre, apellido);

        System.out.print("Ingrese Número de Cuenta (9 dígitos): ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese Saldo Inicial de la Cuenta: $");
        double saldoInicial;
        try {
            saldoInicial = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Saldo inicial inválido. Se asignará 0.");
            scanner.nextLine();
            saldoInicial = 0;
        }

        try {
            CuentaCorriente nuevaCuenta = new CuentaCorriente(numeroCuenta, saldoInicial);
            nuevoCliente.setCuenta(nuevaCuenta);
            clientes.add(nuevoCliente);
            System.out.println("Cliente y cuenta registrados con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
        }
    }

    private static Cliente buscarClientePorRut() {
        System.out.print("Ingrese RUT del cliente: ");
        String rut = scanner.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equalsIgnoreCase(rut)) {
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado con RUT: " + rut);
        return null;
    }

    private static void verDatosCliente() {
        System.out.println("\n--- Ver Datos de Cliente ---");
        Cliente cliente = buscarClientePorRut();
        if (cliente != null) {
            cliente.mostrarInformacion();
        }
    }

    private static void realizarDeposito() {
        System.out.println("\n--- Realizar Depósito ---");
        Cliente cliente = buscarClientePorRut();
        if (cliente != null && cliente.getCuenta() != null) {
            System.out.print("Ingrese el monto a depositar: $");
            try {
                double monto = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("¿Desea agregar una descripción al depósito? (s/n): ");
                String opcionDescripcion = scanner.nextLine();
                if (opcionDescripcion.equalsIgnoreCase("s")) {
                    System.out.print("Ingrese la descripción: ");
                    String descripcion = scanner.nextLine();
                    cliente.getCuenta().depositar(monto, descripcion);
                } else {
                    cliente.depositar(monto);
                }
            } catch (InputMismatchException e) {
                System.out.println("Monto inválido. Por favor, ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    private static void realizarGiro() {
        System.out.println("\n--- Realizar Giro ---");
        Cliente cliente = buscarClientePorRut();
        if (cliente != null && cliente.getCuenta() != null) {
            System.out.print("Ingrese el monto a girar: $");
            try {
                double monto = scanner.nextDouble();
                scanner.nextLine();
                cliente.girar(monto);
            } catch (InputMismatchException e) {
                System.out.println("Monto inválido. Por favor, ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    private static void consultarSaldoCliente() {
        System.out.println("\n--- Consultar Saldo ---");
        Cliente cliente = buscarClientePorRut();
        if (cliente != null && cliente.getCuenta() != null) {
            cliente.consultarSaldo();
        }
    }
}