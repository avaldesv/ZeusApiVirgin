/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Segmentoventa;
import com.psc.Entity.Tipolineafija;
import com.psc.Entity.Tipolineamovil;
import com.psc.Entity.Tipotvmovil;
import com.psc.Entity.Tipoventa;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

/**
 *
 * @author AVV
 */
public class SegmentoVentaObj {
    
    private Integer id;
  
    private String nombre;
  
    private String descripcion;
    
    private Integer estado;
   
   // private Collection<Tipolineamovil> tipolineamovilCollection;
   
  //  private Collection<Tipotvmovil> tipotvmovilCollection;
    
   // private Collection<Tipoventa> tipoventaCollection;
    
   // private Collection<Tipolineafija> tipolineafijaCollection;

    public SegmentoVentaObj(Segmentoventa obj) {
        this.id = obj.getId();
        this.nombre = obj.getNombre();
        this.descripcion = obj.getDescripcion();
        this.estado = obj.getEstado();
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

    public SegmentoVentaObj() {
    }
    
    
    
}
