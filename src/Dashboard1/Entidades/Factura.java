/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard1.Entidades;

/**
 *
 * @author DANILO
 */
public class Factura {
    
    private int numero;
    private int idCliente;
    private String fecha;
    private boolean pagado;
    private int medioPago;
    private int valorPagar;
    private int idEmpleado;

    public Factura(int numero, int idCliente, String fecha, boolean pagado, int medioPago, int valorPagar, int idEmpleado) {
        this.numero = numero;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.pagado = pagado;
        this.medioPago = medioPago;
        this.valorPagar = valorPagar;
        this.idEmpleado = idEmpleado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(int medioPago) {
        this.medioPago = medioPago;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
}
