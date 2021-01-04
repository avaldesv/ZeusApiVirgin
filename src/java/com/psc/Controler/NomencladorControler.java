/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

//import com.google.gson.JsonParser;
import com.psc.Model.MunicipioObj;
import com.psc.Model.ProvinciaObj;

import com.psc.Service.MunicipioService;
import com.psc.Service.ProvinciaService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/nomencladores")
public class NomencladorControler {

    @Resource
    private MunicipioService municipioService;
    
        @Resource
    private ProvinciaService provinciaService;

//@RequestMapping({"/nomenclador/list"})
//     public List<UsuariosObj> listar(){
//        System.out.println("Listar Usuarios");
//        return usuariosService.Listar();
//    }
//     @PostMapping ("/add")
//     public UsuariosObj AddUsuario(@RequestBody Usuarios user){
//        System.out.println("Add Usuarios");
//        return usuariosService.add(user);
//    }
   @RequestMapping({"/poblacion"})
  //  @GetMapping({"/municipiosall"})
     public List<MunicipioObj> MunicipiosList(){
        System.out.println("CheckUsername");
        return municipioService.Listar();
    }
    // @RequestMapping("{/nomencladores/municipios}")
     @PostMapping("/municipios")
    // @RequestMapping({"/municipios"})
     public List<MunicipioObj> MunicipiosByIdProvincia(@RequestBody int id){
        System.out.println("CheckUsername");
        return municipioService.ListarbyId(id);
    }
     
       @GetMapping("/provincias")
    // @RequestMapping({"/municipios"})
     public List<ProvinciaObj> Provincias(){
        System.out.println("provincias");
        return provinciaService.Listar();
    }
     
        @GetMapping("/provincias/{id}")
    // @RequestMapping({"/municipios"})
     public ProvinciaObj ProvinciaById(@PathVariable("id") int id){
        System.out.println("/provincias/{id}");
        return provinciaService.getbyId(id);
    }

}
