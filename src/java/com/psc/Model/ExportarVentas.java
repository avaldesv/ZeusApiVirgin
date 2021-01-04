/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import java.util.List;

/**
 *
 * @author AVV
 */
public class ExportarVentas {
    
    private Integer idVentas;
    
    private String usuario;         //ID USUARIO --> USERNAME
    
    private String fechaVenta;
    
    private String fechaControl;
    
    private String Tipotv;     //Integer idTipotv;

    private String Promosion; //Integer idPromosion;
    
    private String idSegmento;  //Integer idSegmento;
   
    private String idTipoventa;  //Integer idTipoventa;
  
    private String numeroAgente;
   
  //  private String observaciones;
   
    private Integer vcerrada;
   
    private Integer vincorrecta;
   
    private Integer vscoring;
   
    private Integer vsystema;
  
    private Integer vvalidada;
    private Integer vbaja;
    
    private String nombreA;
  
    private String apellido1A;
   
    private String apellido2A;
 
    private String dniA;
  
    private int permanencia;
 

    
    private String precioM;
    private String precioS;
    private String precioA;
  
     //----------------TOMADOR-------------------------
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
   
    private String direccionPoblacion;
    
    private String profesion;
  
    private String nombreEmpresa;
   
    private String ingresoNeto;
    //------------------------------------------------
    
// private List<LineasasociadasObj> lineasasociadasList;
    //-------------DATOS LINEA ASOCIADA-----------------------
    
    private String tipo;
   
    private String linea_numero;
   
    private String linea_titular;
   
    private String linea_dni;
  
    private String linea_donante;
  
    private String linea_terminal;
    
    private String linea_tipoLinea;

    //--------------------------------------------------------

    public ExportarVentas(Integer idVentas, String usuario, String fechaVenta, String fechaControl, String Tipotv, String Promosion, String idSegmento, String idTipoventa, String numeroAgente, Integer vcerrada, Integer vincorrecta, Integer vscoring, Integer vsystema, Integer vvalidada,Integer vbaja, String nombreA, String apellido1A, String apellido2A, String dniA, int permanencia, String precioM,String precioS,String precioA, String nombre, String primerApellido, String segundoApellido, String dni, String email, String telefono1, String telefono2, String iban,String credit, String dniReverso, String pedido, String direccion, String direccionNumero, String direccionPlanta, String direccionPortal, String direccionBloque, String direccionEscalera, String direccionPuerta, String direccionCP, String direccionProvincia, String direccionPoblacion, String profesion, String nombreEmpresa, String ingresoNeto, String tipo, String linea_numero, String linea_titular, String linea_dni, String linea_donante, String linea_terminal, String linea_tipoLinea) {
        this.idVentas = idVentas;
        this.usuario = usuario;
        this.fechaVenta = fechaVenta;
        this.fechaControl = fechaControl;
        this.Tipotv = Tipotv;
        this.Promosion = Promosion;
        this.idSegmento = idSegmento;
        this.idTipoventa = idTipoventa;
        this.numeroAgente = numeroAgente;
        this.vcerrada = vcerrada;
        this.vincorrecta = vincorrecta;
        this.vscoring = vscoring;
        this.vsystema = vsystema;
        this.vvalidada = vvalidada;
        this.vbaja = vbaja;
        this.nombreA = nombreA;
        this.apellido1A = apellido1A;
        this.apellido2A = apellido2A;
        this.dniA = dniA;
        this.permanencia = permanencia;
    
        this.precioS = precioS;
        this.precioM = precioM;
        this.precioA = precioA;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.dni = dni;
        this.email = email;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.iban = iban;
        this.credit = credit ;
        this.dniReverso = dniReverso;
        this.pedido = pedido;
        this.direccion = direccion;
        this.direccionNumero = direccionNumero;
        this.direccionPlanta = direccionPlanta;
        this.direccionPortal = direccionPortal;
        this.direccionBloque = direccionBloque;
        this.direccionEscalera = direccionEscalera;
        this.direccionPuerta = direccionPuerta;
        this.direccionCP = direccionCP;
        this.direccionProvincia = direccionProvincia;
        this.direccionPoblacion = direccionPoblacion;
        this.profesion = profesion;
        this.nombreEmpresa = nombreEmpresa;
        this.ingresoNeto = ingresoNeto;
        this.tipo = tipo;
        this.linea_numero = linea_numero;
        this.linea_titular = linea_titular;
        this.linea_dni = linea_dni;
        this.linea_donante = linea_donante;
        this.linea_terminal = linea_terminal;
        this.linea_tipoLinea = linea_tipoLinea;
    }

