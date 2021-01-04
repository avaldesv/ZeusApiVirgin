/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;
import com.google.gson.Gson;
import com.psc.Entity.Rol;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Service.RolService;
import com.psc.Service.UsuariosService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author AVV
 */
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.1.102:4200", "http://51.38.239.124", "http://172.16.80.73"})
@CrossOrigin(origins = "*")
@RestController 

 //@RequestMapping("/api")
public class RolControler {
    
      @Resource
     private RolService rolService;
//     @Autowired(required=true)
//    @Qualifier(value = "UsuariosService")
////    
//  
    
//   @GetMapping //("/usuarios")
//    public  String listar(){
//        System.out.println("ENTREEEEEEEEE");
//        return "asdasdasdasd";
//    }
   
  @RequestMapping(value="/rol")
     public List<RolObj> listar(){
     System.out.println("Listar Rol");
     return rolService.Listar() ;
    }
     
   
     
    
    
}
