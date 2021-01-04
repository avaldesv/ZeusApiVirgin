/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Controler;

import com.google.gson.Gson;
import com.psc.Entity.Tomador;
import com.psc.Entity.Usuarios;
import com.psc.Entity.Ventas;
import com.psc.Model.ExportarVentas;
import com.psc.Model.UsuariosObj;
import com.psc.Model.VentasObj;
import com.psc.Service.ExportarVentaService;
import com.psc.Service.UsuariosService;
import com.psc.Service.VentasService;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author AVV
 */
//@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.1.102:4200", "http://51.38.239.124", "http://172.16.80.73"})
@CrossOrigin(origins = "*")
@RestController 

public class VentasControler {
    
      @Resource
     private VentasService ventasService;
      
          @Resource
     private ExportarVentaService exportarVentaService;
      
           @Resource   
     private UsuariosService usuariosService;

    @RequestMapping({"/ventas/{id}/{fechaI}/{fechaF}"})
     public List<VentasObj> listar(@PathVariable("id") int id,@PathVariable("fechaI") String fechaI,@PathVariable("fechaF") String fechaF){
            System.out.println("Controller-----"+id+"--"+fechaI+"--"+fechaF);
         UsuariosObj user =usuariosService.ListarbyId(id);
         List<VentasObj> ventas = new LinkedList<>();
         if (user.getRolidRol().getIdRol() == 1 ) {
                System.out.println("ControllerSupervisor-----"+id+"--"+fechaI+"--"+fechaF);
              //---------------SI EL USUARIO ES ROL ADMIN O SUPERVISOR RETORAR TODAS LAS VENTAS-------------------------------------
             return ventasService.Listar();
            }
         else if( user.getRolidRol().getIdRol() == 2 ){
         return GetVentasBySupervisor( id, fechaI, fechaF);
         }
         else if(user.getRolidRol().getIdRol() == 3){
         return GetVentasByCoordinador( id, fechaI, fechaF);
         }
         else{
             //---------------SI EL USUARIO ES ROL AGENTE--RETORNAR TODAS SUS VENTAS-------------------------------------
             System.out.println("ControllerAgente-----"+id+"--"+fechaI+"--"+fechaF);
         return ventasService.ListarbyUserId(id, fechaI, fechaF);
         }
         
      }
     
     List<VentasObj> GetVentasByCoordinador(int id,String fechaI,String fechaF){
       List<VentasObj> ventas = new LinkedList<>();
       List<UsuariosObj> agentes = usuariosService.getUsersByCoordinador(id);
        System.out.println("AGENTES DEL COORDINADOR----------"+new Gson().toJson(agentes));
              
              for (UsuariosObj agente : agentes) {
                 ventas.addAll(ventasService.ListarbyUserId(agente.getIdUsuario(), fechaI, fechaF));
                    
             }
              System.out.println("Ventas del AGENTES DEL COORDINADOR----------"+new Gson().toJson(ventas));
         ventas.addAll(ventasService.ListarbyUserId(id, fechaI, fechaF));
          return ventas;
     }
     
