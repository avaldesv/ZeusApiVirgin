/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.AseguradosDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Asegurados;
import com.psc.Entity.Usuarios;
import com.psc.Model.AseguradosObj;
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
public class AseguradosService_Imp implements AseguradosService{
 
  @Resource
   private AseguradosDao repository;
   
//    @Resource
//   private AseguradosRepository repositoryrol;
//    
  private Convertidor convert ;
    
   @Override
    public List<AseguradosObj> Listar() {
       return new Convertidor().ConvertAseguradosList(repository.findAll());
    }

    @Override
    public Asegurados ListarbyId(int id) {
       return repository.findOne(id);
    }

    @Override
    public Asegurados add(Asegurados obj) {
     return repository.save(obj);
    }

    @Override
    public void edit(Asegurados obj) {
       repository.edit(obj); 
    }

    @Override
    public void deletebyId(Asegurados obj) {
        repository.delete(obj);
    }
    
}
