/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "segmentoventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segmentoventa.findAll", query = "SELECT s FROM Segmentoventa s"),
    @NamedQuery(name = "Segmentoventa.findById", query = "SELECT s FROM Segmentoventa s WHERE s.id = :id"),
    @NamedQuery(name = "Segmentoventa.findByEstado", query = "SELECT s FROM Segmentoventa s WHERE s.estado = :estado"),
    @NamedQuery(name = "Segmentoventa.findByEliminada", query = "SELECT s FROM Segmentoventa s WHERE s.eliminada = :eliminada")})
public class Segmentoventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "Nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Estado")
    private Integer estado;
    @Column(name = "eliminada")
    private Integer eliminada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSegmento")
    private List<Tipolineamovil> tipolineamovilList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSegmento")
    private List<Tipoventa> tipoventaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSegmento")
    private List<Tipolineafija> tipolineafijaList;

    public Segmentoventa() {
    }

    public Segmentoventa(Integer id) {
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

    @XmlTransient
    public List<Tipolineamovil> getTipolineamovilList() {
        return tipolineamovilList;
    }

    public void setTipolineamovilList(List<Tipolineamovil> tipolineamovilList) {
        this.tipolineamovilList = tipolineamovilList;
    }

    @XmlTransient
    public List<Tipoventa> getTipoventaList() {
        return tipoventaList;
    }

    public void setTipoventaList(List<Tipoventa> tipoventaList) {
        this.tipoventaList = tipoventaList;
    }

    @XmlTransient
    public List<Tipolineafija> getTipolineafijaList() {
        return tipolineafijaList;
    }

    public void setTipolineafijaList(List<Tipolineafija> tipolineafijaList) {
        this.tipolineafijaList = tipolineafijaList;
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
        if (!(object instanceof Segmentoventa)) {
            return false;
        }
        Segmentoventa other = (Segmentoventa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Segmentoventa[ id=" + id + " ]";
    }
    
}
