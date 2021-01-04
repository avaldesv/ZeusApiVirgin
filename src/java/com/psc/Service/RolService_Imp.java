/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.RolDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Repository.RolRepository;
import com.psc.apizeus.Convertidor;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AVV
 */
@Service
 @Transactional
public class RolService_Imp implements RolService{
 
  @Resource
   private RolDao repository;
   
//    @Resource
//   private RolRepository repositoryrol;
//    
  private Convertidor convert ;
    
   @Override
    public List<RolObj> Listar() {
       return new Convertidor().ConvertRolListRol(repository.findAll1());
    }

    @Override
    public Rol ListarbyId(int id) {
       return repository.findOne(id);
    }

    @Override
    public Rol add(Rol obj) {
     return repository.save(obj);
    }

    @Override
    public void edit(Rol obj) {
     repository.edit(obj); 
    }

    @Override
    public void deletebyId(Rol obj) {
     repository.delete(obj);
    }
    
}
