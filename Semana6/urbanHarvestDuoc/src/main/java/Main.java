import modelos.*;
import servicios.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws UsuarioExistenteException {
        Scanner scanner = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();
        Set<Actividad> actividad = new HashSet<>();
        ArrayList<Cultivo> cultivos = CultivoService.cargarCultivosDesdeCsv("cultivos.csv");

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
                    for(Cultivo cultivo : cultivos){
                        System.out.println(" - " + cultivo);
                    }
                    break;
                case "2":
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el correo: ");
                    String correo = scanner.nextLine();
                    System.out.println("Ingrese el rol del usuario (1. Administrador, 2. Usuario): ");
                    String rol = scanner.nextLine();
                    usuarioService.agregarUsuario(new Usuario(nombre, correo, rol));
                    System.out.println("Usuario agregado exitosamente");
                    break;
                case "3":
                    usuarioService.mostrarUsuarios();
                    break;
                case "4":
                    System.out.print("Ingrese el nombre del actividad: ");
                    String nombreActividad = scanner.nextLine();
                    System.out.print("Ingrese la fecha: ");
                    String fecha = scanner.nextLine();
                    actividad.add(new Actividad(nombreActividad, fecha));
                    System.out.println("Actividad agregado exitosamente");
                    break;
                case "5":
                    ArchivoService.guardarUsuarios(usuarioService.getUsuarios(), "usuarios.txt");
                    System.out.println("Usuarios guardado exitosamente");
                    break;
                case "6":
                    ArchivoService.guardarActividades(actividad, "actividades.txt");
                    System.out.println("Actividades guardadas.");
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
