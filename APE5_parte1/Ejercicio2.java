import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Escribe un mensaje: ");
            String mensaje = teclado.nextLine();

            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            escritor.write(mensaje + "\n");

            escritor.close();

            System.out.println("La información se guardó correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        teclado.close();
    }
}
