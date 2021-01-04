/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.psc.Dao.SegmentoVentaDao;

import com.psc.Entity.Segmentoventa;
import com.psc.Model.SegmentoVentaObj;
import com.psc.apizeus.Convertidor;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AVV
 */
@Service
 @Transactional
public class SegmentoVentaService_Imp implements SegmentoVentaService{
 
  @Resource
   private SegmentoVentaDao repository;
   
    
      
   @Override
    public List<SegmentoVentaObj> Listar() {
       return  new Convertidor().ConvertSegmentoVentaList(repository.findAll());
    }
      
    @Override
    public SegmentoVentaObj ListarbyId(int id) {
       return new SegmentoVentaObj(repository.getById(id));
    }

    @Override
    public SegmentoVentaObj  add(Segmentoventa obj) {
        try {
              return new SegmentoVentaObj(repository.save(obj));
        } catch (Exception e) {
            System.out.println("ERROR SERVICE SEGMENTO"+e);
            return null;
        }
   
    }

    @Override
    public boolean edit(Segmentoventa obj) {
      return  repository.edit(obj); 
    }

    @Override
    public void deletebyId(Segmentoventa obj) {
       repository.delete(obj);
    }

    @Override
    public List<SegmentoVentaObj> findAllactivos() {
        return new Convertidor().ConvertSegmentoVentaList(repository.findAllactivos());
    }
    
}
