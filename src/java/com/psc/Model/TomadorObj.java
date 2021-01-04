/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Tomador;

/**
 *
 * @author AVV
 */
public class TomadorObj {

   // private static final long serialVersionUID = 1L;
   
    private Integer id;
   
    private String nombre;
   
    private String primerApellido;
    
    private String segundoApellido;
   
    private String dni;
    
    private String email;
   
    private String telefono1;
   
    private String telefono2;
 
    private String iban;
    
    private String credit;
    
    private String dniReverso;

    private String pedido;
    
    private String direccion;
   
    private String direccionNumero;
    
    private String direccionPlanta;
    
    private String direccionPortal;
    
    private String direccionBloque;
  
    private String direccionEscalera;
  
    private String direccionPuerta;
  
    private String direccionCP;
   
    private String direccionProvincia;
   
    private int direccionPoblacion;
    
    private String profesion;
  
    private String nombreEmpresa;
   
    private String ingresoNeto;
   

 
   public TomadorObj() {
    }

    public TomadorObj(Integer id) {
        this.id = id;
    }

    public TomadorObj(Tomador tom) {
        this.id = tom.getId();
        this.nombre = tom.getNombre();
        this.primerApellido = tom.getPrimerApellido();
        this.segundoApellido = tom.getSegundoApellido();
        this.dni = tom.getDni();
        this.email = tom.getEmail();
        this.telefono1 = tom.getTelefono1();
        this.telefono2 = tom.getTelefono2();
        this.iban = tom.getIban();
        this.dniReverso = tom.getDniReverso();
        this.pedido = tom.getPedido();
        this.direccion = tom.getDireccion();
        this.direccionNumero = tom.getDireccionNumero();
        this.direccionPlanta = tom.getDireccionPlanta();
        this.direccionPortal = tom.getDireccionPortal();
        this.direccionBloque = tom.getDireccionBloque();
        this.direccionEscalera = tom.getDireccionEscalera();
        this.direccionPuerta = tom.getDireccionPuerta();
        this.direccionCP = tom.getDireccionCP();
        this.direccionProvincia = tom.getDireccionProvincia();
        this.direccionPoblacion = tom.getDireccionPoblacion();
   //     this.ventas = new VentasObj(tom.getVentasList());
       this.profesion = tom.getProfesion();
       this.nombreEmpresa = tom.getNombreEmpresa();
       this.ingresoNeto = tom.getIngresoNeto();
       this.credit = tom.getCredit();
    }

    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getIngresoNeto() {
        return ingresoNeto;
    }

    public void setIngresoNeto(String ingresoNeto) {
        this.ingresoNeto = ingresoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
    

    public String getDniReverso() {
        return dniReverso;
    }

    public void setDniReverso(String dniReverso) {
        this.dniReverso = dniReverso;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionNumero() {
        return direccionNumero;
    }

    public void setDireccionNumero(String direccionNumero) {
        this.direccionNumero = direccionNumero;
    }

    public String getDireccionPlanta() {
        return direccionPlanta;
    }

    public void setDireccionPlanta(String direccionPlanta) {
        this.direccionPlanta = direccionPlanta;
    }

    public String getDireccionPortal() {
        return direccionPortal;
    }

    public void setDireccionPortal(String direccionPortal) {
        this.direccionPortal = direccionPortal;
    }

    public String getDireccionBloque() {
        return direccionBloque;
    }

    public void setDireccionBloque(String direccionBloque) {
        this.direccionBloque = direccionBloque;
    }

    public String getDireccionEscalera() {
        return direccionEscalera;
    }

    public void setDireccionEscalera(String direccionEscalera) {
        this.direccionEscalera = direccionEscalera;
    }

    public String getDireccionPuerta() {
        return direccionPuerta;
    }

    public void setDireccionPuerta(String direccionPuerta) {
        this.direccionPuerta = direccionPuerta;
    }

    public String getDireccionCP() {
        return direccionCP;
    }

    public void setDireccionCP(String direccionCP) {
        this.direccionCP = direccionCP;
    }

    public String getDireccionProvincia() {
        return direccionProvincia;
    }

    public void setDireccionProvincia(String direccionProvincia) {
        this.direccionProvincia = direccionProvincia;
    }

    public int getDireccionPoblacion() {
        return direccionPoblacion;
    }

    public void setDireccionPoblacion(int direccionPoblacion) {
        this.direccionPoblacion = direccionPoblacion;
    }

  
   
    
}
