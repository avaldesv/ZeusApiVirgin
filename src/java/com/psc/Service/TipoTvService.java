/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Tipotv;
import com.psc.Entity.Tipotv;
import java.util.List;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoTvObj;
/**
 *
 * @author AVV
 */

public interface TipoTvService{
   
    List<TipoTvObj>Listar(); 
       
    TipoTvObj ListarbyId(int id);
  
    TipoTvObj add(Tipotv obj);

     boolean edit(Tipotv obj);
   
     void deletebyId(Tipotv obj);
     List<TipoTvObj> findAllactivos();
}
