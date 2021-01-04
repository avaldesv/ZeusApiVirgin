/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Model;

import com.psc.Dao.TomadorDao;
import com.psc.Entity.Tomador;
import com.psc.Entity.Ventas;
import com.psc.Service.UsuariosService;
import com.psc.apizeus.Convertidor;
import java.util.List;
import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author AVV
 */
public class VentasObj{
    
         
    private Integer idVentas;
  
    private Integer idTipotv;

    private Integer idPromosion;
    
    private String fechaControl;
   
    private String fechaVenta;
    
    private Integer idSegmento;
   
    private Integer idTipoventa;
  
    private String numeroAgente;
   
    private String observaciones;
   
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
  
    private String nombreD;
 
    private String apellido1D;
   
    private String apellido2D;
 
    private String dniD;
  
    private UsuariosObj idUsuario;
 
    private int permanencia;
 
    private String mensualidad;
    
    private String precio;
  
    private List<LineasasociadasObj> lineasasociadasList;
   
    private TomadorObj idTomador;
    
    private String usuarionombre;
    
    private String precioM;

    private String precioS;

    private String precioA;
 
 //   private List<AseguradosObj> aseguradosList;
    
    

    public VentasObj() {
    }

    public VentasObj(Integer idVentas) {
        this.idVentas = idVentas;
    }
 
    public VentasObj(Ventas ventas) {
        try {
            
        System.out.println("VENTA-----------------------------------------------------------1");

        this.idVentas = ventas.getIdVentas();
        this.idTipotv = ventas.getIdTipotv();
        this.idPromosion = ventas.getIdPromosion();
        this.fechaControl = ventas.getFechaControl();
        this.fechaVenta = ventas.getFechaVenta();
        this.idSegmento = ventas.getIdSegmento();
        this.idTipoventa = ventas.getIdTipoventa();
        this.numeroAgente = ventas.getNumeroAgente();
        this.observaciones = ventas.getObservaciones();
        this.vcerrada = ventas.getVcerrada();
        this.vvalidada = ventas.getVvalidada();
        this.vsystema = ventas.getVsystema();
        this.vincorrecta = ventas.getVincorrecta();
        this.vscoring = ventas.getVscoring();
        this.vbaja = ventas.getVbaja();
        this.nombreA = ventas.getNombreA();
        this.apellido1A = ventas.getApellido1A();
        this.apellido2A = ventas.getApellido2A();
        this.dniA = ventas.getDniA();
   System.out.println("VENTA-----------------------------------------------------------2");
   //     this.idUsuario = 0 ;//ventas.getIdUsuario();
        
       
        this.idUsuario = new UsuariosObj(ventas.getIdUsuario());
            System.out.println("VENTA-----------------------------------------------------------2.5");
        this.permanencia = ventas.getPermanencia() == null?0:ventas.getPermanencia();
     System.out.println("VENTA-----------------------------------------------------------3");
        
        this.precioM= ventas.getPrecioM();
        this.precioS= ventas.getPrecioS();
        this.precioA= ventas.getPrecioA();
        this.idTomador = new TomadorObj(ventas.getIdTomador());
        System.out.println("VENTA-----------------------------------------------------------4");
        this.usuarionombre = ventas.getIdUsuario().getNombre()!=null?ventas.getIdUsuario().getNombre():""+" "+ventas.getIdUsuario().getApellidos() != null ?ventas.getIdUsuario().getApellidos():"";
    //        System.out.println("USUARIOOOOOO"+ventas.getUsuario().getNombre());
    System.out.println("VENTA-----------------------------------------------------------5");
             this.lineasasociadasList = new Convertidor().ConvertLineasAsociadasList(ventas.getLineasasociadasList());
             System.out.println("VENTA-----------------------------------------------------------6");
        } catch (Exception e) {
             System.out.println("ERRORRRRRRRRRRRRRRR----------VentasObj "+e);
        }
     
    }

    public Integer getIdVentas() {
        return idVentas;
    }

    public String getUsuarionombre() {
        return usuarionombre;
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

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public Integer getIdTipotv() {
        return idTipotv;
    }

    public void setIdTipotv(Integer idTipotv) {
        this.idTipotv = idTipotv;
    }

    public Integer getIdPromosion() {
        return idPromosion;
    }

    public void setIdPromosion(Integer idPromosion) {
        this.idPromosion = idPromosion;
    }

    public String getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(String fechaControl) {
        this.fechaControl = fechaControl;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Integer getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(Integer idSegmento) {
        this.idSegmento = idSegmento;
    }

    public Integer getIdTipoventa() {
        return idTipoventa;
    }

    public void setIdTipoventa(Integer idTipoventa) {
        this.idTipoventa = idTipoventa;
    }

    public String getNumeroAgente() {
        return numeroAgente;
    }

    public void setNumeroAgente(String numeroAgente) {
        this.numeroAgente = numeroAgente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public Integer getVbaja() {
        return vbaja;
    }

    public void setVbaja(Integer vbaja) {
        this.vbaja = vbaja;
    }

    public void setVvalidada(Integer vvalidada) {
        this.vvalidada = vvalidada;
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

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getApellido1D() {
        return apellido1D;
    }

    public void setApellido1D(String apellido1D) {
        this.apellido1D = apellido1D;
    }

    public String getApellido2D() {
        return apellido2D;
    }

    public void setApellido2D(String apellido2D) {
        this.apellido2D = apellido2D;
    }

    public String getDniD() {
        return dniD;
    }

    public void setDniD(String dniD) {
        this.dniD = dniD;
    }

    public UsuariosObj getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuariosObj idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public TomadorObj getIdTomador() {
        return idTomador;
    }

    public void setIdTomador(TomadorObj idTomador) {
        this.idTomador = idTomador;
    }
      //  @XmlTransient
    public List<LineasasociadasObj> getLineasasociadasList() {
        return lineasasociadasList;
    }

    public void setLineasasociadasList(List<LineasasociadasObj> lineasasociadasList) {
        this.lineasasociadasList = lineasasociadasList;
    }

}
