package servicios;

import modelos.Usuario;
import modelos.Actividad;
import modelos.UsuarioExistenteException;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class ArchivoService {

    public static void guardarUsuarios(HashMap<String, Usuario> usuarios, String ruta) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            for(Usuario usuario : usuarios.values()){
                bw.write( usuario.toString());
                bw.newLine();
            }
        }catch( IOException e){
            System.err.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    public static void guardarActividades(Set<Actividad> actividades, String ruta) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            for(Actividad actividad : actividades){
                bw.write( actividad.toString());
                bw.newLine();
            }
        }catch( IOException e){
            System.err.println("Error al guardar actividades: " + e.getMessage());
        }
    }



}
