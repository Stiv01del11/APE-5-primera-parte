# APE 5 — Manejo de archivos en Java

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=openjdk&logoColor=white)
![Tipo](https://img.shields.io/badge/Tipo-Pr%C3%A1ctica%20acad%C3%A9mica-blue)
![Estado](https://img.shields.io/badge/Estado-Completo-brightgreen)

Repositorio con los programas en Java de la **APE 5**, dedicada a la **lectura, escritura, creación y eliminación de archivos de texto** usando las clases `File`, `FileWriter`, `BufferedWriter` y `Scanner`. El trabajo está dividido en tres partes, cada una en su propia carpeta, y se acompaña de un documento Word con las capturas del código y su descripción.

---

## Tabla de contenido

1. [Descripción general](#descripción-general)
2. [Estructura del repositorio](#estructura-del-repositorio)
3. [Documento Word](#documento-word)
4. [Descripción de los códigos](#descripción-de-los-códigos)
   - [Parte 1](#parte-1--creación-escritura-y-eliminación-de-archivos)
   - [Parte 2](#parte-2--escritura-con-bufferedwriter-y-registro-de-datos)
   - [Parte 3](#parte-3--rutas-carpetas-agregar-contenido-y-borrado-controlado)
5. [Requisitos](#requisitos)
6. [Cómo ejecutar los programas](#cómo-ejecutar-los-programas)
7. [Archivos que generan los programas](#archivos-que-generan-los-programas)
8. [Conceptos aplicados](#conceptos-aplicados)
9. [Autor](#autor)

---

## Descripción general

Cada programa es una clase independiente con su método `main`, sin dependencias externas ni paquetes (`package`). Los ejercicios avanzan de menor a mayor dificultad:

| Parte | Carpeta | Tema | Ejercicios |
|:-----:|---------|------|:----------:|
| 1 | [`APE5_parte1`](https://github.com/Stiv01del11/APE-5-primera-parte/tree/main/APE5_parte1) | Crear, escribir y eliminar archivos | 3 |
| 2 | [`APE5_parte2`](https://github.com/Stiv01del11/APE-5-primera-parte/tree/main/APE5_parte2) | Escritura con `BufferedWriter` y registro de datos por teclado | 3 |
| 3 | [`APE5_parte3`](https://github.com/Stiv01del11/APE-5-primera-parte/tree/main/APE5_parte3) | Rutas, carpetas, modo *append* y borrado con confirmación | 4 |

---

## Estructura del repositorio

```text
APE-5-primera-parte/
├── README.md                    # Este archivo
├── APE5_Codigos_Java.docx       # Documento Word con capturas y descripción de cada código
│
├── APE5_parte1/
│   ├── CrearCurso.java
│   ├── EscribirArchivo.java
│   └── EliminarArchivo.java
│
├── APE5_parte2/
│   ├── Ejercicio1.java
│   ├── Ejercicio2.java
│   └── Ejercicio3.java
│
└── APE5_parte3/
    ├── Ejercicio1.java
    ├── Ejercicio2.java
    ├── Ejercicio3.java
    └── Ejercicio4.java
```

> Los nombres de clase `Ejercicio1`, `Ejercicio2`, etc. se repiten entre la parte 2 y la parte 3. Por eso cada carpeta se compila y ejecuta **por separado** (ver [Cómo ejecutar los programas](#cómo-ejecutar-los-programas)).

---

## Documento Word

📄 [**APE5_Codigos_Java.docx**](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_Codigos_Java.docx)

Documento editable (12 páginas, tamaño A4) que reúne todo el trabajo organizado por carpetas. Para cada ejercicio incluye:

- **Título y nombre del archivo** `.java` correspondiente.
- **Descripción** de lo que hace el programa.
- **Captura del código** con estilo de VS Code: ventana oscura, números de línea y resaltado de sintaxis. Los archivos más largos se dividen en dos capturas con su rango de líneas.
- **Puntos clave**: métodos y conceptos de Java que se aplican.

Los textos se pueden editar libremente en Word; las capturas son imágenes insertadas en el documento.

---

## Descripción de los códigos

### Parte 1 — Creación, escritura y eliminación de archivos

📁 Carpeta: [`APE5_parte1`](https://github.com/Stiv01del11/APE-5-primera-parte/tree/main/APE5_parte1)

| Ejercicio | Archivo | Qué hace | Conceptos |
|:---------:|---------|----------|-----------|
| 1 | [`CrearCurso.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte1/CrearCurso.java) | Crea el archivo `curso.txt`. Informa si se creó correctamente o si ya existía. | `File`, `createNewFile()`, `getName()`, `try-catch` con `IOException` |
| 2 | [`EscribirArchivo.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte1/EscribirArchivo.java) | Pide un mensaje por teclado y lo agrega al final de `estudiantes.txt` sin borrar lo anterior. | `Scanner`, `FileWriter` en modo *append*, `write()`, `close()` |
| 3 | [`EliminarArchivo.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte1/EliminarArchivo.java) | Intenta eliminar `estudiantes.txt` e indica si lo logró o si no existe o está en uso. | `File`, `delete()`, `if/else` |

### Parte 2 — Escritura con BufferedWriter y registro de datos

📁 Carpeta: [`APE5_parte2`](https://github.com/Stiv01del11/APE-5-primera-parte/tree/main/APE5_parte2)

| Ejercicio | Archivo | Qué hace | Conceptos |
|:---------:|---------|----------|-----------|
| 1 | [`Ejercicio1.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte2/Ejercicio1.java) | Pide nombre y calificación de **3 estudiantes** y los guarda en `estudiantes.txt`, un dato por línea. Reemplaza el contenido anterior. | `for`, `BufferedWriter`, `newLine()`, *try-with-resources* |
| 2 | [`Ejercicio2.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte2/Ejercicio2.java) | Registra productos (nombre, precio, cantidad) en `productos.txt`, calcula el **valor total** (precio × cantidad) y pregunta si se desea registrar otro. | `do-while`, modo *append*, `Double.parseDouble()`, `Integer.parseInt()`, `NumberFormatException` |
| 3 | [`Ejercicio3.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte2/Ejercicio3.java) | Registra ventas en `ventas.txt` hasta escribir `fin`. Calcula subtotal, aplica **10 % de descuento** si el subtotal es de 100 o más, y guarda el **total acumulado**. | `while (true)` con `break`, condicionales, acumuladores, modo *append* |

### Parte 3 — Rutas, carpetas, agregar contenido y borrado controlado

📁 Carpeta: [`APE5_parte3`](https://github.com/Stiv01del11/APE-5-primera-parte/tree/main/APE5_parte3)

| Ejercicio | Archivo | Qué hace | Conceptos |
|:---------:|---------|----------|-----------|
| 1 | [`Ejercicio1.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte3/Ejercicio1.java) | Comprueba si existe `datos/prueba.txt`. Si no, crea la carpeta `datos` y el archivo. Muestra nombre y ruta. | `exists()`, `getParentFile().mkdirs()`, `createNewFile()`, `getName()`, `getPath()` |
| 2 | [`Ejercicio2.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte3/Ejercicio2.java) | Crea `materias.txt` con **5 asignaturas**, una por línea, tomadas de un arreglo. | Arreglo `String[]`, *for-each*, `BufferedWriter`, *try-with-resources* |
| 3 | [`Ejercicio3.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte3/Ejercicio3.java) | Agrega **2 materias nuevas** (Redes y Sistemas Operativos) al final de `materias.txt` sin borrar las anteriores. | `FileWriter` con `true` (*append*), `newLine()` |
| 4 | [`Ejercicio4.java`](https://github.com/Stiv01del11/APE-5-primera-parte/blob/main/APE5_parte3/Ejercicio4.java) | Crea `datos/temporal.txt` si no existe y lo elimina **solo si** la confirmación (simulada con un `boolean`) es verdadera. | `mkdirs()`, `delete()`, variable booleana de confirmación |

---

## Requisitos

- **JDK 8 o superior** (se recomienda JDK 17 o más reciente).
- Una terminal (CMD, PowerShell, Bash, Terminal de macOS) o un editor como **VS Code** con el *Extension Pack for Java*.
- **Git** para clonar el repositorio (opcional: también se puede descargar como ZIP).

Verifica la instalación de Java:

```bash
java -version
javac -version
```

---

## Cómo ejecutar los programas

### 1. Clonar el repositorio

```bash
git clone https://github.com/Stiv01del11/APE-5-primera-parte.git
cd APE-5-primera-parte
```

También puedes descargar el [ZIP del repositorio](https://github.com/Stiv01del11/APE-5-primera-parte/archive/refs/heads/main.zip) y descomprimirlo.

### 2. Compilar y ejecutar por carpeta

Entra a la carpeta de la parte que quieras probar, compila con `javac` y ejecuta con `java` usando el **nombre de la clase** (sin `.java`). Ejecútalos desde esa misma carpeta, porque los archivos `.txt` se crean en el directorio actual.

**Parte 1**

```bash
cd APE5_parte1
javac CrearCurso.java EscribirArchivo.java EliminarArchivo.java

java CrearCurso
java EscribirArchivo
java EliminarArchivo
cd ..
```

**Parte 2**

```bash
cd APE5_parte2
javac Ejercicio1.java Ejercicio2.java Ejercicio3.java

java Ejercicio1
java Ejercicio2
java Ejercicio3
cd ..
```

**Parte 3**

```bash
cd APE5_parte3
javac Ejercicio1.java Ejercicio2.java Ejercicio3.java Ejercicio4.java

java Ejercicio1
java Ejercicio2
java Ejercicio3
java Ejercicio4
cd ..
```

> **Tip (Java 11 o superior):** puedes ejecutar un archivo directamente sin compilarlo antes, por ejemplo `java Ejercicio1.java`.

### 3. Ejecutar desde VS Code

1. Abre la carpeta de la parte que quieras probar (**Archivo → Abrir carpeta**), por ejemplo `APE5_parte2`.
2. Abre el archivo `.java` del ejercicio.
3. Pulsa **Run** (▶) sobre el método `main` o usa **Run → Run Without Debugging**.
4. Escribe los datos que pide el programa en la terminal integrada.

> Abrir una carpeta a la vez evita conflictos entre las clases que se llaman igual en las partes 2 y 3.

### 4. Limpiar archivos compilados

Los archivos `.class` se pueden borrar cuando termines:

```bash
# Linux / macOS / Git Bash
rm *.class

# Windows (CMD o PowerShell)
del *.class
```

### Orden recomendado de ejecución

Algunos programas dependen de archivos que crean otros:

1. **Parte 1:** `CrearCurso` → `EscribirArchivo` → `EliminarArchivo` (este último borra `estudiantes.txt`, que creó `EscribirArchivo`).
2. **Parte 2:** cualquier orden. Ten en cuenta que `Ejercicio1` **sobrescribe** `estudiantes.txt`.
3. **Parte 3:** `Ejercicio1` → `Ejercicio2` → `Ejercicio3` → `Ejercicio4` (`Ejercicio3` agrega materias al archivo que crea `Ejercicio2`).

---

## Archivos que generan los programas

| Archivo | Lo crea o modifica | Modo |
|---------|--------------------|------|
| `curso.txt` | Parte 1 · `CrearCurso` | Se crea vacío |
| `estudiantes.txt` | Parte 1 · `EscribirArchivo` | Agrega al final |
| `estudiantes.txt` | Parte 1 · `EliminarArchivo` | Lo elimina |
| `estudiantes.txt` | Parte 2 · `Ejercicio1` | Sobrescribe |
| `productos.txt` | Parte 2 · `Ejercicio2` | Agrega al final |
| `ventas.txt` | Parte 2 · `Ejercicio3` | Agrega al final |
| `datos/prueba.txt` | Parte 3 · `Ejercicio1` | Se crea (con su carpeta) |
| `materias.txt` | Parte 3 · `Ejercicio2` | Sobrescribe (5 materias) |
| `materias.txt` | Parte 3 · `Ejercicio3` | Agrega 2 materias al final |
| `datos/temporal.txt` | Parte 3 · `Ejercicio4` | Se crea y se elimina en la misma ejecución |

---

## Conceptos aplicados

| Concepto | Descripción | Dónde se usa |
|----------|-------------|--------------|
| `File` | Representa la ruta de un archivo o carpeta | Parte 1 y Parte 3 |
| `createNewFile()` / `mkdirs()` | Crean un archivo o las carpetas necesarias | Parte 1 · Ej. 1 · Parte 3 · Ej. 1 y 4 |
| `exists()` | Comprueba si un archivo ya existe | Parte 3 · Ej. 1 y 4 |
| `delete()` | Elimina un archivo | Parte 1 · Ej. 3 · Parte 3 · Ej. 4 |
| `FileWriter` | Escribe texto en un archivo; con `true` agrega al final | Todas las partes |
| `BufferedWriter` | Escritura con búfer y `newLine()` para saltos de línea | Parte 2 y Parte 3 |
| `Scanner` | Lee datos escritos por el usuario | Parte 1 · Ej. 2 · Parte 2 |
| *try-with-resources* | Cierra automáticamente el archivo al terminar | Parte 2 y Parte 3 |
| `IOException` / `NumberFormatException` | Control de errores de archivos y de conversión numérica | Todas las partes |
| `do-while`, `while`, `for`, *for-each* | Estructuras repetitivas | Parte 2 y Parte 3 |

---

## Autor

Desarrollado por [**Stiv01del11**](https://github.com/Stiv01del11) como parte de la **APE 5**.

📂 Repositorio: <https://github.com/Stiv01del11/APE-5-primera-parte>
