/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Tipoventa;
import java.util.List;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoVentaObj;
/**
 *
 * @author AVV
 */

public interface TipoVentaService {
   
    List<TipoVentaObj>Listar(); 
       
    TipoVentaObj ListarbyId(int id);
  
    TipoVentaObj add(Tipoventa obj);

     boolean edit(Tipoventa obj);
   
     void deletebyId(Tipoventa obj);
          List<TipoVentaObj> findAllactivos();
}
