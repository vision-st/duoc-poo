# 🧠 Ejemplos de Excepciones en Java

¡Hola mundo programador!

Este repositorio contiene una colección de ejemplos prácticos para comprender a fondo el manejo de **excepciones en Java**, uno de los temas más importantes si quieres escribir código **robusto, profesional y mantenible**. Aquí no solo aprenderás la sintaxis, sino también **el "por qué" y el "cuándo"** de cada estructura.

---

## 📦 Contenidos del proyecto

1. `LeerArchivo.java`  
   🔹 Ejemplo de excepción **chequeada** usando `IOException`.  
   🔹 Muestra cómo capturar errores al leer archivos con `try/catch`.

2. `EjemploTryCatchFinally.java`  
   🔹 Uso completo de `try`, `catch`, y `finally`.  
   🔹 Simulación de división por cero con manejo de flujo elegante.

3. `AventuraMarioSinTryCatch.java`  
   🔹 Demostración de qué ocurre cuando **NO** se maneja una excepción.  
   🔹 El programa se cae y lanza una `ArithmeticException`.

4. `EjemploThrow.java`  
   🔹 Ejemplo del uso de `throw` para **lanzar una excepción manualmente**.  
   🔹 Control de acceso por edad usando `IllegalArgumentException`.

5. `EjemploThrows.java`  
   🔹 Declaración de excepciones en la **firma de métodos** (`throws`).  
   🔹 Uso de propagación con `IOException` desde un método de lectura.

6. `EnergiaInsuficienteException.java`  
   🔹 Creación de una **excepción personalizada**.  
   🔹 Extiende `Exception` para modelar errores de dominio reales.

7. `Robot.java`  
   🔹 Clase que simula un robot de combate.  
   🔹 Lanza excepción si intenta atacar con poca energía.

8. `Combate.java`  
   🔹 Simula el uso de un robot y captura la excepción lanzada.  
   🔹 Ideal para aprender a usar excepciones personalizadas en flujo real.

---

## 🧪 ¿Qué aprenderás aquí?

- Qué son las excepciones en Java y su **jerarquía** (`Throwable`, `Error`, `Exception`)
- Diferencia entre excepciones **chequeadas** y **no chequeadas**
- Cómo usar `try`, `catch`, `finally` y evitar caídas de programa
- Cómo usar `throw` y `throws`
- Cómo crear tus **propias excepciones personalizadas**
- Cuándo conviene capturar y cuándo **NO** capturar errores como `OutOfMemoryError`

---

## 💡 Recomendaciones

- Siempre maneja las excepciones **con sentido**, no con `catch(Exception e)` por defecto.
- Usa excepciones personalizadas para que tu sistema sea **más expresivo**.
- Nunca atrapes errores (`Error`) como si fueran excepciones normales.
- El bloque `finally` es tu mejor amigo para **cerrar recursos o dejar el sistema limpio**.

---

## 🤖 Bonus del profe Jorge

_"Las excepciones son como ese escudo de emergencia que tienes cuando todo está a punto de romperse. No evitan que ocurran errores, pero sí que tu sistema explote sin explicación."_  

_"Aprende a usarlas bien, y estarás escribiendo como los profesionales."_

---

## 🗂 Estructura recomendada

```
excepciones-java/
│
├── src/
│   ├── LeerArchivo.java
│   ├── EjemploTryCatchFinally.java
│   ├── AventuraMarioSinTryCatch.java
│   ├── EjemploThrow.java
│   ├── EjemploThrows.java
│   ├── EnergiaInsuficienteException.java
│   ├── Robot.java
│   └── Combate.java
│
└── README.md
```

---

## 📎 Requisitos

- Java 8 o superior
- IDE como IntelliJ, NetBeans o VSCode
- Ganas de aprender 💪

---

## 📬 ¿Dudas o sugerencias?

Déjalas en el foro, en los comentarios o crea un issue si estás en GitHub.  
¡Estoy para ayudarte!

---

**Profe Jorge Carmona**  
_Java Dev & Mentor de OOP_  
[www.linkedin.com/in/jecarmona](https://www.linkedin.com/in/jecarmona)
