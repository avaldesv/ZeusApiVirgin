/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.TomadorDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Tomador;
import com.psc.Entity.Usuarios;
import com.psc.Model.TomadorObj;

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
public class TomadorService_Imp implements TomadorService{
 
  @Resource
   private TomadorDao repository;
   
//    @Resource
//   private TomadorRepository repositoryrol;
//    
  private Convertidor convert ;
    
   @Override
    public List<TomadorObj> Listar() {
       return new Convertidor().ConvertTomadorList(repository.findAll());
    }

    @Override
    public Tomador ListarbyId(int id) {
       return repository.findOne(id);
    }

    @Override
    public Tomador add(Tomador obj) {
     return repository.save(obj);
    }

    @Override
    public void edit(Tomador obj) {
      repository.edit(obj); 
    }

    @Override
    public void deletebyId(Tomador obj) {
       repository.delete(obj);
    }
    
}
