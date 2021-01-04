/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;
import com.google.gson.Gson;
import com.psc.Dao.VentasDao;
import com.psc.Entity.Usuarios;
import com.psc.Entity.Ventas;
import com.psc.Model.VentasObj;
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
public class VentasService_Imp implements VentasService{
 
  @Resource
   private VentasDao repository;

   @Override
    public List<VentasObj> Listar() {
       
        List<Ventas> list = repository.findAll();
        for (Ventas ventas : list) {
           //    System.out.println(ventas.getLineasasociadasList().size());
               //   System.out.println(ventas.getLineasasociadasCollection().size());
               System.out.println(ventas.getIdTomador().getDni());
            //   System.out.println(new Gson().toJson(ventas));
       }
     
       return new Convertidor().ConvertVentasList(list);
    }

    @Override
    public VentasObj ListarbyId(int id) {
       return new VentasObj (repository.findOne(id));
    }

    @Override
    public VentasObj add(Ventas obj) {
     return  new VentasObj (repository.save(obj));
    }

    @Override
    public void edit(Ventas obj) {
        repository.edit(obj); 
    }

    @Override
    public void deletebyId(Ventas obj) {
        repository.delete(obj);
    }

    @Override
    public List<VentasObj> ListarbyUserId(int id, String fechaI, String fechaF) {
      return  new Convertidor().ConvertVentasList( repository.ListarbyUserId( id,  fechaI,  fechaF));
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VentasObj> getBySearch(Ventas obj, String fechai, String fechaf,int idcoordinador) {
         return  new Convertidor().ConvertVentasList( repository.getBySearch(obj, fechai, fechaf, idcoordinador));
    }

    


    
    
}
