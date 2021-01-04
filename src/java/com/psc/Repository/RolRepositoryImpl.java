/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Repository;

import com.psc.Entity.Rol;
import com.psc.Entity.Usuarios;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class RolRepositoryImpl implements RolRepository {

    @Override
    public List<Rol> findAll() {
        
        
      return findAll();
    }

    @Override
    public Rol findOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol save(Rol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol edit(Rol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol delete(Rol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
