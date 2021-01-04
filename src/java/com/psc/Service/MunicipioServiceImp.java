/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.MunicipioDao;
import com.psc.Dao.NomencladoresDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Nomencladores;
import com.psc.Entity.Usuarios;
import com.psc.Model.MunicipioObj;
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
public class MunicipioServiceImp implements MunicipioService{
 
  @Resource
   private MunicipioDao repository;
   

    
   @Override
    public List<MunicipioObj> Listar() {
       return new Convertidor().ConvertMunicipioList(repository.findAll());
    }

    @Override
    public List<MunicipioObj> ListarbyId(int id) {
        return new Convertidor().ConvertMunicipioList(repository.findOne(id));
    }

    
    
}
