import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalAcumulado = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            while (true) {
                System.out.print("Nombre del producto (o 'fin' para terminar): ");
                String nombre = sc.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());

                System.out.print("Cantidad vendida: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double totalPagar = subtotal - descuento;

                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);

                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write("Precio: " + precio + " | Cantidad: " + cantidad);
                bw.newLine();
                bw.write("Subtotal: " + subtotal + " | Descuento: " + descuento
                        + " | Total a pagar: " + totalPagar);
                bw.newLine();
                bw.write("------------------------------");
                bw.newLine();

                totalAcumulado += totalPagar;
            }

            bw.write("TOTAL ACUMULADO DE VENTAS: $" + totalAcumulado);
            bw.newLine();
            bw.write("============================");
            bw.newLine();

            System.out.println("Total acumulado: $" + totalAcumulado);
            System.out.println("Datos guardados en ventas.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: ingresa un número válido.");
        }

        sc.close();
    }
}
