/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Asegurados;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface AseguradosDao {
    
    List<Asegurados>findAll();
    Asegurados findOne(int id);
    Asegurados save(Asegurados rol);
    void edit(Asegurados rol);
    void delete(Asegurados rol); 
    
    
}
