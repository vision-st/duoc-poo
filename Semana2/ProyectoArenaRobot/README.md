# 🤖 Proyecto A.R.E.N.A. – Simulación de Combate de Robots

**Año 3047.**  
La humanidad está al borde del colapso. Las colonias de resistencia han desarrollado un sistema de defensa autónomo conocido como **A.R.E.N.A.** (Autómatas Reforzados para Enfrentamientos Nocturnos Avanzados).  
Este proyecto es el núcleo de esa defensa: una simulación de combate entre robots con habilidades especializadas, construidos siguiendo los principios más sagrados del diseño orientado a objetos.

---

## 🧩 Estructura del Código

La simulación fue escrita en **Java**, respetando los principios fundamentales de la Programación Orientada a Objetos:

### 🔹 1. Clases Abstractas
> El concepto de `Robot` nace como una plantilla pura. Una clase abstracta que **no puede ser instanciada**, pero que establece la existencia y la obligación de atacar.  
> Todos los robots especializados heredan de esta clase madre.

```java
public abstract class Robot {
    public abstract void atacar();
}
```

---

### 🔹 2. Herencia
> Robots como `RobotAsalto`, `RobotDefensa` y `RobotSoporte` **heredan del arquetipo `Robot`**, compartiendo atributos y sobreescribiendo comportamientos específicos de ataque.

```java
public class RobotAsalto extends Robot {
    @Override
    public void atacar() { ... }
}
```

---

### 🔹 3. Polimorfismo
> Desde la consola de combate, **todos los robots son tratados como `Robot`**, pero cada uno ejecuta su ataque según su clase real.  
> Esto permite que múltiples formas (polymorphé) se manifiesten a través de una única interfaz de control.

```java
for (Robot r : escuadron) {
    r.atacar(); // Se ejecuta el ataque específico de cada robot
}
```

---

### 🔹 4. Interfaces
> Algunas unidades poseen **habilidades especiales**: pueden volar (`Volador`) o autorepararse (`Autoreparable`).  
> Estas habilidades no dependen del tipo de robot, sino de los **contratos** que cada uno decide cumplir.

```java
interface Volador {
    void volar();
}
```

---

### 🔹 5. Sobrescritura y Sobrecarga
> Los métodos como `atacar()` han sido **sobrescritos** por cada robot especializado, y **sobrecargados** para adaptarse a distintas estrategias de combate.

```java
public void atacar(String tipo) { ... } // Sobrecarga
@Override
public void atacar() { ... }            // Sobrescritura
```

---

### 🔹 6. Constructores
> Cada robot es **instanciado con parámetros únicos**, e incluso configurado con diferentes niveles de detalle gracias a la **sobrecarga de constructores**.

```java
public RobotSoporte(String nombre, int energia)
public RobotSoporte(String nombre, int energia, String modelo)
```

---

## ⚔️ Simulación de Combate

El programa principal (`SimuladorCombateFinal.java`) crea una flota mixta de robots, imprime su estado, ejecuta sus ataques y aplica habilidades adicionales si las implementan.

```
=== INICIO DEL COMBATE EN LA ZONA 7 ===
Robot: Asalto-A1 | Energía: 100
Asalto-A1 dispara su cañón de plasma.
Asalto-A1 se eleva con propulsores antigravedad.
---
Robot: Defensa-B2 | Energía: 120
Defensa-B2 activa barrera de impacto defensiva.
---
Robot: Soporte-C3 | Energía: 90
Soporte-C3 (Estándar) lanza pulso de soporte.
---
Robot: Soporte-D4 | Energía: 110
Soporte-D4 (ZT-Alpha) lanza pulso de soporte.
Soporte-D4 activa protocolo de autorreparación.
===
```

---

## 🧠 Conclusión

> Este proyecto no es solo una simulación. Es una **metáfora del diseño limpio, extensible y reutilizable**.  
> Cada clase, cada línea, fue forjada como una herramienta de resistencia.  
> Porque mientras haya orden en el código, hay esperanza en el caos.

---

## ▶️ Instrucciones para compilar

1. Asegúrate de tener Java 11 o superior instalado.
2. Compila los archivos:
```bash
javac *.java
```
3. Ejecuta la simulación:
```bash
java SimuladorCombateFinal
```

---

## 🛡️ Autor

**Desarrollado como parte del módulo Desarrollo Orientado a Objetos I (PRY2202) - Semana 2**  
Simulación escrita por los últimos programadores de la humanidad... o por ti, desde tu terminal.

---

## 📜 Licencia

Este código es libre de uso, pero su espíritu solo pertenece a la **Resistencia**.
