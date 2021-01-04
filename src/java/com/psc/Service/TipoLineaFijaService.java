/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Tipolineafija;
import com.psc.Entity.Tipolineafija;
import java.util.List;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoLineaFijaObj;
/**
 *
 * @author AVV
 */

public interface TipoLineaFijaService {
   
    List<TipoLineaFijaObj>Listar(); 
       
    TipoLineaFijaObj ListarbyId(int id);
  
    TipoLineaFijaObj add(Tipolineafija obj);

     boolean edit(Tipolineafija obj);
   
     void deletebyId(Tipolineafija obj);
      List<TipoLineaFijaObj> findAllactivos();
}
