/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Segmentoventa;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface SegmentoVentaDao {
    
        List<Segmentoventa>findAll();
      Segmentoventa getById(int obj); 
     Segmentoventa save(Segmentoventa user);
    boolean edit(Segmentoventa user);
    void delete(Segmentoventa user); 
    List<Segmentoventa> findAllactivos();

    
    
}
