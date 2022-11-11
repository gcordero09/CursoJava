
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        //Se inicializa la variable scanner para trabajar con la entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Se imprime un saludo
        System.out.println("Tarea 1: Saludar\n");

        System.out.println("Hola Mundo desde Java");

        System.out.println("\n###\t###\t###\n");

        //Se solicita la entrada de la informacion sobre un libro para despues imprimirla
        System.out.println("Tarea 2: Detalles libro\n");

        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);

        System.out.println("\n###\t###\t###\n");

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

        //Se solicita la entrada de la altura y el ancho de un rectangulo
        System.out.println("Tarea 4: Rectangulo\n");

        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(scanner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("Area: " + area + "\nPerimetro" + perimetro);

        System.out.println("\n###\t###\t###\n");

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
