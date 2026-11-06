import java.io.File;
import java.io.IOException;

public class CrearCurso {

    public static void main(String[] args) {

        try {
            // Crear un objeto File
            File archivo = new File("curso.txt");

            // Crear el archivo
            if (archivo.createNewFile()) {

                System.out.println("Archivo creado correctamente: "
                        + archivo.getName());

            } else {

                System.out.println("El archivo ya existe: "
                        + archivo.getName());
            }

        } catch (IOException e) {

            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();

        }
    }
}
