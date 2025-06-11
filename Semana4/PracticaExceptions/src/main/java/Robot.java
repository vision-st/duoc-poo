public class Robot {

    private int energia;

    public Robot(int energia) {
        this.energia = energia;
    }

    public void atacar() throws EnergiaInsuficienteException {
        if (energia <= 0) {
            throw new EnergiaInsuficienteException("No hay suficiente energía para atacar.");
        }
        System.out.println("Robot atacando...");
        energia -= 10; // Disminuye la energía al atacar
    }

}
