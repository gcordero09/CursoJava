package test;

import proyectoherencia.Empleado;
import proyectoherencia.Cliente;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(12500.0, "Guillermo", 'M', 21, "Los Almendros");
        Empleado empleado2 = new Empleado(10000, "Juan", 'M', 11, "Los Almendros");
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        Cliente cliente1 = new Cliente(true, "Pedro", 'M', 30, "Los Achotes");
        System.out.println(cliente1);
    }
}
