/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Usuarios;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface UsuariosDao {
    
        List<Usuarios>findAll1();
        
    List<Usuarios>getUsersByRol(int rol); 
    List<Usuarios>getUsersByCoordinador(int idCoordinador); 
    List<Usuarios>getUsersBySupervisor(int idSupervisor); 
    Usuarios findOne(int id);
    boolean save(Usuarios user);
    boolean edit(Usuarios user);
    void delete(Usuarios user); 
    int CheckUsername(String user);
    Usuarios getUsuariobyUsername(String username); 
    List<Usuarios> findAllactivos();
  
    
}
