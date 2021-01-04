/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Rol;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface RolService {
   
       List<RolObj>Listar(); 
       
    Rol ListarbyId(int id);
  
    Rol add(Rol user);

     void edit(Rol user);
   
     void deletebyId(Rol user);
}
