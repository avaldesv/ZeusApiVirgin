/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Usuarios;
import com.psc.apizeus.Convertidor;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AVV
 */
public class UsuariosObj {

  
   
    private Integer idUsuario;
    
    private String username;
    
    private String password;
   
    private String correo;
   
    private String nombre;
    
    private String apellidos;
   
    private String movil;
    
    private String direccion;
    
    private boolean enabled;
   
    private Integer idCoordinador;
    private Integer idSupervisor;
  
    private List<VentasObj> ventasList;
   
    private int campanaidCampana;
    
  
    private RolObj rolidRol;

    public UsuariosObj() {
    }

    
    public UsuariosObj(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Integer idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

     public UsuariosObj(Usuarios user) {
         this.idUsuario = user.getIdUsuario();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.correo = user.getCorreo()!= null? user.getCorreo():"";
        this.nombre = user.getNombre()!= null? user.getNombre():"";
        this.apellidos = user.getApellidos()!= null? user.getApellidos():"";
        this.movil = user.getMovil()!= null? user.getMovil():"";
        this.direccion = user.getDireccion()!= null? user.getDireccion():"";
        this.enabled = user.getEnabled();
         try {
             this.idCoordinador = user.getIdCoordinador() != null? user.getIdCoordinador():0;
              this.idSupervisor = user.getIdSupervisor() != null? user.getIdSupervisor():0;
  //      this.ventasList =  new Convertidor().ConvertVentasList( user.getVentasList());
        this.campanaidCampana = user.getCampanaidCampana();
        this.rolidRol =   new RolObj( user.getRolidRol());
           System.err.println("Paso----------------------UsuariosObj");
         } catch (Exception e) {
             System.err.println("ERRORRRRR----------------------UsuariosObj"+e);
         }
      
         
    }

    
    public UsuariosObj(Integer idUsuario, String username, String password, String correo, String nombre, String apellidos, String movil, String direccion, boolean enabled, Integer idCoordinador,Integer idSupervisor, List<VentasObj> ventasList, int campanaidCampana, RolObj rolidRol) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.direccion = direccion;
        this.enabled = enabled;
        this.idCoordinador = idCoordinador;
        this.ventasList = ventasList;
        this.campanaidCampana = campanaidCampana;
        this.rolidRol = rolidRol;
        this.idSupervisor = idSupervisor;
        System.out.println("idSupervisor------------------------------------- "+idSupervisor);
    }

    public UsuariosObj(Integer idUsuario, String username, String password, String nombre, boolean enabled) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.enabled = enabled;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(Integer idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    @XmlTransient
    public List<VentasObj> getVentasList() {
        return ventasList;
    }

    public void setVentasList(List<VentasObj> ventasList) {
        this.ventasList = ventasList;
    }

    public int getCampanaidCampana() {
        return campanaidCampana;
    }

    public void setCampanaidCampana(int campanaidCampana) {
        this.campanaidCampana = campanaidCampana;
    }

    public RolObj getRolidRol() {
        return rolidRol;
    }

    public void setRolidRol(RolObj rolidRol) {
        this.rolidRol = rolidRol;
    }

   
    
}
