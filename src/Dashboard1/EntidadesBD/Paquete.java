/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard1.EntidadesBD;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DANILO
 */
@Entity
@Table(name = "paquete")
@NamedQueries({
    @NamedQuery(name = "Paquete.findAll", query = "SELECT p FROM Paquete p"),
    @NamedQuery(name = "Paquete.findById", query = "SELECT p FROM Paquete p WHERE p.id = :id"),
    @NamedQuery(name = "Paquete.findByPeso", query = "SELECT p FROM Paquete p WHERE p.peso = :peso"),
    @NamedQuery(name = "Paquete.findByLargo", query = "SELECT p FROM Paquete p WHERE p.largo = :largo"),
    @NamedQuery(name = "Paquete.findByAncho", query = "SELECT p FROM Paquete p WHERE p.ancho = :ancho"),
    @NamedQuery(name = "Paquete.findByAlto", query = "SELECT p FROM Paquete p WHERE p.alto = :alto"),
    @NamedQuery(name = "Paquete.findByValorDeclarado", query = "SELECT p FROM Paquete p WHERE p.valorDeclarado = :valorDeclarado"),
    @NamedQuery(name = "Paquete.findByFechaRecibido", query = "SELECT p FROM Paquete p WHERE p.fechaRecibido = :fechaRecibido"),
    @NamedQuery(name = "Paquete.findByFechaEntregado", query = "SELECT p FROM Paquete p WHERE p.fechaEntregado = :fechaEntregado")})
public class Paquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "largo")
    private Integer largo;
    @Column(name = "ancho")
    private Integer ancho;
    @Column(name = "alto")
    private Integer alto;
    @Column(name = "valor_declarado")
    private Integer valorDeclarado;
    @Column(name = "fecha_recibido")
    @Temporal(TemporalType.DATE)
    private Date fechaRecibido;
    @Column(name = "fecha_entregado")
    @Temporal(TemporalType.DATE)
    private Date fechaEntregado;
    @JoinColumn(name = "remitente", referencedColumnName = "id")
    @ManyToOne
    private Cliente remitente;
    @JoinColumn(name = "destinatario", referencedColumnName = "id")
    @ManyToOne
    private Cliente destinatario;

    public Paquete() {
    }

    public Paquete(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Integer valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public Cliente getRemitente() {
        return remitente;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquete)) {
            return false;
        }
        Paquete other = (Paquete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dashboard1.EntidadesBD.Paquete[ id=" + id + " ]";
    }
    
}
