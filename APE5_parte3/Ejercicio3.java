import java.io.File;

public class EliminarArchivo {

    public static void main(String[] args) {

        // Crear un objeto File
        File archivo = new File("estudiantes.txt");

        // Comprobar si se puede eliminar
        if (archivo.delete()) {

            System.out.println("El archivo "
                    + archivo.getName()
                    + " se eliminó correctamente.");

        } else {

            System.out.println("No se pudo eliminar el archivo.");
            System.out.println("Puede que no exista o esté en uso.");

        }
    }
}
