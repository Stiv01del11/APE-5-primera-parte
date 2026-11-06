import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        try {
            // 1. Comprobación previa
            if (!archivo.exists()) {
                // Si no existe la carpeta "datos", la creamos
                if (archivo.getParentFile() != null) {
                    archivo.getParentFile().mkdirs();
                }

                // 2. Creación controlada
                boolean creado = archivo.createNewFile();
                if (creado) {
                    System.out.println("El archivo no existía y se creó.");
                }
            } else {
                System.out.println("El archivo ya existía.");
            }

            // 3. Extracción de información
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getPath());

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
