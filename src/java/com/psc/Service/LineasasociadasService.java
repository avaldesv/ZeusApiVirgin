/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Lineasasociadas;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.LineasasociadasObj;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface LineasasociadasService {
   
       List<LineasasociadasObj>Listar(); 
       
    Lineasasociadas ListarbyId(int id);
  
    Lineasasociadas add(Lineasasociadas user);

     void edit(Lineasasociadas user);
   
     void deletebyId(Lineasasociadas user);
}
