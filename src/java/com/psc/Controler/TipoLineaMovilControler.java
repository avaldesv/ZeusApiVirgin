/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.psc.Entity.Tipolineamovil;
import com.psc.Model.TipoLineaMovilObj;

import com.psc.Service.TipoLineaMovilService;
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
@RequestMapping("/tipolineamovil")
public class TipoLineaMovilControler {

    @Resource
    private TipoLineaMovilService tipoLineaMovilService;
    
    
 // @RequestMapping({"/list"})
  @GetMapping ("/list")
     public List<TipoLineaMovilObj> List(){
        System.out.println("list Tipolineamovil");
        return tipoLineaMovilService.Listar();
    }
       @GetMapping ("/lista")
     public List<TipoLineaMovilObj> Lista(){
        System.out.println("lista Tipolineamovil");
        return tipoLineaMovilService.findAllactivos();
    }
     
     
    @PostMapping("/byid")
    // @RequestMapping({"/municipios"})
     public TipoLineaMovilObj GetById(@RequestBody int id){
        System.out.println("Tipolineamovil");
        return tipoLineaMovilService.ListarbyId(id);
    }
     
     @PostMapping("/add")
        public TipoLineaMovilObj Add(@RequestBody Tipolineamovil obj){
        System.out.println("Add Tipolineamovil");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoLineaMovilService.add(obj);
    }
         @PostMapping("/edit")
        public boolean Edit(@RequestBody Tipolineamovil obj){
        System.out.println("edit Tipolineamovil");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoLineaMovilService.edit(obj);
    }
        
       @PostMapping("/remove")
        public void Remove(@RequestBody Tipolineamovil obj){
        System.out.println("remove Tipolineamovil");
        System.out.println(new Gson().toJson(obj));
         tipoLineaMovilService.deletebyId(obj);
    }
}
