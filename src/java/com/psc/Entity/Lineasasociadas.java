/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "lineasasociadas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lineasasociadas.findAll", query = "SELECT l FROM Lineasasociadas l"),
    @NamedQuery(name = "Lineasasociadas.findById", query = "SELECT l FROM Lineasasociadas l WHERE l.id = :id"),
    @NamedQuery(name = "Lineasasociadas.findByVentasidVentas", query = "SELECT l FROM Lineasasociadas l WHERE l.ventasidVentas = :ventasidVentas"),
    @NamedQuery(name = "Lineasasociadas.findByIdVentaidVentas", query = "SELECT l FROM Lineasasociadas l WHERE l.idVentaidVentas = :idVentaidVentas")})
public class Lineasasociadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Dni")
    private String dni;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Donante")
    private String donante;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ICC")
    private String icc;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Numero")
    private String numero;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Terminal")
    private String terminal;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Tipo")
    private String tipo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "TipoLinea")
    private String tipoLinea;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Titular")
    private String titular;
    @Column(name = "ventas_idVentas")
    private Integer ventasidVentas;
    @Column(name = "idVenta_idVentas")
    private Integer idVentaidVentas;
    @JoinColumn(name = "id_venta", referencedColumnName = "idVentas")
    @ManyToOne(optional = false)
    private Ventas idVenta;

    public Lineasasociadas() {
    }

    public Lineasasociadas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDonante() {
        return donante;
    }

    public void setDonante(String donante) {
        this.donante = donante;
    }

    public String getIcc() {
        return icc;
    }

    public void setIcc(String icc) {
        this.icc = icc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoLinea() {
        return tipoLinea;
    }

    public void setTipoLinea(String tipoLinea) {
        this.tipoLinea = tipoLinea;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getVentasidVentas() {
        return ventasidVentas;
    }

    public void setVentasidVentas(Integer ventasidVentas) {
        this.ventasidVentas = ventasidVentas;
    }

    public Integer getIdVentaidVentas() {
        return idVentaidVentas;
    }

    public void setIdVentaidVentas(Integer idVentaidVentas) {
        this.idVentaidVentas = idVentaidVentas;
    }

    public Ventas getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Ventas idVenta) {
        this.idVenta = idVenta;
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
        if (!(object instanceof Lineasasociadas)) {
            return false;
        }
        Lineasasociadas other = (Lineasasociadas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Lineasasociadas[ id=" + id + " ]";
    }
    
}
