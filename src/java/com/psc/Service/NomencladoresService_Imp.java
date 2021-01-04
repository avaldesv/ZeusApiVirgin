/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.NomencladoresDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Nomencladores;
import com.psc.Entity.Usuarios;
import com.psc.Model.NomencladoresObj;

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
public class NomencladoresService_Imp implements NomencladoresService{
 
  @Resource
   private NomencladoresDao repository;
   
//    @Resource
//   private NomencladoresRepository repositoryrol;
//    
  private Convertidor convert ;
    
   @Override
    public List<NomencladoresObj> Listar() {
       return new Convertidor().ConvertNomencladoresList(repository.findAll1());
    }

    @Override
    public Nomencladores ListarbyId(int id) {
       return repository.findOne(id);
    }

    @Override
    public Nomencladores add(Nomencladores obj) {
     return repository.save(obj);
    }

    @Override
    public void edit(Nomencladores obj) {
    repository.edit(obj); 
    }

    @Override
    public void deletebyId(Nomencladores obj) {
    repository.delete(obj);
    }
    
}
