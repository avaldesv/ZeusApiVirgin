/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "asegurados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asegurados.findAll", query = "SELECT a FROM Asegurados a"),
    @NamedQuery(name = "Asegurados.findByIdAsegurados", query = "SELECT a FROM Asegurados a WHERE a.idAsegurados = :idAsegurados"),
    @NamedQuery(name = "Asegurados.findByApellidos", query = "SELECT a FROM Asegurados a WHERE a.apellidos = :apellidos"),
    @NamedQuery(name = "Asegurados.findByCorreo", query = "SELECT a FROM Asegurados a WHERE a.correo = :correo"),
    @NamedQuery(name = "Asegurados.findByDocumentoIdentidad", query = "SELECT a FROM Asegurados a WHERE a.documentoIdentidad = :documentoIdentidad"),
    @NamedQuery(name = "Asegurados.findByEstadocivil", query = "SELECT a FROM Asegurados a WHERE a.estadocivil = :estadocivil"),
    @NamedQuery(name = "Asegurados.findByFechaNacimineto", query = "SELECT a FROM Asegurados a WHERE a.fechaNacimineto = :fechaNacimineto"),
    @NamedQuery(name = "Asegurados.findByMovil", query = "SELECT a FROM Asegurados a WHERE a.movil = :movil"),
    @NamedQuery(name = "Asegurados.findByNombre", query = "SELECT a FROM Asegurados a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Asegurados.findByParentesco", query = "SELECT a FROM Asegurados a WHERE a.parentesco = :parentesco"),
    @NamedQuery(name = "Asegurados.findBySexo", query = "SELECT a FROM Asegurados a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Asegurados.findByTipodocumentoIdentidad", query = "SELECT a FROM Asegurados a WHERE a.tipodocumentoIdentidad = :tipodocumentoIdentidad"),
    @NamedQuery(name = "Asegurados.findByVentasDKVidVentas", query = "SELECT a FROM Asegurados a WHERE a.ventasDKVidVentas = :ventasDKVidVentas")})
public class Asegurados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAsegurados")
    private Integer idAsegurados;
    @Size(max = 255)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 255)
    @Column(name = "correo")
    private String correo;
    @Size(max = 255)
    @Column(name = "documentoIdentidad")
    private String documentoIdentidad;
    @Size(max = 255)
    @Column(name = "estadocivil")
    private String estadocivil;
    @Column(name = "fechaNacimineto")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimineto;
    @Size(max = 255)
    @Column(name = "movil")
    private String movil;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "parentesco")
    private String parentesco;
    @Size(max = 255)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 255)
    @Column(name = "TipodocumentoIdentidad")
    private String tipodocumentoIdentidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VentasDKV_idVentas")
    private int ventasDKVidVentas;
    @JoinColumn(name = "ventas_idVentas", referencedColumnName = "idVentas")
    @ManyToOne(optional = false)
    private Ventas ventasidVentas;

    public Asegurados() {
    }

    public Asegurados(Integer idAsegurados) {
        this.idAsegurados = idAsegurados;
    }

    public Asegurados(Integer idAsegurados, int ventasDKVidVentas) {
        this.idAsegurados = idAsegurados;
        this.ventasDKVidVentas = ventasDKVidVentas;
    }

    public Integer getIdAsegurados() {
        return idAsegurados;
    }

    public void setIdAsegurados(Integer idAsegurados) {
        this.idAsegurados = idAsegurados;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipodocumentoIdentidad() {
        return tipodocumentoIdentidad;
    }

    public void setTipodocumentoIdentidad(String tipodocumentoIdentidad) {
        this.tipodocumentoIdentidad = tipodocumentoIdentidad;
    }

    public int getVentasDKVidVentas() {
        return ventasDKVidVentas;
    }

    public void setVentasDKVidVentas(int ventasDKVidVentas) {
        this.ventasDKVidVentas = ventasDKVidVentas;
    }

    public Ventas getVentasidVentas() {
        return ventasidVentas;
    }

    public void setVentasidVentas(Ventas ventasidVentas) {
        this.ventasidVentas = ventasidVentas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsegurados != null ? idAsegurados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asegurados)) {
            return false;
        }
        Asegurados other = (Asegurados) object;
        if ((this.idAsegurados == null && other.idAsegurados != null) || (this.idAsegurados != null && !this.idAsegurados.equals(other.idAsegurados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Asegurados[ idAsegurados=" + idAsegurados + " ]";
    }
    
}
