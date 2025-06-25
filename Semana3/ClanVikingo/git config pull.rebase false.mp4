# ⚔️ Clan Vikingo – Sistema del Código Eterno 🛡️

Bienvenido al proyecto **Clan Vikingo**, una simulación épica construida en Java que aplica los **7 principios fundamentales de la Programación Orientada a Objetos (POO)**. Este sistema representa la organización de un clan nórdico en batalla, gobernado por la lógica, la estructura modular... ¡y el honor del código limpio!

---

## 🧱 Estructura del Proyecto

```
clanvikingo/
├── app/           ← Punto de entrada (Main)
├── modelo/        ← Clases del dominio (Guerrero, Clan, etc.)
├── servicio/      ← Lógica de negocio
├── util/          ← Funciones auxiliares (opcional)
└── config/        ← Configuración (opcional)
```

---

## 📜 Clases Principales

| Clase              | Rol                                            |
|-------------------|-------------------------------------------------|
| `Guerrero`         | Clase abstracta base del clan                  |
| `Berserker`        | Subclase con fuerza descontrolada              |
| `Explorador`       | Subclase rápida y sigilosa                     |
| `Clan`             | Contenedor de guerreros                        |
| `ClanService`      | Muestra y organiza acciones del clan           |
| `Main`             | Interfaz básica de ejecución                   |

---

## ⚔️ Principios de POO aplicados

### 🔐 Encapsulamiento
Los atributos de las clases (`nombre`, `nivelFuerza`) están protegidos (`private` o `protected`) y accedidos mediante métodos `get`/`set`.

### 👪 Herencia
Las clases `Berserker` y `Explorador` heredan de `Guerrero`, reutilizando y especializando su comportamiento.

### 🌀 Polimorfismo
Desde `ClanService`, se llama a `guerrero.atacar()` sin importar si el objeto es un `Berserker` o `Explorador`.  
Cada clase responde con su propia lógica: ¡la esencia del combate personalizado!

### 🧩 Abstracción
`Guerrero` es una clase abstracta que define lo esencial de un combatiente, sin detalles concretos.

### ✍️ Sobreescritura
Cada subclase implementa su propia versión de `atacar()`, sobrescribiendo el método abstracto de la superclase.

### ➕ Sobrecarga
La clase `Guerrero` tiene múltiples constructores (`nombre`, `nombre + fuerza`), lo que permite flexibilidad en la creación de instancias.

### 📦 Modularidad (Organización en Paquetes)
El proyecto está dividido en paquetes por capas:
- `modelo`: lógica del dominio
- `servicio`: lógica de negocio
- `app`: ejecución principal

---

## 🧠 ¿Qué puedes aprender aquí?

- Cómo aplicar los principios SOLID de forma narrativa.
- Cómo estructurar un proyecto Java limpio y escalable.
- Cómo convertir una idea creativa (vikingos) en una solución orientada a objetos.

---

## 🛠️ Requisitos

- Java 8 o superior
- Apache NetBeans (recomendado)
- Ganas de luchar como un verdadero desarrollador vikingo

---

## 🧪 ¿Qué sigue?

- Puedes agregar más roles como `Curandero`, `Forjador`, o `Hechicero`.
- Implementar menús interactivos con `Scanner`.
- Conectar el sistema con archivos `.json` o bases de datos simples para persistencia de guerreros.

---

**Que Odin bendiga tu compilación y que el código compile a la primera.**  
🛡️ `Skål!`
