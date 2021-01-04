/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Municipios;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author AVV
 */
public class MunicipioObj {



    private int provinciaId;
 
    private String municipio;
  
    private Integer id;
  
    private String slug;

    private Double latitud;
   
    private Double longitud;

    public MunicipioObj() {
    }
    
    public MunicipioObj(Municipios m ){
       this.provinciaId = m.getProvinciaId();
        this.municipio = m.getMunicipio();
        this.id = m.getId();
      
    
    }

    public MunicipioObj(int provinciaId, String municipio, Integer id, String slug, Double latitud, Double longitud) {
        this.provinciaId = provinciaId;
        this.municipio = municipio;
        this.id = id;
        this.slug = slug;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    
    
    public int getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(int provinciaId) {
        this.provinciaId = provinciaId;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
    
    

      
}
