/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.MunicipioDao;
import com.psc.Dao.NomencladoresDao;
import com.psc.Dao.ProvinciaDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Nomencladores;
import com.psc.Entity.Usuarios;
import com.psc.Model.MunicipioObj;
import com.psc.Model.NomencladoresObj;
import com.psc.Model.ProvinciaObj;

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
public class ProvinciaServiceImp implements ProvinciaService{
 
  @Resource
   private ProvinciaDao repository;
   

      @Override
    public List<ProvinciaObj> Listar() {
       return new Convertidor().ConvertProvinciaList(repository.findAll());
    }

    @Override
    public ProvinciaObj getbyId(int id) {
        return new ProvinciaObj(repository.getById(id));
    }


    
    
}
