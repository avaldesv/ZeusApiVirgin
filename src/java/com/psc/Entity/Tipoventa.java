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
@Table(name = "tipoventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoventa.findAll", query = "SELECT t FROM Tipoventa t"),
    @NamedQuery(name = "Tipoventa.findById", query = "SELECT t FROM Tipoventa t WHERE t.id = :id"),
    @NamedQuery(name = "Tipoventa.findByEstado", query = "SELECT t FROM Tipoventa t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tipoventa.findByEliminada", query = "SELECT t FROM Tipoventa t WHERE t.eliminada = :eliminada")})
public class Tipoventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Lob
    @Size(max = 65535)
    @Column(name = "ponderacion")
    private String ponderacion;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "eliminada")
    private Integer eliminada;
    @JoinColumn(name = "id_segmento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Segmentoventa idSegmento;

    public Tipoventa() {
    }

    public Tipoventa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getEliminada() {
        return eliminada;
    }

    public void setEliminada(Integer eliminada) {
        this.eliminada = eliminada;
    }

    public Segmentoventa getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(Segmentoventa idSegmento) {
        this.idSegmento = idSegmento;
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
        if (!(object instanceof Tipoventa)) {
            return false;
        }
        Tipoventa other = (Tipoventa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Tipoventa[ id=" + id + " ]";
    }
    
}
