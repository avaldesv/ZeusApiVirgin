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
@Table(name = "nomencladores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nomencladores.findAll", query = "SELECT n FROM Nomencladores n"),
    @NamedQuery(name = "Nomencladores.findByIdNomescladores", query = "SELECT n FROM Nomencladores n WHERE n.idNomescladores = :idNomescladores"),
    @NamedQuery(name = "Nomencladores.findByNombre", query = "SELECT n FROM Nomencladores n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "Nomencladores.findByNomescladorPadre", query = "SELECT n FROM Nomencladores n WHERE n.nomescladorPadre = :nomescladorPadre")})
public class Nomencladores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNomescladores")
    private Integer idNomescladores;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "NomescladorPadre")
    private Integer nomescladorPadre;
    @JoinColumn(name = "idCampana", referencedColumnName = "idCampana")
    @ManyToOne
    private Campanyas idCampana;

    public Nomencladores() {
    }

    public Nomencladores(Integer idNomescladores) {
        this.idNomescladores = idNomescladores;
    }

    public Integer getIdNomescladores() {
        return idNomescladores;
    }

    public void setIdNomescladores(Integer idNomescladores) {
        this.idNomescladores = idNomescladores;
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

    public Integer getNomescladorPadre() {
        return nomescladorPadre;
    }

    public void setNomescladorPadre(Integer nomescladorPadre) {
        this.nomescladorPadre = nomescladorPadre;
    }

    public Campanyas getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(Campanyas idCampana) {
        this.idCampana = idCampana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNomescladores != null ? idNomescladores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nomencladores)) {
            return false;
        }
        Nomencladores other = (Nomencladores) object;
        if ((this.idNomescladores == null && other.idNomescladores != null) || (this.idNomescladores != null && !this.idNomescladores.equals(other.idNomescladores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Nomencladores[ idNomescladores=" + idNomescladores + " ]";
    }
    
}
