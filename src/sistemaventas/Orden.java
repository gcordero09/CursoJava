package sistemaventas;

public class Orden {

    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public Producto[] getProductos() {
        return this.productos;
    }

    public void agregarProducto(Producto... productos) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            for (Producto producto : productos) {
                this.productos[this.contadorProductos++] = producto;
            }
        } else {
            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id orden: " + this.idOrden);
        double totalOrden = calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);

        }
    }
}
