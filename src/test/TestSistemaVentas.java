package test;

import sistemaventas.*;

public class TestSistemaVentas {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Cuchara", 10);
        Producto producto2 = new Producto("Tenedor", 15);
        Producto producto3 = new Producto("Plata", 50);
        Producto producto4 = new Producto("Cuchara", 10);
        Producto producto5 = new Producto("Tenedor", 15);
        Producto producto6 = new Producto("Plata", 50);
        Producto producto7 = new Producto("Cuchara", 10);
        Producto producto8 = new Producto("Tenedor", 15);
        Producto producto9 = new Producto("Plata", 50);
        Producto producto10 = new Producto("Camisa", 15);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1, producto2, producto3, producto4, producto5);
        
        orden1.mostrarOrden();
    }
}
