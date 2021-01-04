/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Entity.Tipofutbool;
import com.psc.Entity.Tipofutbool;
import java.util.List;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoTvFutboolObj;
/**
 *
 * @author AVV
 */

public interface TipoTvFutboolService {
   
    List<TipoTvFutboolObj>Listar(); 
       
    TipoTvFutboolObj ListarbyId(int id);
  
    TipoTvFutboolObj add(Tipofutbool obj);

     boolean edit(Tipofutbool obj);
   
     void deletebyId(Tipofutbool obj);
     List<TipoTvFutboolObj> findAllactivos();
}
