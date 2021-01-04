/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.psc.Entity.Tipolineafija;
import com.psc.Model.TipoLineaFijaObj;

import com.psc.Service.TipoLineaFijaService;
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
@RequestMapping("/tipolineafija")
public class TipoLineaFijaControler {

  @Resource
    private TipoLineaFijaService tipoLineaFijaService;
    
    
  //   @RequestMapping({"/poblacion"})
  @GetMapping("/list")
     public List<TipoLineaFijaObj> List(){
        System.out.println("list Tipolineafija");
        return tipoLineaFijaService.Listar();
    }
       @GetMapping("/lista")
     public List<TipoLineaFijaObj> Lista(){
        System.out.println("lista Tipolineafija");
        return tipoLineaFijaService.findAllactivos();
    }
    @PostMapping("/byid")
    // @RequestMapping({"/municipios"})
     public TipoLineaFijaObj GetById(@RequestBody int id){
        System.out.println("Tipolineafija");
        return tipoLineaFijaService.ListarbyId(id);
    }
     
     @PostMapping("/add")
        public TipoLineaFijaObj Add(@RequestBody Tipolineafija obj){
        System.out.println("Add Tipolineafija");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoLineaFijaService.add(obj);
    }
         @PostMapping("/edit")
        public boolean Edit(@RequestBody Tipolineafija obj){
        System.out.println("edit Tipolineafija");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoLineaFijaService.edit(obj);
    }
        
       @PostMapping("/remove")
        public void Remove(@RequestBody Tipolineafija obj){
        System.out.println("remove Tipolineafija");
        System.out.println(new Gson().toJson(obj));
         tipoLineaFijaService.deletebyId(obj);
    }

}
