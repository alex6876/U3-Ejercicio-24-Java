Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Dispositivos Tecnológicos y Fichas Técnicas (Herencia, Sobrescritura y Uso de `super` en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 📱 Simulación de Fichas Técnicas de Dispositivos (Herencia y Sobrescritura en Java)

Este proyecto es una aplicación en Java que modela un catálogo de dispositivos tecnológicos, implementando una jerarquía de clases mediante herencia para gestionar equipos especializados como teléfonos inteligentes (`Smartphone`) y computadoras portátiles (`Laptop`). Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores e invocación de métodos base mediante la palabra reservada `super`, y la sobrescritura de comportamientos (`@Override`) en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general y sus respectivas subclases especializadas, acompañadas por un punto de ejecución:

* **`Dispositivo`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier equipo tecnológico.
* **Atributos protegidos (`protected`)**: `marca`, `modelo` y `precioBase`, permitiendo que las clases hijas accedan directamente a la información básica del producto.
* **Constructor**: Inicializa los datos comunes del dispositivo tecnológico.
* **Método operativo**: `mostrarInformacion()` para desplegar por consola la marca, modelo y precio base del equipo.


* **`Smartphone`**: Extiende de `Dispositivo` para modelar teléfonos celulares avanzados.
* **Atributos privados (`private`)**: `megapixelesCamara` y `almacenamiento` (en GB).
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura las especificaciones de cámara y memoria interna.
* **Sobrescritura (`@Override`)**: Extiende el comportamiento de `mostrarInformacion()`, utilizando `super.mostrarInformacion()` para reutilizar la lógica de la clase base y añadiendo los detalles específicos del teléfono.


* **`Laptop`**: Extiende de `Dispositivo` para modelar computadoras portátiles.
* **Atributos privados (`private`)**: `procesador` y `memoriaRAM` (en GB).
* **Constructor**: Utiliza `super(...)` y asigna el procesador y la memoria RAM del equipo.
* **Sobrescritura (`@Override`)**: Personaliza la visualización de la ficha técnica invocando primero a `super.mostrarInformacion()` y agregando las especificaciones de hardware correspondientes.


* **`Main`**: Punto de entrada del programa. Instancia un smartphone y una laptop con especificaciones reales, y ejecuta sus respectivos métodos de visualización polimórfica para imprimir por consola las fichas técnicas completas.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Reutilización Eficiente con `super`:** Las subclases evitan duplicar código al invocar `super.mostrarInformacion()`, combinando la información genérica del dispositivo con sus propiedades exclusivas.
2. **Encapsulamiento de Especificaciones Particulares:** Los detalles técnicos específicos de cada tipo de dispositivo (`megapixelesCamara`, `almacenamiento`, `procesador`, `memoriaRAM`) se protegen mediante modificadores privados dentro de sus respectivas clases.
3. **Polimorfismo en la Presentación de Datos:** Cada subclase adapta el formato de salida por consola mediante la sobrescritura de métodos, ofreciendo un reporte estructurado y especializado para el usuario.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== FICHA TÉCNICA SMARTPHONE ===
Marca: Samsung
Modelo: Galaxy S24
Precio base: $1200000.0
Cámara: 50 MP
Almacenamiento: 256 GB

=== FICHA TÉCNICA LAPTOP ===
Marca: Lenovo
Modelo: IdeaPad 3
Precio base: $950000.0
Procesador: Intel Core i5
Memoria RAM: 16 GB

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía y Especialización de Clases:** Modelado del dominio tecnológico mediante una estructura limpia de herencia (`Dispositivo` como superclase de `Smartphone` y `Laptop`).
* **Invocación de Miembros Base (`super`):** Uso estratégico de la palabra clave `super` tanto para reutilizar constructores como para extender métodos heredados.
* **Diseño Modular:** Clara separación entre la lógica del dominio de hardware y la ejecución de casos de prueba simulados en el cliente (`Main`).
