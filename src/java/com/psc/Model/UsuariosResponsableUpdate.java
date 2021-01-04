/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Usuarios;
import java.util.List;

/**
 *
 * @author AVV
 */
public class UsuariosResponsableUpdate {
    private List<Usuarios> usuariosasig;
    private Usuarios responsale;

    public UsuariosResponsableUpdate() {
    }

    public UsuariosResponsableUpdate(List<Usuarios> usuariosasig, Usuarios responsale) {
        this.usuariosasig = usuariosasig;
        this.responsale = responsale;
    }

    public List<Usuarios> getUsuariosasig() {
        return usuariosasig;
    }

    public void setUsuariosasig(List<Usuarios> usuariosasig) {
        this.usuariosasig = usuariosasig;
    }

    public Usuarios getResponsale() {
        return responsale;
    }

    public void setResponsale(Usuarios responsale) {
        this.responsale = responsale;
    }
    
    
    
}
