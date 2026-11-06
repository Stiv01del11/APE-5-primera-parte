import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {

        // 1. Flujo de salida: BufferedWriter + FileWriter
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("materias.txt"))) {

            // 2. Escribimos 5 asignaturas
            String[] materias = {
                "Algoritmos",
                "Programación",
                "Matemáticas",
                "Base de Datos",
                "Inglés"
            };

            for (String materia : materias) {
                escritor.write(materia);
                // 3. Una asignatura por línea
                escritor.newLine();
            }

            System.out.println("Archivo materias.txt creado con 5 asignaturas.");

        // 4. Control de errores de escritura
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
        // El try-with-resources cierra el flujo solo (equivale a close())
    }
}