    public ExportarVentas() {
    }
    
    

    public Integer getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(String fechaControl) {
        this.fechaControl = fechaControl;
    }

    public String getTipotv() {
        return Tipotv;
    }

    public void setTipotv(String Tipotv) {
        this.Tipotv = Tipotv;
    }

    public String getPromosion() {
        return Promosion;
    }

    public void setPromosion(String Promosion) {
        this.Promosion = Promosion;
    }

    public String getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(String idSegmento) {
        this.idSegmento = idSegmento;
    }

    public String getIdTipoventa() {
        return idTipoventa;
    }

    public void setIdTipoventa(String idTipoventa) {
        this.idTipoventa = idTipoventa;
    }

    public String getNumeroAgente() {
        return numeroAgente;
    }

    public void setNumeroAgente(String numeroAgente) {
        this.numeroAgente = numeroAgente;
    }

    public Integer getVcerrada() {
        return vcerrada;
    }

    public void setVcerrada(Integer vcerrada) {
        this.vcerrada = vcerrada;
    }

    public Integer getVincorrecta() {
        return vincorrecta;
    }

    public void setVincorrecta(Integer vincorrecta) {
        this.vincorrecta = vincorrecta;
    }

    public Integer getVscoring() {
        return vscoring;
    }

    public void setVscoring(Integer vscoring) {
        this.vscoring = vscoring;
    }

    public Integer getVsystema() {
        return vsystema;
    }

    public void setVsystema(Integer vsystema) {
        this.vsystema = vsystema;
    }

    public Integer getVvalidada() {
        return vvalidada;
    }

    public void setVvalidada(Integer vvalidada) {
        this.vvalidada = vvalidada;
    }

    public Integer getVbaja() {
        return vbaja;
    }

    public void setVbaja(Integer vbaja) {
        this.vbaja = vbaja;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getApellido1A() {
        return apellido1A;
    }

    public void setApellido1A(String apellido1A) {
        this.apellido1A = apellido1A;
    }

    public String getApellido2A() {
        return apellido2A;
    }

    public void setApellido2A(String apellido2A) {
        this.apellido2A = apellido2A;
    }

    public String getDniA() {
        return dniA;
    }

    public void setDniA(String dniA) {
        this.dniA = dniA;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }


    public String getPrecioM() {
        return precioM;
    }

    public void setPrecioM(String precioM) {
        this.precioM = precioM;
    }

    public String getPrecioS() {
        return precioS;
    }

    public void setPrecioS(String precioS) {
        this.precioS = precioS;
    }

    public String getPrecioA() {
        return precioA;
    }

    public void setPrecioA(String precioA) {
        this.precioA = precioA;
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

    public String getDireccionPoblacion() {
        return direccionPoblacion;
    }

    public void setDireccionPoblacion(String direccionPoblacion) {
        this.direccionPoblacion = direccionPoblacion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLinea_numero() {
        return linea_numero;
    }

    public void setLinea_numero(String linea_numero) {
        this.linea_numero = linea_numero;
    }

    public String getLinea_titular() {
        return linea_titular;
    }

    public void setLinea_titular(String linea_titular) {
        this.linea_titular = linea_titular;
    }

    public String getLinea_dni() {
        return linea_dni;
    }

    public void setLinea_dni(String linea_dni) {
        this.linea_dni = linea_dni;
    }

    public String getLinea_donante() {
        return linea_donante;
    }

    public void setLinea_donante(String linea_donante) {
        this.linea_donante = linea_donante;
    }

    public String getLinea_terminal() {
        return linea_terminal;
    }

    public void setLinea_terminal(String linea_terminal) {
        this.linea_terminal = linea_terminal;
    }

    public String getLinea_tipoLinea() {
        return linea_tipoLinea;
    }

    public void setLinea_tipoLinea(String linea_tipoLinea) {
        this.linea_tipoLinea = linea_tipoLinea;
    }
   
    
    
    
    
}
