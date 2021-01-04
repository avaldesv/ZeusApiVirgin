/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Dao.LineasasociadasDao;
import com.psc.Dao.MunicipioDao;
import com.psc.Dao.ProvinciaDao;
import com.psc.Dao.SegmentoVentaDao;
import com.psc.Dao.TipoLineaFijaDao;
import com.psc.Dao.TipoLineaMovilDao;
import com.psc.Dao.TipoTvDao;
import com.psc.Dao.TipoTvFutboolDao;
import com.psc.Dao.TipoVentaDao;
import com.psc.Dao.TomadorDao;
import com.psc.Dao.UsuariosDao;
import com.psc.Dao.VentasDao;
import com.psc.Entity.Lineasasociadas;
import com.psc.Entity.Municipios;
import com.psc.Entity.Provincias;
import com.psc.Entity.Tipolineafija;
import com.psc.Entity.Tipolineamovil;
import com.psc.Entity.Ventas;
import com.psc.Model.ExportarVentas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AVV
 */
@Service
@Transactional
public class ExportarVentaService {

    @Resource
    private LineasasociadasDao lineasasociadasDao;

    @Resource
    private SegmentoVentaDao segmentoVentaDao;

    @Resource
    private TipoLineaFijaDao tipoLineaFijaDao;

    @Resource
    private TipoLineaMovilDao tipoLineaMovilDao;

    @Resource
    private TipoTvFutboolDao tipoTvFutboolDao;

    @Resource
    private TipoVentaDao tipoVentaDao;

    @Resource
    private TomadorDao tomadorDao;

    @Resource
    private UsuariosDao usuariosDao;

    @Resource
    private VentasDao ventasDao;

    @Resource
    private TipoTvDao tipoTvDao;

    @Resource
    private MunicipioDao municipioDao;

    @Resource
    private ProvinciaDao provinciaDao;

