package tareas;

import java.util.Scanner;

public class TiendaLibros {

    public static void main(String args[]) {
        //Se inicializa la variable scanner para trabajar con la entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Se solicita el nombre, id, precio y envio para realizar la venta de un libro
        System.out.println("Tarea 3: Tienda de libros\n");

        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporcionar el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id + "\nPrecio: $" + precio + "\nEnvio Gratuito: " + envioGratuito);

        System.out.println("\n###\t###\t###\n");
    }

}
