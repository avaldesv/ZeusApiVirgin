/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Segmentoventa;
import java.util.List;
import com.psc.Model.SegmentoVentaObj;
/**
 *
 * @author AVV
 */

public interface SegmentoVentaService {
   
    List<SegmentoVentaObj>Listar(); 
       
    SegmentoVentaObj ListarbyId(int id);
  
    SegmentoVentaObj add(Segmentoventa obj);

     boolean edit(Segmentoventa obj);
   
     void deletebyId(Segmentoventa obj);
      List<SegmentoVentaObj> findAllactivos();
}
