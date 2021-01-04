/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Repository;
import com.psc.Entity.Rol;
import org.springframework.data.repository.Repository;

import com.psc.Entity.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author AVV
 */
//@Repository
//@org.springframework.stereotype.Repository("myUserRepository")
public interface RolRepository extends Repository<Rol, Integer>{
    List<Rol>findAll();
    Rol findOne(int id);
    Rol save(Rol obj);
    Rol edit(Rol obj);
    Rol delete(Rol obj); 
    }
