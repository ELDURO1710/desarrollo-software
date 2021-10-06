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
public class Paquete {
    
    private int id;
    private int valor;
    private String fechaRecibido;
    private String fechaEntregado;
    private String desde;
    private String hacia;
    private boolean asegurado;

    public Paquete(int id, int valor, String fechaRecibido, String fechaEntregado, String desde, String hacia, boolean asegurado) {
        this.id = id;
        this.valor = valor;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntregado = fechaEntregado;
        this.desde = desde;
        this.hacia = hacia;
        this.asegurado = asegurado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public String getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(String fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHacia() {
        return hacia;
    }

    public void setHacia(String hacia) {
        this.hacia = hacia;
    }

    public boolean isAsegurado() {
        return asegurado;
    }

    public void setAsegurado(boolean asegurado) {
        this.asegurado = asegurado;
    }

   
    
    
    
}
