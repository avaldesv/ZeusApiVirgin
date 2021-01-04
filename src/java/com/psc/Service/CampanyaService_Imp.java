/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.CampanyaDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Campanyas;
import com.psc.Entity.Usuarios;
import com.psc.Model.CampanyasObj;
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
public class CampanyaService_Imp implements CampanyaService{
 
  @Resource
   private CampanyaDao repository;
   
//    @Resource
//   private CampanyasRepository repositoryrol;
//    
  private Convertidor convert ;
    
   @Override
    public List<CampanyasObj> Listar() {
       return new Convertidor().ConvertCampanyasList(repository.findAll());
    }

    @Override
    public CampanyasObj ListarbyId(int id) {
       return new CampanyasObj(repository.findOne(id));
    }

    @Override
    public CampanyasObj add(Campanyas obj) {
     return  new CampanyasObj(repository.save(obj));
    }

    @Override
    public void edit(Campanyas obj) {
      repository.edit(obj); 
    }

    @Override
    public void deletebyId(Campanyas obj) {
      repository.delete(obj);
    }
    
}
