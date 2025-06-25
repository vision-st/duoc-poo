package servicios;

import modelos.Cultivo;

import java.io.*;
import java.util.ArrayList;

public class CultivoService {

    public static ArrayList<Cultivo> cargarCultivosDesdeCsv(String ruta){

        ArrayList<Cultivo> cultivos = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] partes = linea.split(",");
                String nombre = partes[0];
                String temporada = partes[1];
                int dias = Integer.parseInt(partes[2]);
                cultivos.add(new Cultivo(nombre, temporada, dias));
            }
        }catch(IOException | NumberFormatException e){
            System.err.println("Error al leer archivo CSV: " + e.getMessage());
        }
        return cultivos;
    }

}