    public List<ExportarVentas> getListaVentas(Ventas obj, String fechai, String fechaf, int idcoordinador) {
        List<ExportarVentas> lista = new ArrayList<>();
        ExportarVentas venta;
        List<Lineasasociadas> lineasAsociadas = lineasasociadasDao.findAll();
        for (Lineasasociadas l_a : lineasAsociadas) {

            String TipoLinea = "";
            String tipo = "";
            String promosion = "";
            String Segmento = "";
            String Tipoventa = "";

            Municipios m = municipioDao.getById(l_a.getIdVenta().getIdTomador().getDireccionPoblacion());
            String municipio = m != null ? m.getMunicipio() : "";
            Provincias p = provinciaDao.getById(Integer.parseInt(l_a.getIdVenta().getIdTomador().getDireccionProvincia()));
            String provincia = p != null ? p.getProvincia() : "";

            try {
                System.out.println("com.psc.Service.ExportarVentaService.getListaVentas()" + l_a.getTipoLinea());
                String t = "M";
                if (l_a.getTipoLinea().toString().equals(t)) {
                    TipoLinea = "Linea Movil";
                    System.out.println("com.psc.Service.ExportarVentaService.getListaVentas()" + TipoLinea);
                    Tipolineamovil tlm = tipoLineaMovilDao.getById(Integer.parseInt(l_a.getTipo()));
                    tipo = tlm != null ? tlm.getNombre() : "";
                } else {
                    System.out.println("l_a.getTipo()" + l_a.getTipo());
                    Tipolineafija tlf = tipoLineaFijaDao.getById(Integer.parseInt(l_a.getTipo()));
                    tipo = tlf != null ? tlf.getNombre() : "";
                    TipoLinea = "Linea Fija";
                    System.out.println("com.psc.Service.ExportarVentaService.getListaVentas()" + TipoLinea);
                }
                if (l_a.getIdVenta().getIdPromosion() != null) {
                    promosion = tipoTvFutboolDao.getById(l_a.getIdVenta().getIdPromosion()) != null ? tipoTvFutboolDao.getById(l_a.getIdVenta().getIdPromosion()).getNombre() : "";
                }
                if (l_a.getIdVenta().getIdSegmento() != null) {
                    Segmento = segmentoVentaDao.getById(l_a.getIdVenta().getIdSegmento()) != null ? segmentoVentaDao.getById(l_a.getIdVenta().getIdSegmento()).getNombre() : "";
                }
                if (l_a.getIdVenta().getIdTipoventa() != null) {
                    Tipoventa = tipoVentaDao.getById(l_a.getIdVenta().getIdTipoventa()) != null ? tipoVentaDao.getById(l_a.getIdVenta().getIdTipoventa()).getNombre() : "";
                }

            } catch (Exception e) {
                System.out.println("ERROR l_a.getTipo()" + l_a.getTipo());
            }
            try {
                venta = new ExportarVentas(
                        l_a.getIdVenta().getIdVentas(), l_a.getIdVenta().getIdUsuario().getUsername(),
                        l_a.getIdVenta().getFechaVenta(),
                        l_a.getIdVenta().getFechaControl(),
                        tipoTvDao.getById(l_a.getIdVenta().getIdTipotv() != null ? l_a.getIdVenta().getIdTipotv() : 0) != null ? tipoTvDao.getById(l_a.getIdVenta().getIdTipotv()).getNombre() : "",
                        promosion, Segmento, Tipoventa,
                        l_a.getIdVenta().getNumeroAgente(), l_a.getIdVenta().getVcerrada(), l_a.getIdVenta().getVincorrecta(),
                        l_a.getIdVenta().getVscoring(), l_a.getIdVenta().getVsystema(), l_a.getIdVenta().getVvalidada(),l_a.getIdVenta().getVbaja(),
                        l_a.getIdVenta().getNombreA(), l_a.getIdVenta().getApellido1A(), l_a.getIdVenta().getApellido2A(),
                        l_a.getIdVenta().getDniA(), l_a.getIdVenta().getPermanencia(),
                        l_a.getIdVenta().getPrecioM(), l_a.getIdVenta().getPrecioS(), l_a.getIdVenta().getPrecioA(), l_a.getIdVenta().getIdTomador().getNombre(), l_a.getIdVenta().getIdTomador().getPrimerApellido(), l_a.getIdVenta().getIdTomador().getSegundoApellido(),
                        l_a.getIdVenta().getIdTomador().getDni(), l_a.getIdVenta().getIdTomador().getEmail(), l_a.getIdVenta().getIdTomador().getTelefono1(), l_a.getIdVenta().getIdTomador().getTelefono2(),
                        l_a.getIdVenta().getIdTomador().getIban(),l_a.getIdVenta().getIdTomador().getCredit(),l_a.getIdVenta().getIdTomador().getDniReverso(), l_a.getIdVenta().getIdTomador().getPedido(),
                        l_a.getIdVenta().getIdTomador().getDireccion(), l_a.getIdVenta().getIdTomador().getDireccionNumero(),
                        l_a.getIdVenta().getIdTomador().getDireccionPlanta(), l_a.getIdVenta().getIdTomador().getDireccionPortal(),
                        l_a.getIdVenta().getIdTomador().getDireccionBloque(), l_a.getIdVenta().getIdTomador().getDireccionEscalera(),
                        l_a.getIdVenta().getIdTomador().getDireccionPuerta(), l_a.getIdVenta().getIdTomador().getDireccionCP(),
                        provincia, municipio, //completar los daos de provincia
                        l_a.getIdVenta().getIdTomador().getProfesion(), l_a.getIdVenta().getIdTomador().getNombreEmpresa(),
                        l_a.getIdVenta().getIdTomador().getIngresoNeto(), tipo,
                        l_a.getNumero(), l_a.getTitular(), l_a.getDni(), l_a.getDonante(), l_a.getTerminal(), TipoLinea
                );

                if (new Date(fechai).before(new Date(venta.getFechaVenta())) && new Date(fechaf).after(new Date(venta.getFechaVenta()))) {
                    lista.add(venta);
                }

            } catch (Exception e) {
                System.out.println("ERROR EXPORTANDO LA VENTA CON ID " + l_a.getIdVenta().getIdVentas() + "   ERROR: " + e);
            }

        }

        return lista;
    }

