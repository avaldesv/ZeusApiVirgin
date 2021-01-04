/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.LineasasociadasDao;
import com.psc.Entity.Lineasasociadas;
import com.psc.Model.LineasasociadasObj;

import com.psc.apizeus.Convertidor;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AVV
 */
@Service
 @Transactional
public class LineasasociadasService_Imp implements LineasasociadasService{
 
  @Resource
   private LineasasociadasDao repository;
   
    
   @Override
    public List<LineasasociadasObj> Listar() {
       return new Convertidor().ConvertLineasAsociadasList(repository.findAll());
    }

    @Override
    public Lineasasociadas ListarbyId(int id) {
       return repository.findOne(id);
    }

    @Override
    public Lineasasociadas add(Lineasasociadas obj) {
     return repository.save(obj);
    }

    @Override
    public void edit(Lineasasociadas obj) {
       repository.edit(obj); 
    }

    @Override
    public void deletebyId(Lineasasociadas obj) {
       repository.delete(obj);
    }
    
}
