package servicios;

import modelos.Usuario;
import modelos.UsuarioExistenteException;

import java.util.HashMap;

public class UsuarioService {

    private HashMap<String, Usuario> usuarios = new HashMap<>();

    public void agregarUsuario(Usuario usuario) throws UsuarioExistenteException {
        if(!usuarios.containsKey(usuario.getCorreo())){
            usuarios.put(usuario.getCorreo(), usuario);
        } else {
            throw new UsuarioExistenteException("El usuario con el correo " + usuario.getCorreo() + " ya existe, intente con otro.");
        }
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void mostrarUsuarios(){
        if(usuarios.isEmpty()){
            System.out.println("No hay usuarios registrados.");
        } else {
            for(Usuario usuario : usuarios.values()){
                System.out.println(usuario);
            }
        }
    }

}
