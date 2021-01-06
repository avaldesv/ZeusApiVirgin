/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;
import com.google.gson.Gson;
import com.psc.Entity.Campanyas;
import com.psc.Entity.Usuarios;
import com.psc.Model.UsuariosObj;
import com.psc.Model.UsuariosResponsableUpdate;
import com.psc.Service.UsuariosService;
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
//@CrossOrigin(origins = "http://172.16.80.73:4200")
//@CrossOrigin(origins = "*", maxAge = 3600)
//@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.1.102:4200", "http://51.38.239.124", "http://172.16.80.73"})
@CrossOrigin(origins = "*")
@RestController 


public class UsuariosControler {
    
      @Resource   
     private UsuariosService usuariosService;

 @RequestMapping({"/usuarios/list"})
     public List<UsuariosObj> listar(){
        System.out.println("Listar Usuarios");
        return usuariosService.Listar();
    }
      @RequestMapping({"/usuarios/lista"})
     public List<UsuariosObj> listarActive(){
        System.out.println("Listar Usuarios");
        return usuariosService.findAllactivos();
    }
      @RequestMapping({"/usuarios/cusers"})
     public List<UsuariosObj> GetCoordinadores(@RequestBody int rol){
        System.out.println("Listar Usuarios con rol coordinador");
        return usuariosService.getUsersByRol(rol);
    }
    @RequestMapping({"/usuarios/add"})
     public boolean AddUsuario(@RequestBody Usuarios user){
        System.out.println("Add Usuarios");
         user.setEliminada(0);
        Campanyas  camp = new Campanyas();
        camp.setIdCampana(1);
         user.setIdCampanya(camp);
         System.out.println(new Gson().toJson(user));
        return usuariosService.add(user);
    }
  @RequestMapping({"/usuarios/checkusername"})
     public int CheckUsername(@RequestBody String user){
        System.out.println("CheckUsername");
        return usuariosService.CheckUsername(user);
    }
    
      @RequestMapping({"/usuarios/remove"})
     public void DeleteUsuarios(@RequestBody Usuarios user){
        System.out.println("ELIMINAR USUARIO  "+ user.getIdUsuario()+" " +user.getNombre()+" "+user.getApellidos());
        
         usuariosService.deletebyId(user);
    }
     
     @RequestMapping({"/usuarios/chngp"})
     public boolean ChangePassword(@RequestBody Usuarios user){
        System.out.println("Cambiar Password");
        System.out.println("EditUsuarios");
        user.setEliminada(0);
        Campanyas  camp = new Campanyas();
        camp.setIdCampana(1);
        user.setIdCampanya(camp);
         System.out.println(new Gson().toJson(user));
        return usuariosService.edit(user);
    } 
     
     
     
     
       @RequestMapping({"/usuarios/edit"})
     public boolean EditUsuario(@RequestBody Usuarios user){
        System.out.println("EditUsuarios");
         user.setEliminada(0);
        Campanyas  camp = new Campanyas();
        camp.setIdCampana(1);
        user.setIdCampanya(camp);
         System.out.println(new Gson().toJson(user));
        return usuariosService.edit(user);
    }
     
     
         @RequestMapping({"/usuarios/updatemannager"})
     public boolean EditUsuario(@RequestBody UsuariosResponsableUpdate userresp){
             try {
                  Campanyas  camp = new Campanyas();
        camp.setIdCampana(1);
       
            
             List<Usuarios> users = userresp.getUsuariosasig();
         if(userresp.getResponsale().getRolidRol().getIdRol() == 3)
         {
         List<Usuarios> usersoldasig = usuariosService.getUsuariosByCoordinador(userresp.getResponsale().getIdUsuario());
         if(usersoldasig != null)
         {
             for (Usuarios usuariosObj : usersoldasig) {
                 usuariosObj.setIdCoordinador(0);
                usuariosService.edit(usuariosObj);
             }
         }
         for (Usuarios usuarios : users) {
                 usuarios.setIdCoordinador(userresp.getResponsale().getIdUsuario());
                  usuarios.setIdCampanya(camp); 
                usuariosService.edit(usuarios);
             }
         
         }
         else if(userresp.getResponsale().getRolidRol().getIdRol() == 2)
         {
         List<Usuarios> usersoldasig = usuariosService.getUsuariosBySupervisor(userresp.getResponsale().getIdUsuario());
         if(usersoldasig != null)
         {
             for (Usuarios usuariosObj : usersoldasig) {
                 usuariosObj.setIdSupervisor(0);
                usuariosService.edit(usuariosObj);
             }
         }
         for (Usuarios usuarios : users) {
                 usuarios.setIdSupervisor(userresp.getResponsale().getIdUsuario());
                  usuarios.setIdCampanya(camp); 
                usuariosService.edit(usuarios);
             }
         
         }
             
        
       return true;
        } catch (Exception e) {
                 System.out.println("ERROR ASIGNANDO RESPONSABLE");
              return false;
        }
    }
    
}
