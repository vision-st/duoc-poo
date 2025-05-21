package com.duoc.complex;

/**
 * Clase que representa el sistema central del negocio.
 * Aplica COHESIÓN (solo gestiona pedidos y stock) y ABSTRACCIÓN (oculta cómo se prepara el completo).
 */
public class CarritoCompleto {
    private String nombreCarrito = "El Rincón del Completo";
    private int stockPan = 10;
    private int stockVienesa = 10;
    private int stockPalta = 5;
    private int stockTomate = 5;
    private int stockMayonesa = 5;
    private int totalVentas = 0;

    public boolean recibirPedido(Cliente cliente, Completo completo) {
        if (stockPan <= 0 || stockVienesa <= 0) {
            System.out.println("No hay stock para preparar el completo.");
            return false;
        }

        if (completo.isTienePalta() && stockPalta <= 0) {
            System.out.println("No hay palta disponible.");
            return false;
        }
        if (completo.isTieneTomate() && stockTomate <= 0) {
            System.out.println("No hay tomate disponible.");
            return false;
        }
        if (completo.isTieneMayonesa() && stockMayonesa <= 0) {
            System.out.println("No hay mayonesa disponible.");
            return false;
        }

        int precio = 1500;

        if (cliente.pagar(precio)) {
            prepararCompleto(completo);
            totalVentas += precio;
            System.out.println(">> Pedido entregado con éxito.");
            return true;
        }

        return false;
    }

    private void prepararCompleto(Completo completo) {
        stockPan--;
        stockVienesa--;
        if (completo.isTienePalta()) stockPalta--;
        if (completo.isTieneTomate()) stockTomate--;
        if (completo.isTieneMayonesa()) stockMayonesa--;

        System.out.println(">> Preparando completo...");
        completo.describir();
    }

    public void mostrarEstado() {
        System.out.println("== STOCK DISPONIBLE ==");
        System.out.println("Pan: " + stockPan);
        System.out.println("Vienesas: " + stockVienesa);
        System.out.println("Palta: " + stockPalta);
        System.out.println("Tomate: " + stockTomate);
        System.out.println("Mayonesa: " + stockMayonesa);
        System.out.println("Total ventas acumuladas: $" + totalVentas);
    }
}