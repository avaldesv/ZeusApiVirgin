/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Rol;
import com.psc.apizeus.Convertidor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author AVV
 */

public class RolObj {
    
 
    
    private Integer idRol;

    private String rol;

    private String descripcion;
    private List<UsuariosObj> usuariosList;

    public RolObj() {
    }
    
     public RolObj(Rol rol) {
         
         
        this.idRol = rol.getIdRol();
        this.rol = rol.getRol();
        this.descripcion = rol.getDescripcion();
    //  this.usuariosList =  new Convertidor().ConvertUsuariosList(rol.getUsuariosList());  
             }
        public RolObj(Rol rol,int i) {
        this.idRol = rol.getIdRol();
        this.rol = rol.getRol();
        this.usuariosList =  new Convertidor().ConvertUsuariosList(rol.getUsuariosList());  
         //  this.usuariosList =  new Convertidor().ConvertUsuariosList(rol.getUsuariosCollection());  
    
             }

    public RolObj(Integer idRol, String rol, List<UsuariosObj> usuariosList) {
        this.idRol = idRol;
        this.rol = rol;
        this.usuariosList = usuariosList;
    }

    public RolObj(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public List<UsuariosObj> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuariosObj> usuariosList) {
        this.usuariosList = usuariosList;
    }


    
}
