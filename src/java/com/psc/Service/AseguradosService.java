/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Asegurados;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.AseguradosObj;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface AseguradosService {
   
       List<AseguradosObj>Listar(); 
       
    Asegurados ListarbyId(int id);
  
    Asegurados add(Asegurados user);

     void edit(Asegurados user);
   
     void deletebyId(Asegurados user);
}
