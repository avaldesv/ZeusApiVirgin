/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.psc.Entity.Tipotv;
import com.psc.Model.MunicipioObj;
import com.psc.Model.TipoTvObj;

import com.psc.Service.MunicipioService;
import com.psc.Service.TipoTvService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RequestMapping("/tipotv")
public class TipoTvControler {

    @Resource
    private TipoTvService tipoTvService;
    
    
// @RequestMapping({"/list"})
  @GetMapping ("/list")
     public List<TipoTvObj> List(){
        System.out.println("list Tipotv ");
        return tipoTvService.Listar();
    }
       @GetMapping ("/lista")
     public List<TipoTvObj> Lista(){
        System.out.println("lista Tipotv ");
        return tipoTvService.findAllactivos();
    }
    @PostMapping("/byid")
    // @RequestMapping({"/municipios"})
     public TipoTvObj GetById(@RequestBody int id){
        System.out.println("CheckUsername");
        return tipoTvService.ListarbyId(id);
    }
     
     @PostMapping("/add")
        public TipoTvObj Add(@RequestBody Tipotv obj){
        System.out.println("Add Tipotv");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoTvService.add(obj);
    }
         @PostMapping("/edit")
        public boolean Edit(@RequestBody Tipotv obj){
        System.out.println("edit Tipotv");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoTvService.edit(obj);
    }
        
       @PostMapping("/remove")
        public void Remove(@RequestBody Tipotv obj){
        System.out.println("remove Tipotv");
        System.out.println(new Gson().toJson(obj));
         tipoTvService.deletebyId(obj);
    }

}
