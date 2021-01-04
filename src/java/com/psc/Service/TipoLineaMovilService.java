/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Tipolineamovil;
import com.psc.Entity.Tipolineamovil;
import java.util.List;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoLineaFijaObj;
import com.psc.Model.TipoLineaMovilObj;
/**
 *
 * @author AVV
 */

public interface TipoLineaMovilService {
   
    List<TipoLineaMovilObj>Listar(); 
       
    TipoLineaMovilObj ListarbyId(int id);
  
    TipoLineaMovilObj add(Tipolineamovil obj);

     boolean edit(Tipolineamovil obj);
   
     void deletebyId(Tipolineamovil obj);
       List<TipoLineaMovilObj> findAllactivos();
}
