/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.RolDao;
import com.psc.Dao.SegmentoVentaDao;
import com.psc.Dao.TipoTvDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Tipotv;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoTvObj;
import com.psc.Model.UsuariosObj;
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
public class TipoTvService_Imp implements TipoTvService{
 
  @Resource
   private TipoTvDao repository;
   
    
      
   @Override
    public List<TipoTvObj> Listar() {
       return  new Convertidor().ConvertTipoTvList(repository.findAll());
    }
      
    @Override
    public TipoTvObj ListarbyId(int id) {
       return new TipoTvObj(repository.getById(id));
    }

    @Override
    public TipoTvObj  add(Tipotv obj) {
     return new TipoTvObj(repository.save(obj));
    }

    @Override
    public boolean edit(Tipotv obj) {
      return  repository.edit(obj); 
    }

    @Override
    public void deletebyId(Tipotv obj) {
       repository.delete(obj);
    }

    @Override
    public List<TipoTvObj> findAllactivos() {
        return new Convertidor().ConvertTipoTvList(repository.findAllactivos());
    }
    
}
