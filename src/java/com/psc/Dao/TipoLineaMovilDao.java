/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Tipolineamovil;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface TipoLineaMovilDao {
    
        List<Tipolineamovil>findAll();
      Tipolineamovil getById(int obj); 
     Tipolineamovil save(Tipolineamovil user);
    boolean edit(Tipolineamovil user);
    void delete(Tipolineamovil user); 
     List<Tipolineamovil> findAllactivos();

    
    
}
