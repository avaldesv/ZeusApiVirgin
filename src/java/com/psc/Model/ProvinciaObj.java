/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Municipios;
import com.psc.Entity.Provincias;
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
public class ProvinciaObj {




    private Integer id;
  
    private String provincia;

    public ProvinciaObj() {
    }
    
    public ProvinciaObj(Provincias m ){
 
        this.provincia = m.getProvincia();
        this.id = m.getId();
      
    
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public ProvinciaObj(Integer id, String provincia) {
        this.id = id;
        this.provincia = provincia;
    }

   

      
}
