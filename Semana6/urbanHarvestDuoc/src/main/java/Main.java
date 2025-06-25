import modelos.*;
import servicios.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n===== Menú Principal =====");
            System.out.println("1. Mostrar cultivos");
            System.out.println("2. Agregar usuario");
            System.out.println("3. Mostrar usuarios");
            System.out.println("4. Agregar actividad");
            System.out.println("5. Guardar usuarios en archivo");
            System.out.println("6. Guardar actividades en archivo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Opción no válida.");
                    break;
                case "2":
                    System.out.println("Opción no válida.");
                    break;
                case "3":
                    System.out.println("Opción no válida.");
                    break;
                case "4":
                    System.out.println("Opción no válida.");
                    break;
                case "5":
                    System.out.println("Opción no válida.");
                    break;
                case "6":
                    System.out.println("Opción no válida.");
                    break;
                case "0":
                    System.out.println("Opción no válida.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
