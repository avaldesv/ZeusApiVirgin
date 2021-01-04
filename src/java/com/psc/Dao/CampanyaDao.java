/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Campanyas;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface CampanyaDao {
    
    List<Campanyas>findAll();
    Campanyas findOne(int id);
    Campanyas save(Campanyas rol);
    void edit(Campanyas rol);
    void delete(Campanyas rol); 
    
    
}
