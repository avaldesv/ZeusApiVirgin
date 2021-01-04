/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.psc.Entity.Segmentoventa;
import com.psc.Model.SegmentoVentaObj;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.psc.Service.SegmentoVentaService;

/**
 *
 * @author AVV
 */
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.1.102:4200", "http://51.38.239.124", "http://172.16.80.73"})
@RestController
@RequestMapping("/segmentoventa")
public class SegmentoVentaControler {

    @Resource
    private SegmentoVentaService segmentoVentaService;
    
    
  //   @RequestMapping({"/poblacion"})
  @GetMapping ("/list")
     public List<SegmentoVentaObj> List(){
        System.out.println("list Segmentoventa");
        return segmentoVentaService.Listar();
    }
       @GetMapping ("/lista")
     public List<SegmentoVentaObj> Lista(){
        System.out.println(" lista Segmentoventa");
        return segmentoVentaService.findAllactivos();
    }
     
     
    @PostMapping("/byid")
    // @RequestMapping({"/municipios"})
     public SegmentoVentaObj GetById(@RequestBody int id){
        System.out.println(" byid Segmentoventa");
        return segmentoVentaService.ListarbyId(id);
    }
     
     @PostMapping("/add")
        public SegmentoVentaObj Add(@RequestBody Segmentoventa obj){
        System.out.println("Add Segmentoventa");
        obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return segmentoVentaService.add(obj);
    }
         @PostMapping("/edit")
        public boolean Edit(@RequestBody Segmentoventa obj){
        System.out.println("edit Segmentoventa");
         obj.setEliminada(0);
        System.out.println(new Gson().toJson(obj));
        return segmentoVentaService.edit(obj);
    }
        
       @PostMapping("/remove")
        public void Remove(@RequestBody Segmentoventa obj){
        System.out.println("remove Segmentoventa");
        System.out.println(new Gson().toJson(obj));
         segmentoVentaService.deletebyId(obj);
    }

}
