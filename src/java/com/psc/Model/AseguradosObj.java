/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.*;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AVV
 */
public class AseguradosObj {

  
  
    private Integer idAsegurados;
    
    private Date fechaNacimineto;
 
    private String sexo;
 
    private String nombre;
    
    private String apellidos;
    
    private String documentoIdentidad;
  
    private String movil;
   
    private String correo;
   
    private String parentesco;
  
    private String tipodocumentoIdentidad;
   
    private String estadocivil;
    
    private VentasObj ventasDKVidVentas;

    public AseguradosObj() {
    }

    public AseguradosObj(Asegurados aseg) {
        this.idAsegurados = aseg.getIdAsegurados();
        this.fechaNacimineto = aseg.getFechaNacimineto();
        this.sexo = aseg.getSexo();
        this.nombre = aseg.getNombre();
        this.apellidos = aseg.getApellidos();
        this.documentoIdentidad = aseg.getTipodocumentoIdentidad();
        this.movil = aseg.getMovil();
        this.correo = aseg.getCorreo();
        this.parentesco = aseg.getParentesco();
        this.tipodocumentoIdentidad = aseg.getTipodocumentoIdentidad();
        this.estadocivil = aseg.getEstadocivil();
        this.ventasDKVidVentas = new VentasObj(aseg.getVentasDKVidVentas());
    }

    
    
    public AseguradosObj(Integer idAsegurados) {
        this.idAsegurados = idAsegurados;
    }

    public Integer getIdAsegurados() {
        return idAsegurados;
    }

    public void setIdAsegurados(Integer idAsegurados) {
        this.idAsegurados = idAsegurados;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipodocumentoIdentidad() {
        return tipodocumentoIdentidad;
    }

    public void setTipodocumentoIdentidad(String tipodocumentoIdentidad) {
        this.tipodocumentoIdentidad = tipodocumentoIdentidad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public VentasObj getVentasDKVidVentas() {
        return ventasDKVidVentas;
    }

    public void setVentasDKVidVentas(VentasObj ventasDKVidVentas) {
        this.ventasDKVidVentas = ventasDKVidVentas;
    }

  
    
}
