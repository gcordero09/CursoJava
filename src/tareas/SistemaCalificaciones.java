package tareas;

import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String args[]) {
        //Se inicializa la variable scanner para trabajar con la entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Se solicita la entrada de un valor entre 0 y 10 y se imprime una calificacion
        System.out.println("Tarea 6: Sistema de Calificaciones\n");
        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(scanner.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion == 8) {
            System.out.println("B");
        } else if (calificacion == 7) {
            System.out.println("C");
        } else if (calificacion == 6) {
            System.out.println("D");
        } else if (calificacion < 6 && calificacion >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
    }

}
