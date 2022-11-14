package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora... computadoras) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            for (int i = 0; i < computadoras.length; i++) {
                this.computadoras[this.contadorComputadoras++] = computadoras[i];
            }
        } else {
            System.out.println("Has superado el límite: " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadoras de la orden #" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
