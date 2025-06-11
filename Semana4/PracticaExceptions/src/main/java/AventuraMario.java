public class AventuraMario {

    public static void main(String[]args){
        System.out.println("Mario y luigi estan calculando puntos.");

        int monedas = 100;
        int enemigosDerrotados = 0;
        try{
            int vidasExtra = monedas / enemigosDerrotados;
            System.out.println("Mario gana " + vidasExtra);
            System.out.println("fin del calculo");
        }catch(ArithmeticException e){
            System.out.println("Luigi no puedes dividir por cero !!!!");
            System.out.println("Ocurrio un error no chequeado de tipo =====> : " + e.getMessage());
        } finally {
            System.out.println("Esto se ejecutara siempre, haya o no error.");
        }

        System.out.println("El sistema sigue funcionando, no se ha detenido por el error");
    }

}
