package tareas;

import java.util.Scanner;

public class DetallesLibro {

    public static void main(String args[]) {
        //Se inicializa la variable scanner para trabajar con la entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Se solicita la entrada de la informacion sobre un libro para despues imprimirla
        System.out.println("Tarea 2: Detalles libro\n");

        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);

        System.out.println("\n###\t###\t###\n");
    }

}
