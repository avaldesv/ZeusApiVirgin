/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Usuarios;
import com.psc.Model.UsuariosObj;
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
public class UsuariosService_Imp implements  UsuariosService{
 
  @Resource
   private UsuariosDao repository;

////   @Resource
//   private UsuariosRepository repositoryuser;

    
   @Override
    public List<UsuariosObj> Listar() {
       return  new Convertidor().ConvertUsuariosList(repository.findAll1());
    }
      
      @Override
    public List<UsuariosObj> getUsersByRol(int rol) {
       return  new Convertidor().ConvertUsuariosList(repository.getUsersByRol(rol));
    }

    @Override
    public UsuariosObj ListarbyId(int id) {
       return new UsuariosObj(repository.findOne(id));
    }

    @Override
    public boolean  add(Usuarios user) {
     return repository.save(user);
    }

    @Override
    public boolean edit(Usuarios user) {
      return  repository.edit(user); 
    }

    @Override
    public void deletebyId(Usuarios user) {
       repository.delete(user);
    }
    @Override
     public int CheckUsername(String user){
     
      return repository.CheckUsername(user);
     }

    @Override
    public Usuarios loadUserByUsername(String username) {
        return repository.getUsuariobyUsername(username);
    }
    
    @Override
    public List<UsuariosObj> getUsersByCoordinador(int idCoordinador) {
       return new Convertidor().ConvertUsuariosList( repository.getUsersByCoordinador( idCoordinador)); 
    }

    @Override
    public List<UsuariosObj> findAllactivos() {
       return new Convertidor().ConvertUsuariosList( repository.findAllactivos());
    }

    @Override
    public List<UsuariosObj> getUsersBySupervisor(int idSupervisor) {
        return new Convertidor().ConvertUsuariosList( repository.getUsersBySupervisor(idSupervisor)); 
    }

    @Override
    public Usuarios ListarUsuariobyId(int id) {
        return repository.findOne(id);
    }
      @Override
    public List<Usuarios> getUsuariosByCoordinador(int idCoordinador) {
       return  repository.getUsersByCoordinador( idCoordinador); 
    }
    
    @Override
    public List<Usuarios> getUsuariosBySupervisor(int idSupervisor) {
        return  repository.getUsersBySupervisor(idSupervisor); 
    }
     

   
     
     
     
     
     
}
