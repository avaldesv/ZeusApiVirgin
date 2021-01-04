/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Segmentoventa;
import com.psc.Entity.Tipolineafija;
import com.psc.Entity.Usuarios;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface TipoLineaFijaDao {
    
        List<Tipolineafija>findAll();
      Tipolineafija getById(int obj); 
     Tipolineafija save(Tipolineafija user);
    boolean edit(Tipolineafija user);
    void delete(Tipolineafija user); 
     List<Tipolineafija> findAllactivos();

    
    
}
