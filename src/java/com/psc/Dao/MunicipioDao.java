/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Municipios;
import com.psc.Entity.Nomencladores;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface MunicipioDao {
    
      List<Municipios>findAll();
      List<Municipios> findOne(int id);
      Municipios getById(int id);
    
    
}