    public List<ExportarVentas> getListaVentasSearch(Ventas obj, String fechai, String fechaf, int idcoordinador) {

        List<Ventas> ventasresult = ventasDao.getBySearch(obj, fechai, fechaf, idcoordinador);
        List<Lineasasociadas> lineasAsociadas = new ArrayList<>();
        List<ExportarVentas> listaexport = new ArrayList<>();
        ExportarVentas ventaexport;

        for (Ventas ventaresult : ventasresult) {

            String TipoLinea = "";
            String tipo = "";
            String promosion = "";
            String Segmento = "";
            String Tipoventa = "";
            String tipoTv ="";
            int permanencia =0;
            String usuario ="";
            

            Municipios m = municipioDao.getById(ventaresult.getIdTomador().getDireccionPoblacion());
            String municipio = m != null ? m.getMunicipio() : "";
            Provincias p = provinciaDao.getById(Integer.parseInt(ventaresult.getIdTomador().getDireccionProvincia()));
            String provincia = p != null ? p.getProvincia() : "";

            lineasAsociadas = ventaresult.getLineasasociadasList();

            for (Lineasasociadas l_a : lineasAsociadas) {

                try {
                    System.out.println("com.psc.Service.ExportarVentaService.getListaVentas()" + l_a.getTipoLinea());
                    String t = "M";
                    if (l_a.getTipoLinea().toString().equals(t)) {
                        TipoLinea = "Linea Movil";
                        System.out.println("com.psc.Service.ExportarVentaService.getListaVentas()" + TipoLinea);
                        Tipolineamovil tlm = tipoLineaMovilDao.getById(Integer.parseInt(l_a.getTipo()));
                        tipo = tlm != null ? tlm.getNombre() : "";
                    } else {
                        System.out.println("l_a.getTipo()" + l_a.getTipo());
                        Tipolineafija tlf = tipoLineaFijaDao.getById(Integer.parseInt(l_a.getTipo()));
                        tipo = tlf != null ? tlf.getNombre() : "";
                        TipoLinea = "Linea Fija";
                        System.out.println("com.psc.Service.ExportarVentaService.getListaVentas()" + TipoLinea);
                    }
                    if (l_a.getIdVenta().getIdPromosion() != null) {
                        promosion = tipoTvFutboolDao.getById(l_a.getIdVenta().getIdPromosion()) != null ? tipoTvFutboolDao.getById(l_a.getIdVenta().getIdPromosion()).getNombre() : "";
                    }
                    if (l_a.getIdVenta().getIdSegmento() != null) {
                        Segmento = segmentoVentaDao.getById(l_a.getIdVenta().getIdSegmento()) != null ? segmentoVentaDao.getById(l_a.getIdVenta().getIdSegmento()).getNombre() : "";
                    }
                    if (l_a.getIdVenta().getIdTipoventa() != null) {
                        Tipoventa = tipoVentaDao.getById(l_a.getIdVenta().getIdTipoventa()) != null ? tipoVentaDao.getById(l_a.getIdVenta().getIdTipoventa()).getNombre() : "";
                    }

                } catch (Exception e) {
                    System.out.println("ERROR l_a.getTipo()" + l_a.getTipo());
                }
                
                try {
                    tipoTv = tipoTvDao.getById(ventaresult.getIdTipotv() != null ? ventaresult.getIdTipotv() : 0) != null ? tipoTvDao.getById(ventaresult.getIdTipotv()).getNombre() : "" ;
                } catch (Exception e) {
                    tipoTv = "ERROR";
                }
                 try {
                    permanencia = ventaresult.getPermanencia() != null ? ventaresult.getPermanencia() : 0 ;
                } catch (Exception e) {
                    permanencia = 0;
                }   
                 try {
                    usuario =  ventaresult.getIdUsuario().getUsername() ;
                } catch (Exception e) {
                    usuario = "ERROR ELIMINADO";
                }  

                ventaexport = new ExportarVentas(
                        ventaresult.getIdVentas(),
                        ventaresult.getIdUsuario().getUsername(),
                        ventaresult.getFechaVenta(),
                        ventaresult.getFechaControl(),
                        tipoTv,
                        promosion, Segmento, Tipoventa,
                        ventaresult.getNumeroAgente(),
                        ventaresult.getVcerrada(),
                        ventaresult.getVincorrecta(),
                        ventaresult.getVscoring(),
                        ventaresult.getVsystema(),
                        ventaresult.getVvalidada(),
                        ventaresult.getVbaja(),
                        ventaresult.getNombreA(),
                        ventaresult.getApellido1A(),
                        ventaresult.getApellido2A(),
                        ventaresult.getDniA(),
                        permanencia,
                        ventaresult.getPrecioM(),
                        ventaresult.getPrecioS(),
                        ventaresult.getPrecioA(),
                        ventaresult.getIdTomador().
                        getNombre(), 
                        ventaresult.getIdTomador().getPrimerApellido(),
                        ventaresult.getIdTomador().getSegundoApellido(),
                        ventaresult.getIdTomador().getDni(),
                        ventaresult.getIdTomador().getEmail(),
                        ventaresult.getIdTomador().getTelefono1(),
                        ventaresult.getIdTomador().getTelefono2(),
                        ventaresult.getIdTomador().getIban(),
                        ventaresult.getIdTomador().getCredit(),
                        ventaresult.getIdTomador().getDniReverso(),
                        ventaresult.getIdTomador().getPedido(),
                        ventaresult.getIdTomador().getDireccion(),
                        ventaresult.getIdTomador().getDireccionNumero(),
                        ventaresult.getIdTomador().getDireccionPlanta(),
                        ventaresult.getIdTomador().getDireccionPortal(),
                        ventaresult.getIdTomador().getDireccionBloque(),
                        ventaresult.getIdTomador().getDireccionEscalera(),
                        ventaresult.getIdTomador().getDireccionPuerta(),
                        ventaresult.getIdTomador().getDireccionCP(),
                        provincia,
                        municipio, //completar los daos de provincia
                        ventaresult.getIdTomador().getProfesion(),
                        ventaresult.getIdTomador().getNombreEmpresa(),
                        ventaresult.getIdTomador().getIngresoNeto(),
                        tipo,
                        l_a.getNumero(),
                        l_a.getTitular(),
                        l_a.getDni(),
                        l_a.getDonante(),
                        l_a.getTerminal(),
                        TipoLinea
                );

                listaexport.add(ventaexport);

            }

        }
        //-----------------------------------------

        return listaexport;
    }
}
