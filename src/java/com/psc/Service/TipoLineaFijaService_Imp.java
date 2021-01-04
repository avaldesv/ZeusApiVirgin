/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.RolDao;
import com.psc.Dao.SegmentoVentaDao;
import com.psc.Dao.TipoLineaFijaDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Tipolineafija;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoLineaFijaObj;
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
public class TipoLineaFijaService_Imp implements TipoLineaFijaService{
 
  @Resource
   private TipoLineaFijaDao repository;
   
    
      
   @Override
    public List<TipoLineaFijaObj> Listar() {
       return  new Convertidor().ConvertTipoLineaFijaList(repository.findAll());
    }
      
    @Override
    public TipoLineaFijaObj ListarbyId(int id) {
       return new TipoLineaFijaObj(repository.getById(id));
    }

    @Override
    public TipoLineaFijaObj  add(Tipolineafija obj) {
     return new TipoLineaFijaObj(repository.save(obj));
    }

    @Override
    public boolean edit(Tipolineafija obj) {
      return  repository.edit(obj); 
    }

    @Override
    public void deletebyId(Tipolineafija obj) {
       repository.delete(obj);
    }

    @Override
    public List<TipoLineaFijaObj> findAllactivos() {
         return new Convertidor().ConvertTipoLineaFijaList(repository.findAllactivos());
    }
    
}
