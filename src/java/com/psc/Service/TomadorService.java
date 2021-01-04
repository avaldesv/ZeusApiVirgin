/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Tomador;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.TomadorObj;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface TomadorService {
   
       List<TomadorObj>Listar(); 
       
    Tomador ListarbyId(int id);
  
    Tomador add(Tomador user);

     void edit(Tomador user);
   
     void deletebyId(Tomador user);
}
