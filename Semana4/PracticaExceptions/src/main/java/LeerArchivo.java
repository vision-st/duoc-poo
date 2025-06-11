import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[]args){

        try{
            FileReader lector = new FileReader("documento.txt");
            //... logica de lectura del archivo
        }catch(IOException e){
            System.out.println("capturamos el error, podemos hacer algo...");
            e.printStackTrace();
        }
        System.out.println("el sistema sigue funcionando, no se ha detenido por el error");

    }

}
