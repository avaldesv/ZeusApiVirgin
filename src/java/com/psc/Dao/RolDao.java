/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Rol;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface RolDao {
    
    List<Rol>findAll1();
    Rol findOne(int id);
    Rol save(Rol rol);
    void edit(Rol rol);
    void delete(Rol rol); 
    
    
}
