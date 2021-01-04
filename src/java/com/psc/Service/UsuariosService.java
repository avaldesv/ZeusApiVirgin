/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.UsuariosObj;


public interface UsuariosService {
   
       List<UsuariosObj>Listar(); 
       List<UsuariosObj>getUsersByRol(int rol);  
       List<UsuariosObj>getUsersByCoordinador(int idCoordinador); 
       List<UsuariosObj>getUsersBySupervisor(int idSupervisor); 
       UsuariosObj ListarbyId(int id);
       Usuarios ListarUsuariobyId(int id);
       List<UsuariosObj> findAllactivos();
  
    boolean add(Usuarios user);

    boolean edit(Usuarios user);
   
     void deletebyId(Usuarios user);
     int CheckUsername(String user);
     Usuarios loadUserByUsername(String username);
       List<Usuarios>getUsuariosByCoordinador(int idCoordinador); 
       List<Usuarios>getUsuariosBySupervisor(int idSupervisor); 
       
     
}
