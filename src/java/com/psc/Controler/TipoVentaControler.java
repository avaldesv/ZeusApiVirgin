/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.psc.Entity.Tipoventa;
import com.psc.Model.TipoVentaObj;

import com.psc.Service.TipoVentaService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author AVV
 */
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.1.102:4200", "http://51.38.239.124", "http://172.16.80.73"})
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipoventa")
public class TipoVentaControler {

  
    @Resource
    private TipoVentaService tipoVentaService;
    
    
  @GetMapping ("/list")
     public List<TipoVentaObj> List(){
        System.out.println("tipoventa-List");
        return tipoVentaService.Listar();
    }
       @GetMapping ("/lista")
     public List<TipoVentaObj> Lista(){
        System.out.println("tipoventa-List");
        return tipoVentaService.findAllactivos();
    }
    @PostMapping("/byid")
    // @RequestMapping({"/municipios"})
     public TipoVentaObj GetById(@RequestBody int id){
      return tipoVentaService.ListarbyId(id);
    }
     
     @PostMapping("/add")
        public TipoVentaObj Add(@RequestBody Tipoventa obj){
        System.out.println("Add Tipoventa");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoVentaService.add(obj);
    }
         @PostMapping("/edit")
        public boolean Edit(@RequestBody Tipoventa obj){
        System.out.println("Add Tipoventa");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoVentaService.edit(obj);
    }
        
       @PostMapping("/remove")
        public void Remove(@RequestBody Tipoventa obj){
        System.out.println("Add Tipoventa");
        System.out.println(new Gson().toJson(obj));
         tipoVentaService.deletebyId(obj);
    }

}
