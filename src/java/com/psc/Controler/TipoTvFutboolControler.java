/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.psc.Entity.Tipofutbool;
import com.psc.Model.TipoTvFutboolObj;

import com.psc.Service.TipoTvFutboolService;
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
@RequestMapping("/promosiones")
public class TipoTvFutboolControler {

      @Resource
    private TipoTvFutboolService tipoTvFutboolService;
    
    
  //   @RequestMapping({"/poblacion"})
  @GetMapping("/list")
     public List<TipoTvFutboolObj> List(){
        System.out.println("List TipoTvFutbool");
        return tipoTvFutboolService.Listar();
    }
      @GetMapping("/lista")
     public List<TipoTvFutboolObj> Lista(){
        System.out.println("List Activos TipoTvFutbool");
        return tipoTvFutboolService.findAllactivos();
    }
    @PostMapping("/byid")
    // @RequestMapping({"/municipios"})
     public TipoTvFutboolObj GetById(@RequestBody int id){
        System.out.println("GetById TipoTvFutbool");
        return tipoTvFutboolService.ListarbyId(id);
    }
     
     @PostMapping("/add")
        public TipoTvFutboolObj Add(@RequestBody Tipofutbool obj){
        System.out.println("Add TipoTvFutbool");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoTvFutboolService.add(obj);
    }
         @PostMapping("/edit")
        public boolean Edit(@RequestBody Tipofutbool obj){
        System.out.println("Edit TipoTvFutbool");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return tipoTvFutboolService.edit(obj);
    }
        
       @PostMapping("/remove")
        public void Remove(@RequestBody Tipofutbool obj){
        System.out.println("remove TipoTvFutbool");
        System.out.println(new Gson().toJson(obj));
         tipoTvFutboolService.deletebyId(obj);
    }

}
