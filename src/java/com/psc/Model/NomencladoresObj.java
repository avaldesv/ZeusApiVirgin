/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Nomencladores;

/**
 *
 * @author AVV
 */
public class NomencladoresObj  {

    
   
    private Integer idNomescladores;
   
    private String nombre;
  
    private String descripcion;
    
    private Integer nomescladorPadre;
    
    private CampanyasObj idCampana;

    public NomencladoresObj() {
    }
 public NomencladoresObj(Nomencladores nom) {
        this.idNomescladores = nom.getIdNomescladores();
        this.nombre = nom.getNombre();
        this.descripcion = nom.getDescripcion();
        this.nomescladorPadre = nom.getNomescladorPadre();
        this.idCampana = new CampanyasObj(nom.getIdCampana());
     
    }
    public NomencladoresObj(Integer idNomescladores, String nombre, String descripcion, Integer nomescladorPadre, CampanyasObj idCampana) {
        this.idNomescladores = idNomescladores;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nomescladorPadre = nomescladorPadre;
        this.idCampana = idCampana;
    }

    
    
    
    public NomencladoresObj(Integer idNomescladores) {
        this.idNomescladores = idNomescladores;
    }

    public Integer getIdNomescladores() {
        return idNomescladores;
    }

    public void setIdNomescladores(Integer idNomescladores) {
        this.idNomescladores = idNomescladores;
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

    public Integer getNomescladorPadre() {
        return nomescladorPadre;
    }

    public void setNomescladorPadre(Integer nomescladorPadre) {
        this.nomescladorPadre = nomescladorPadre;
    }

    public CampanyasObj getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(CampanyasObj idCampana) {
        this.idCampana = idCampana;
    }

    
}