      List<VentasObj> GetVentasBySupervisor(int id,String fechaI,String fechaF){
       List<VentasObj> ventas = new LinkedList<>();
       List<UsuariosObj> Coordinadores = usuariosService.getUsersBySupervisor(id);
              
              for (UsuariosObj obj : Coordinadores) {
                 ventas.addAll(GetVentasByCoordinador(obj.getIdUsuario(), fechaI, fechaF));
             }
         ventas.addAll(ventasService.ListarbyUserId(id, fechaI, fechaF));
          return ventas;
      }
     
     
      @GetMapping ("/export")
      public List<ExportarVentas> List(@RequestParam("fechai") String fechai,
              @RequestParam("fechaf") String fechaf,
              @RequestParam("idcoordinador") String idcoordinador,
              @RequestParam("segmento") String segmento,
              @RequestParam("nombre") String nombre,
              @RequestParam("dni") String dni,
              @RequestParam("apellidos") String apellidos,
              @RequestParam("telefono") String telefono)
      {
          
            Ventas v = new Ventas();
          Tomador t = new Tomador();
          t.setNombre(nombre);
          t.setPrimerApellido(apellidos);
          t.setTelefono1(telefono);
          t.setDni(dni);
          v.setIdTomador(t);
          System.out.println("Exportar fechai "+fechai);
          System.out.println("Exportar fechaf"+fechaf);
          System.out.println("Exportar nombre "+nombre);
          System.out.println("Exportar telefono"+telefono);
          System.out.println("Exportar dni"+dni);
          System.out.println("Exportar apellidos"+apellidos);
          System.out.println("segmento"+segmento);
          if(segmento == null || segmento=="")
          v.setIdSegmento(0);
          else v.setIdSegmento(Integer.parseInt(segmento));
          
//         System.out.println(new Gson().toJson(obj.venta));

        System.out.println("Exportar");
       
        //return exportarVentaService.getListaVentas(v, fechai != null && fechai !="" ?fechai.split("T")[0]:"",!StringUtils.isEmpty(fechaf)?fechaf.split("T")[0]:"",idcoordinador!=null?Integer.parseInt(idcoordinador):0);
   
        return exportarVentaService.getListaVentasSearch(v, fechai,fechaf,idcoordinador!=null && idcoordinador!="" ?Integer.parseInt(idcoordinador):0);
    }
    @RequestMapping({"/ventas/add"})
     public VentasObj AddUsuario(@RequestBody Ventas obj){
        System.out.println("Add Ventas new");
        System.out.println(new Gson().toJson(obj));
        return ventasService.add(obj);
    }
     
      @RequestMapping({"/ventas/search"})
     public List<VentasObj> Search(@RequestBody search_body obj){
        System.out.println("Search Venta");
         System.out.println("Search Venta  "+obj.fechai);
          System.out.println("Search Venta"+obj.fechaf);
        System.out.println(new Gson().toJson(obj));
     //      System.out.println("Search Venta  "+ obj.fechai != null && obj.fechai !=""?obj.fechai.split("T")[0]:"");
        //  System.out.println("Search Venta"+ StringUtils.isEmpty(obj.fechaf)?"asdasdas":"");
        Ventas v = new Ventas();
        v= obj.getVenta();
        v.setIdTomador( obj.venta.getIdTomador());
        return ventasService.getBySearch(v, obj.fechai != null && obj.fechai !="" ?obj.fechai.split("T")[0]:"",!StringUtils.isEmpty(obj.fechaf)?obj.fechaf.split("T")[0]:"",obj.idcoordinador);
    }
     
       @RequestMapping({"/ventas/remove"})
     public void DeleteUsuarios(@RequestBody Ventas obj){
        System.out.println("ELIMINAR Venta");
         System.out.println(new Gson().toJson(obj));
         ventasService.deletebyId(obj);
    }
    
    
    
}

 class search_body {
Ventas venta;
String fechai;
String fechaf;
int idcoordinador;

    public int getIdcoordinador() {
        return idcoordinador;
    }

    public void setIdcoordinador(int idcoordinador) {
        this.idcoordinador = idcoordinador;
    }

    public search_body(Ventas venta, String fechai, String fechaf, int idcoordinador) {
        this.venta = venta;
        this.fechai = fechai;
        this.fechaf = fechaf;
        this.idcoordinador = idcoordinador;
    }

    public Ventas getVenta() {
        return venta;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    public String getFechai() {
        return fechai;
    }

    public void setFechai(String fechai) {
        this.fechai = fechai;
    }

    public String getFechaf() {
        return fechaf;
    }

    public void setFechaf(String fechaf) {
        this.fechaf = fechaf;
    }

    public search_body() {
    }

    public search_body(Ventas venta, String fechai, String fechaf) {
        this.venta = venta;
        this.fechai = fechai;
        this.fechaf = fechaf;
    }



}