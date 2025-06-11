public class ErrorDemo {

    public static void main(String[]args){

        try{
            generarError();
        }catch(Error e){
            System.out.println("Capturamos un stack overflow");
            e.printStackTrace();
        }
        System.out.println("el sistema sigue funcionando");


    }

    public static void generarError(){
        generarError();
    }

}
