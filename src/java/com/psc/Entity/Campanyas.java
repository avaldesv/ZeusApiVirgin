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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "campanyas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campanyas.findAll", query = "SELECT c FROM Campanyas c"),
    @NamedQuery(name = "Campanyas.findByIdCampana", query = "SELECT c FROM Campanyas c WHERE c.idCampana = :idCampana"),
    @NamedQuery(name = "Campanyas.findByNombre", query = "SELECT c FROM Campanyas c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Campanyas.findByEliminada", query = "SELECT c FROM Campanyas c WHERE c.eliminada = :eliminada")})
public class Campanyas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCampana")
    private Integer idCampana;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eliminada")
    private int eliminada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCampanya")
    private List<Usuarios> usuariosList;
    @OneToMany(mappedBy = "idCampana")
    private List<Nomencladores> nomencladoresList;

    public Campanyas() {
    }

    public Campanyas(Integer idCampana) {
        this.idCampana = idCampana;
    }

    public Campanyas(Integer idCampana, int eliminada) {
        this.idCampana = idCampana;
        this.eliminada = eliminada;
    }

    public Integer getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(Integer idCampana) {
        this.idCampana = idCampana;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEliminada() {
        return eliminada;
    }

    public void setEliminada(int eliminada) {
        this.eliminada = eliminada;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @XmlTransient
    public List<Nomencladores> getNomencladoresList() {
        return nomencladoresList;
    }

    public void setNomencladoresList(List<Nomencladores> nomencladoresList) {
        this.nomencladoresList = nomencladoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCampana != null ? idCampana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campanyas)) {
            return false;
        }
        Campanyas other = (Campanyas) object;
        if ((this.idCampana == null && other.idCampana != null) || (this.idCampana != null && !this.idCampana.equals(other.idCampana))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Campanyas[ idCampana=" + idCampana + " ]";
    }
    
}
