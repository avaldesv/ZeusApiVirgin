/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Campanyas;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.CampanyasObj;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface CampanyaService {
   
       List<CampanyasObj>Listar(); 
       
    CampanyasObj ListarbyId(int id);
  
    CampanyasObj add(Campanyas user);

     void edit(Campanyas user);
   
     void deletebyId(Campanyas user);
}
