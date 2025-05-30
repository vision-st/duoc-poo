package com.duoc.arena.robot.simulacion;

import com.duoc.arena.robot.base.Robot;
import com.duoc.arena.robot.combate.RobotAsaltoVolador;
import com.duoc.arena.robot.combate.RobotDefensa;
import com.duoc.arena.robot.combate.RobotSoporte;
import com.duoc.arena.robot.combate.RobotSoporteAutoreparable;
import com.duoc.arena.robot.interfaces.Autoreparable;
import com.duoc.arena.robot.interfaces.Volador;

public class SimuladorCombateFinal {
    public static void main(String[] args) {
        Robot[] escuadron = new Robot[4];
        escuadron[0] = new RobotAsaltoVolador("Asalto-A1", 100);
        escuadron[1] = new RobotDefensa("Defensa-B2", 120);
        escuadron[2] = new RobotSoporte("Soporte-C3", 90);
        escuadron[3] = new RobotSoporteAutoreparable("Soporte-D4", 110, "ZT-Alpha");

        System.out.println("=== INICIO DEL COMBATE EN LA ZONA 7 ===");

        for (Robot r : escuadron) {
            r.mostrarEstado();
            r.atacar();

            // Polimorfismo con instanceof para ejecutar habilidades únicas
            if (r instanceof Volador) {
                ((Volador) r).volar();
            }

            if (r instanceof Autoreparable) {
                ((Autoreparable) r).repararse();
            }

            System.out.println("---");
        }

        System.out.println("=== FIN DEL COMBATE ===");
    }
}
