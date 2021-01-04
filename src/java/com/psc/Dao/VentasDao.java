/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Ventas;
import java.util.List;

/**
 *
 * @author AVV
 */
public interface VentasDao {
    
    List<Ventas>findAll();
    Ventas findOne(int id);
    Ventas save(Ventas rol);
    void edit(Ventas rol);
    void delete(Ventas rol); 
    public List<Ventas> ListarbyUserId(int id, String fechaI, String fechaF);
   List<Ventas>getBySearch(Ventas ventaseach, String fechai, String fechaf,int idcoordinador);
    
}
