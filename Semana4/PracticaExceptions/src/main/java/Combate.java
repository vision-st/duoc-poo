public class Combate {

    public static void main(String[] args) {
        Robot robot = new Robot(0); // Crear un robot con 50 de energía

        try {
            robot.atacar(); // Intentar atacar
            robot.atacar(); // Intentar atacar nuevamente
        } catch (EnergiaInsuficienteException e) {
            System.out.println(e.getMessage()); // Manejar la excepción si ocurre
        }
    }

}
