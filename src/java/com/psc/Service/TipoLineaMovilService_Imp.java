/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.RolDao;
import com.psc.Dao.SegmentoVentaDao;
import com.psc.Dao.TipoLineaMovilDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Tipolineamovil;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoLineaMovilObj;
import com.psc.Model.TipoLineaMovilObj;
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
public class TipoLineaMovilService_Imp implements TipoLineaMovilService{
 
  @Resource
   private TipoLineaMovilDao repository;
   
    
      
   @Override
    public List<TipoLineaMovilObj> Listar() {
       return  new Convertidor().ConvertTipoLineaMoviList(repository.findAll());
    }
      
    @Override
    public TipoLineaMovilObj ListarbyId(int id) {
       return new TipoLineaMovilObj(repository.getById(id));
    }

    @Override
    public TipoLineaMovilObj  add(Tipolineamovil obj) {
     return new TipoLineaMovilObj(repository.save(obj));
    }

    @Override
    public boolean edit(Tipolineamovil obj) {
      return  repository.edit(obj); 
    }

    @Override
    public void deletebyId(Tipolineamovil obj) {
       repository.delete(obj);
    }

    @Override
    public List<TipoLineaMovilObj> findAllactivos() {
         return new Convertidor().ConvertTipoLineaMoviList(repository.findAllactivos());
    }
    
}
