public class EjemploThrow {

    public static void main(String[]args){
        int edad = 15;

        if(edad < 18){
            throw new IllegalArgumentException("La edad debe ser menor a 18");
        }

        System.out.println("el sistema sigue funcionando");
    }

}
