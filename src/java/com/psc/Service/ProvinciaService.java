/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Nomencladores;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.MunicipioObj;
import com.psc.Model.NomencladoresObj;
import com.psc.Model.ProvinciaObj;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface ProvinciaService {
   
    List<ProvinciaObj>Listar(); 
       
     ProvinciaObj getbyId(int id);
  
   
}
