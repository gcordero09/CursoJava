package proyectocubo;

public class Cubo {

    int ancho, alto, profundo;

    public Cubo() {

    }

    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
