package proyectocubo;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cubo cubo1 = new Cubo();
        
        System.out.println("Proporcione el alto:");
        cubo1.alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporcione el ancho:");
        cubo1.ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporcione lo profundo:");
        cubo1.profundo = Integer.parseInt(scanner.nextLine());
        
        System.out.println("El volumen del cubo es igual a:" + cubo1.calcularVolumen());
        
        Cubo cubo2 = new Cubo(2, 5, 4);
        System.out.println("El volumen del cubo es igual a:" + cubo2.calcularVolumen());
    }
    
    
}
