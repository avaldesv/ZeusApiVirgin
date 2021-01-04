/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Entity.Lineasasociadas;

/**
 *
 * @author AVV
 */
public class LineasasociadasObj {

  
    private Integer id;
    
    private String tipo;
   
    private String numero;
   
    private String titular;
   
    private String dni;
  
    private String donante;
  
    private String terminal;
    
    private String icc;
    
    private String tipoLinea;
    
    private int ventasidVentas;
    
  //  private VentasObj idVenta;

    public LineasasociadasObj() {
    }

    public LineasasociadasObj(Integer id) {
        this.id = id;
    }

    public LineasasociadasObj(Lineasasociadas lineas) {
        this.id = lineas.getId();
        this.tipo = lineas.getTipo();
        this.numero = lineas.getNumero();
        this.titular = lineas.getTitular();
        this.dni = lineas.getDni();
        this.donante = lineas.getDonante();
        this.terminal = lineas.getTerminal();
        this.icc = lineas.getIcc();
        this.tipoLinea = lineas.getTipoLinea();
       // this.idVenta = new VentasObj(lineas.getIdVenta());
      //  this.ventasidVentas = lineas.getVentasidVentas();
       
    }

    
    
    public LineasasociadasObj(Integer id, String tipo, String numero, String titular, String dni, String donante, String terminal, String icc, String tipoLinea) {
        this.id = id;
        this.tipo = tipo;
        this.numero = numero;
        this.titular = titular;
        this.dni = dni;
        this.donante = donante;
        this.terminal = terminal;
        this.icc = icc;
        this.tipoLinea = tipoLinea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDonante() {
        return donante;
    }

    public void setDonante(String donante) {
        this.donante = donante;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getIcc() {
        return icc;
    }

    public void setIcc(String icc) {
        this.icc = icc;
    }

    public String getTipoLinea() {
        return tipoLinea;
    }

    public void setTipoLinea(String tipoLinea) {
        this.tipoLinea = tipoLinea;
    }
//
//    public VentasObj getIdVenta() {
//        return idVenta;
//    }
//
//    public void setIdVenta(VentasObj idVenta) {
//        this.idVenta = idVenta;
//    }

}
