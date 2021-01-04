/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Nomencladores;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface NomencladoresDao {
    
    List<Nomencladores>findAll1();
    Nomencladores findOne(int id);
    Nomencladores save(Nomencladores rol);
    void edit(Nomencladores rol);
    void delete(Nomencladores rol); 
    
    
}
