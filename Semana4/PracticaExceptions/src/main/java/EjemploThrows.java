import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjemploThrows {

    public static void leerArchivo() throws IOException {
        FileReader fr = new FileReader("archivo.txt");
        fr.read();
        fr.close();
    }

    public static void main(String[] args) {
        try {
            leerArchivo();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar leer el archivo: " + e.getMessage());
        }
        System.out.println("El sistema sigue funcionando, no se ha detenido por el error");
    }

}
