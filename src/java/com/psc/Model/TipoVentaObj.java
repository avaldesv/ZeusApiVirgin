/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Segmentoventa;
import com.psc.Entity.Tipoventa;
import java.util.logging.Logger;

/**
 *
 * @author AVV
 */
public class TipoVentaObj {
    
      private Integer id;
   
    private String nombre;
  
    private String descripcion;
  
    private String ponderacion;
  
    private Integer estado;

    private SegmentoVentaObj idSegmento;

    public TipoVentaObj(Tipoventa obj) {
        this.id = obj.getId();
        this.nombre = obj.getNombre();
        this.descripcion = obj.getDescripcion();
        this.ponderacion = obj.getPonderacion();
        this.estado = obj.getEstado();
        this.idSegmento = new SegmentoVentaObj(obj.getIdSegmento());
    }

    public TipoVentaObj() {
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

    public SegmentoVentaObj getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(SegmentoVentaObj idSegmento) {
        this.idSegmento = idSegmento;
    }
  
    
    
    
}
