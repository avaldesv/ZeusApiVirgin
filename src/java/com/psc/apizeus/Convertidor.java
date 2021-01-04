



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.apizeus;

import com.google.gson.Gson;
import com.psc.Entity.Asegurados;
import com.psc.Entity.Campanyas;
import com.psc.Entity.Lineasasociadas;
import com.psc.Entity.Municipios;
import com.psc.Entity.Nomencladores;
import com.psc.Entity.Rol;
import com.psc.Entity.Segmentoventa;
import com.psc.Entity.Tipofutbool;
import com.psc.Entity.Tipolineafija;
import com.psc.Entity.Tipolineamovil;
import com.psc.Entity.Tipotv;
import com.psc.Entity.Tipoventa;
import com.psc.Entity.Tomador;
import com.psc.Entity.Usuarios;
import com.psc.Entity.Ventas;
import com.psc.Model.AseguradosObj;
import com.psc.Model.CampanyasObj;
import com.psc.Model.LineasasociadasObj;
import com.psc.Model.MunicipioObj;
import com.psc.Model.NomencladoresObj;
import com.psc.Model.RolObj;
import com.psc.Model.SegmentoVentaObj;
import com.psc.Model.TipoLineaFijaObj;
import com.psc.Model.TipoLineaMovilObj;
import com.psc.Model.TipoTvFutboolObj;
import com.psc.Model.TipoTvObj;
import com.psc.Model.TipoVentaObj;
import com.psc.Model.TomadorObj;
import com.psc.Model.UsuariosObj;
import com.psc.Model.VentasObj;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.psc.Dao.TipoLineaMovilDao;
import com.psc.Entity.Provincias;
import com.psc.Model.ProvinciaObj;

/**
 *
 * @author AVV
 */
@Component
public class Convertidor {
    
    public List<RolObj> ConvertRolList(List<Rol> list){
        try {
                List<RolObj> rollist = new ArrayList<>();
        for (Rol rol : list) {
            rollist.add(new RolObj(rol));
        }
     return rollist;
        } catch (Exception e) {
            return null;
        }
 
    }
    public List<RolObj> ConvertRolListRol(List<Rol> list){
    List<RolObj> rollist = new ArrayList<>();
        for (Rol rol : list) {
            rollist.add(new RolObj(rol));
        }
     return rollist;
    }
     public List<UsuariosObj> ConvertUsuariosList(List<Usuarios> list){
    List<UsuariosObj> rollist = new ArrayList<>();
        for (Usuarios rol : list) {
            rollist.add(new UsuariosObj(rol));
        }
     return rollist;
    }
    
         public List<MunicipioObj> ConvertMunicipioList(List<Municipios> list){
    List<MunicipioObj> rollist = new ArrayList<>();
        for (Municipios rol : list) {
            rollist.add(new MunicipioObj(rol));
        }
     return rollist;
    }
               public List<ProvinciaObj> ConvertProvinciaList(List<Provincias> list){
    List<ProvinciaObj> rollist = new ArrayList<>();
        for (Provincias rol : list) {
            rollist.add(new ProvinciaObj(rol));
        }
     return rollist;
    }
    
     
      public List<NomencladoresObj> ConvertNomencladoresList(List<Nomencladores> list){
    List<NomencladoresObj> rollist = new ArrayList<>();
        for (Nomencladores rol : list) {
            rollist.add(new NomencladoresObj(rol));
        }
     return rollist;
    }
       public List<VentasObj> ConvertVentasList(List<Ventas> list){
               try {
    List<VentasObj> rollist = new ArrayList<>();
        for (Ventas rol : list) {
   //          System.out.println(new Gson().toJson(rol));
          
            rollist.add(new VentasObj(rol));
             System.out.println("----FECHA VENTA---------------------"+rol.getFechaVenta());
           System.out.println("---IDVENTA---------------------"+rol.getIdVentas());
           System.out.println("----TOMADOR---------------------"+rol.getIdTomador());
        }
     return rollist;
     } catch (Exception e) {
            return null;
        }
    }
        public List<AseguradosObj> ConvertAseguradosList(List<Asegurados> list){
    List<AseguradosObj> rollist = new ArrayList<>();
        for (Asegurados rol : list) {
            rollist.add(new AseguradosObj(rol));
        }
     return rollist;
    }
          public List<LineasasociadasObj> ConvertLineasAsociadasList(List<Lineasasociadas> list){
    List<LineasasociadasObj> rollist = new ArrayList<>();
        for (Lineasasociadas rol : list) {
            rollist.add(new LineasasociadasObj(rol));
        }
     return rollist;
    }
            public List<CampanyasObj> ConvertCampanyasList(List<Campanyas> list){
    List<CampanyasObj> rollist = new ArrayList<>();
        for (Campanyas rol : list) {
            rollist.add(new CampanyasObj(rol));
        }
     return rollist;
    }
       
 public List<TomadorObj> ConvertTomadorList(List<Tomador> list){
    List<TomadorObj> rollist = new ArrayList<>();
        for (Tomador rol : list) {
            rollist.add(new TomadorObj(rol));
        }
     return rollist;
    }
                     
  public List<SegmentoVentaObj> ConvertSegmentoVentaList(List<Segmentoventa> list){
    List<SegmentoVentaObj> rollist = new ArrayList<>();
        for (Segmentoventa rol : list) {
            rollist.add(new SegmentoVentaObj(rol));
        }
     return rollist;
    }
   public List<TipoLineaFijaObj> ConvertTipoLineaFijaList(List<Tipolineafija> list){
    List<TipoLineaFijaObj> rollist = new ArrayList<>();
        for (Tipolineafija obj : list) {
            rollist.add(new TipoLineaFijaObj(obj));
        }
     return rollist;
    }
   
   
   public List<TipoLineaMovilObj> ConvertTipoLineaMoviList(List<Tipolineamovil> list){
    List<TipoLineaMovilObj> rollist = new ArrayList<>();
        for (Tipolineamovil obj : list) {
            rollist.add(new TipoLineaMovilObj(obj));
        }
     return rollist;
    }
   
   public List<TipoTvObj> ConvertTipoTvList(List<Tipotv> list){
    List<TipoTvObj> rollist = new ArrayList<>();
        for (Tipotv rol : list) {
            rollist.add(new TipoTvObj(rol));
        }
     return rollist;
    }
    public List<TipoTvFutboolObj > ConvertTipoTvFutboolList(List<Tipofutbool> list){
    List<TipoTvFutboolObj> rollist = new ArrayList<>();
        for (Tipofutbool rol : list) {
            rollist.add(new TipoTvFutboolObj(rol));
        }
     return rollist;
    }
                    
       public List<TipoVentaObj> ConvertTipoVentaList(List<Tipoventa> list){
    List<TipoVentaObj> rollist = new ArrayList<>();
        for (Tipoventa rol : list) {
            rollist.add(new TipoVentaObj(rol));
        }
     return rollist;
    }
       
}
