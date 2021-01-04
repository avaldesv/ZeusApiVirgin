/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Repository;
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
public interface UsuariosRepository extends Repository<Usuarios, Integer>{
    List<Usuarios>findAll();
    Usuarios findOne(int id);
    Usuarios save(Usuarios user);
    Usuarios edit(Usuarios user);
    Usuarios delete(Usuarios user); 
    }
