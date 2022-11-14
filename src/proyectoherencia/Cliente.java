package proyectoherencia;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente() {
        this.idCliente = ++this.contadorCliente;
    }

    public Cliente(boolean vip) {
        this();
        this.fechaRegistro = new Date();
        this.vip = vip;
    }

    public Cliente(boolean vip, String nombre, char genero, int edad, String direccion) {
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.fechaRegistro = new Date();
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}').append(super.toString());
        return sb.toString();
    }

}
