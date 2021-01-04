/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Ventas;
import java.util.List;
import com.psc.Entity.Usuarios;
import com.psc.Model.VentasObj;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author AVV
 */

public interface VentasService {
   
       List<VentasObj>Listar(); 
       
       List<VentasObj>ListarbyUserId(int id,String fechaI,String fechaF); 
          
    VentasObj ListarbyId(int id);
  
   VentasObj  add(Ventas user);

     void edit(Ventas user);
   
     void deletebyId(Ventas user);
   
       List<VentasObj>getBySearch(Ventas obj,String fechai,String fechaf,int idcoordinador); 
}
