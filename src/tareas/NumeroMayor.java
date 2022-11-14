package tareas;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String args[]) {
        //Se inicializa la variable scanner para trabajar con la entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Se solicita la entrada de dos numero y se imprime el mayor de estos
        System.out.println("Tarea 5: El mayor de dos numeros\n");

        System.out.println("Proporciona el numero 1:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero 2");
        int num2 = Integer.parseInt(scanner.nextLine());

        int resultado = num1 > num2 ? num1 : num2;

        System.out.println("El numero mayor es:\n" + resultado);

        System.out.println("\n###\t###\t###\n");
    }
}
