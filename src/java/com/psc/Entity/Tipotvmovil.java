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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "tipotvmovil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipotvmovil.findAll", query = "SELECT t FROM Tipotvmovil t"),
    @NamedQuery(name = "Tipotvmovil.findById", query = "SELECT t FROM Tipotvmovil t WHERE t.id = :id"),
    @NamedQuery(name = "Tipotvmovil.findByEstado", query = "SELECT t FROM Tipotvmovil t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tipotvmovil.findByIdSegmento", query = "SELECT t FROM Tipotvmovil t WHERE t.idSegmento = :idSegmento"),
    @NamedQuery(name = "Tipotvmovil.findByEliminada", query = "SELECT t FROM Tipotvmovil t WHERE t.eliminada = :eliminada")})
public class Tipotvmovil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Integer estado;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ponderacion")
    private String ponderacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_segmento")
    private int idSegmento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eliminada")
    private int eliminada;

    public Tipotvmovil() {
    }

    public Tipotvmovil(Integer id) {
        this.id = id;
    }

    public Tipotvmovil(Integer id, int idSegmento, int eliminada) {
        this.id = id;
        this.idSegmento = idSegmento;
        this.eliminada = eliminada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    public int getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(int idSegmento) {
        this.idSegmento = idSegmento;
    }

    public int getEliminada() {
        return eliminada;
    }

    public void setEliminada(int eliminada) {
        this.eliminada = eliminada;
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
        if (!(object instanceof Tipotvmovil)) {
            return false;
        }
        Tipotvmovil other = (Tipotvmovil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Tipotvmovil[ id=" + id + " ]";
    }
    
}
