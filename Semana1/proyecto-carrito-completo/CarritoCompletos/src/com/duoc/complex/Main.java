// Main.java
package com.duoc.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal del sistema de venta de completos.
 * Aquí aplicamos MODULARIDAD (uso de varias clases separadas), y POLIMORFISMO implícito en métodos como prepararCompleto().
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoCompleto carrito = new CarritoCompleto();
        Cliente cliente = new Cliente("Cliente Default", 5000);

        List<Completo> historial = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n=====================================");
            System.out.println("       MENÚ - EL RINCÓN DEL COMPLETO       ");
            System.out.println("=====================================");
            System.out.println("1. Crear completo nuevo");
            System.out.println("2. Ver estado del carrito");
            System.out.println("3. Ver historial de pedidos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n=== Crear completo ===");
                    System.out.print("Ingrese el tipo de completo (ej: Italiano, Dinámico): ");
                    String tipo = scanner.nextLine();

                    System.out.print("¿Desea palta? (s/n): ");
                    boolean palta = scanner.nextLine().equalsIgnoreCase("s");

                    System.out.print("¿Desea tomate? (s/n): ");
                    boolean tomate = scanner.nextLine().equalsIgnoreCase("s");

                    System.out.print("¿Desea mayonesa? (s/n): ");
                    boolean mayo = scanner.nextLine().equalsIgnoreCase("s");

                    Completo nuevoCompleto = new Completo(tipo, palta, tomate, mayo);

                    System.out.println("\n--- Intentando realizar pedido ---");
                    boolean exito = carrito.recibirPedido(cliente, nuevoCompleto);
                    if (exito) {
                        historial.add(nuevoCompleto);
                    }
                    break;

                case 2:
                    System.out.println("\n=== Estado del carrito ===");
                    carrito.mostrarEstado();
                    break;

                case 3:
                    System.out.println("\n=== Historial de completos vendidos ===");
                    if (historial.isEmpty()) {
                        System.out.println("No hay pedidos registrados aún.");
                    } else {
                        int i = 1;
                        for (Completo c : historial) {
                            System.out.println("\nPedido #" + i++);
                            c.describir();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Gracias por visitar el Rincón del Completo. ¡Vuelva pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
