/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.RolDao;
import com.psc.Dao.TipoVentaDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Tipoventa;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Model.TipoVentaObj;
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
public class TipoVentaService_Imp implements TipoVentaService{
 
  @Resource
   private TipoVentaDao repository;
   
    
      
   @Override
    public List<TipoVentaObj> Listar() {
       return  new Convertidor().ConvertTipoVentaList(repository.findAll());
    }
      
    @Override
    public TipoVentaObj ListarbyId(int id) {
       return new TipoVentaObj(repository.getById(id));
    }

    @Override
    public TipoVentaObj  add(Tipoventa obj) {
     return  new TipoVentaObj(repository.save(obj));
    }

    @Override
    public boolean edit(Tipoventa obj) {
      return  repository.edit(obj); 
    }

    @Override
    public void deletebyId(Tipoventa obj) {
       repository.delete(obj);
    }

    @Override
    public List<TipoVentaObj> findAllactivos() {
      return new Convertidor().ConvertTipoVentaList(repository.findAllactivos());
    }
    
}
