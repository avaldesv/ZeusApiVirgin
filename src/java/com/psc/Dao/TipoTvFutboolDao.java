/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Tipofutbool;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface TipoTvFutboolDao {
    
        List<Tipofutbool>findAll();
      Tipofutbool getById(int obj); 
     Tipofutbool save(Tipofutbool user);
    boolean edit(Tipofutbool user);
    void delete(Tipofutbool user); 
    List<Tipofutbool> findAllactivos();

    
    
}
