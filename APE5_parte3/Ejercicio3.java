import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {

        // 1. Abrimos en modo append = true (agregar al final, NO borrar)
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("materias.txt", true))) {

            // 2. Añadimos 2 materias nuevas al final
            escritor.newLine();
            escritor.write("Redes");
            escritor.newLine();
            escritor.write("Sistemas Operativos");

            System.out.println("Se agregaron 2 materias al final sin borrar las anteriores.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
        // 3. El flujo se cierra solo con try-with-resources
    }
}
