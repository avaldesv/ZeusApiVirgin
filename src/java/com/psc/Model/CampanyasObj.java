/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Campanyas;
import com.psc.apizeus.Convertidor;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AVV
 */
public class CampanyasObj  {

    
    private Integer idCampana;
    
    private String nombre;
   
    private String descripcion;
    
    private List<NomencladoresObj> nomencladoresList;
   
    private List<UsuariosObj> usuariosList;
    
    
    

    public CampanyasObj() {
    }

    
    public CampanyasObj(Campanyas camp) {
        this.idCampana = camp.getIdCampana();
        this.nombre = camp.getNombre();
        this.descripcion = camp.getDescripcion();
   // this.nomencladoresList = new Convertidor().ConvertNomencladoresList(camp.getNomencladoresList());
    }

    
    public CampanyasObj(Integer idCampana, String nombre, String descripcion, List<NomencladoresObj> nomencladoresList) {
        this.idCampana = idCampana;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nomencladoresList = nomencladoresList;
    }
    
    
    

    public CampanyasObj(Integer idCampana) {
        this.idCampana = idCampana;
    }

    public Integer getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(Integer idCampana) {
        this.idCampana = idCampana;
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

    
    public List<NomencladoresObj> getNomencladoresList() {
        return nomencladoresList;
    }

    public void setNomencladoresList(List<NomencladoresObj> nomencladoresList) {
        this.nomencladoresList = nomencladoresList;
    }

  
    public List<UsuariosObj> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuariosObj> usuariosList) {
        this.usuariosList = usuariosList;
    }

   
    
}
