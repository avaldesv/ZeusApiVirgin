/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Lineasasociadas;
import com.psc.Model.LineasasociadasObj;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface LineasasociadasDao {
    
    List<Lineasasociadas>findAll();
    Lineasasociadas findOne(int id);
    Lineasasociadas save(Lineasasociadas rol);
    void edit(Lineasasociadas rol);
    void delete(Lineasasociadas rol); 
    
    
}
