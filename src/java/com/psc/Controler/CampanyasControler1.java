/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;
import com.psc.Entity.Campanyas;
import com.psc.Entity.Usuarios;
import com.psc.Entity.Ventas;
import com.psc.Model.CampanyasObj;
import com.psc.Model.UsuariosObj;
import com.psc.Model.VentasObj;
import com.psc.Service.CampanyaService;
import com.psc.Service.UsuariosService;
import com.psc.Service.VentasService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

public class CampanyasControler1 {
    
      @Resource
     private CampanyaService campanyaService;

   @RequestMapping({"/campanyas"})
     public List<CampanyasObj> listar(){
        System.out.println("Listar Campanya");
        return campanyaService.Listar();
    }
     @RequestMapping({"/campanyas/add"})
     public CampanyasObj AddUsuario(@RequestBody Campanyas obj){
        System.out.println("Add Ventas");
        return campanyaService.add(obj);
    }
    
    
    
}
