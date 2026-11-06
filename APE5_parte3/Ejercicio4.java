import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {

        // 1. Objeto File con la ruta
        File archivo = new File("datos/temporal.txt");

        try {
            // 2. Si no existe, lo creamos
            if (!archivo.exists()) {
                if (archivo.getParentFile() != null) {
                    archivo.getParentFile().mkdirs();
                }
                archivo.createNewFile();
                System.out.println("Archivo temporal creado: " + archivo.getPath());
            } else {
                System.out.println("El archivo ya existía.");
            }

            // 3. Confirmación simulada del usuario
            boolean confirmarBorrado = true;

            // 4. Borramos solo si la confirmación es verdadera
            if (confirmarBorrado) {
                boolean eliminado = archivo.delete();
                System.out.println("¿Se eliminó el archivo? " + eliminado);
            } else {
                System.out.println("Borrado cancelado por el usuario.");
            }

        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
}
