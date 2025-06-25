package com.duoc.gestiont.principal;

import com.duoc.gestiont.entidades.Desarrollador;
import com.duoc.gestiont.entidades.Proyecto;
import com.duoc.gestiont.entidades.Tarea;

public class Main {

    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto("Proyecto de analisis");

        Tarea t1 = new Tarea("Generar Requerimientos", "Generar los requerimientos del proyecto", 1);
        Tarea t2 = new Tarea("Analizar Requerimientos", "Analizar los requerimientos del proyecto", 2);
        Tarea t3 = new Tarea("Validar Requerimientos", "Validar los requerimientos del proyecto", 3);
        Tarea t4 = new Tarea("Documentar Requerimientos", "Documentar los requerimientos del proyecto", 4);
        Tarea t5 = new Tarea("Documentar Requerimientos", "Documentar los requerimientos del proyecto", 5);

        proyecto1.agregarTarea(t1);
        proyecto1.agregarTarea(t2);
        proyecto1.agregarTarea(t3);
        proyecto1.agregarTarea(t4);
        proyecto1.agregarTarea(t5);

        System.out.println("Tareas del proyecto: " + proyecto1.getNombre());
        for (Tarea tarea : proyecto1.obtenerTareas()) {
            System.out.println(tarea);
        }

        Desarrollador dev = new Desarrollador("Karla","Dev senior backend java expert nivel X");

        dev.asignarTarea(t1);
        dev.asignarTarea(t2);
        dev.asignarTarea(t3);
        dev.asignarTarea(t4);
        dev.asignarTarea(t5); // no deberia agregarse, ya que ya existe en el set

        System.out.println("Tareas asignadas al desarrollador: " + dev.getNombre());
        System.out.println(dev);



    }

}
