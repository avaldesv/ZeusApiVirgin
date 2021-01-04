/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Tomador;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface TomadorDao {
    
    List<Tomador>findAll();
    Tomador findOne(int id);
    Tomador save(Tomador rol);
    void edit(Tomador rol);
    void delete(Tomador rol); 
    
    
}
