/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.RolDao;
import com.psc.Dao.SegmentoVentaDao;
import com.psc.Dao.TipoTvFutboolDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Tipofutbool;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoTvFutboolObj;
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
public class TipoTvFutboolService_Imp implements TipoTvFutboolService{
 
  @Resource
   private TipoTvFutboolDao repository;
   
    
      
   @Override
    public List<TipoTvFutboolObj> Listar() {
       return  new Convertidor().ConvertTipoTvFutboolList(repository.findAll());
    }
      
    @Override
    public TipoTvFutboolObj ListarbyId(int id) {
       return new TipoTvFutboolObj(repository.getById(id));
    }

    @Override
    public TipoTvFutboolObj  add(Tipofutbool obj) {
     return new TipoTvFutboolObj(repository.save(obj));
    }

    @Override
    public boolean edit(Tipofutbool obj) {
      return  repository.edit(obj); 
    }

    @Override
    public void deletebyId(Tipofutbool obj) {
       repository.delete(obj);
    }

    @Override
    public List<TipoTvFutboolObj> findAllactivos() {
          return new Convertidor().ConvertTipoTvFutboolList(repository.findAllactivos());
    }
    
}
