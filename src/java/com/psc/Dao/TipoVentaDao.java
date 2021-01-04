/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Tipoventa;
import com.psc.Entity.Tipoventa;
import com.psc.Entity.Usuarios;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface TipoVentaDao {
    
        List<Tipoventa>findAll();
      Tipoventa getById(int obj); 
     Tipoventa save(Tipoventa user);
    boolean edit(Tipoventa user);
    void delete(Tipoventa user); 
        List<Tipoventa> findAllactivos();

    
    
}
