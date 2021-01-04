/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Tipotv;
import com.psc.Entity.Tipotv;
import com.psc.Entity.Usuarios;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface TipoTvDao {
    
        List<Tipotv>findAll();
      Tipotv getById(int obj); 
     Tipotv save(Tipotv user);
    boolean edit(Tipotv user);
    void delete(Tipotv user); 
    List<Tipotv> findAllactivos();

    
    
}
