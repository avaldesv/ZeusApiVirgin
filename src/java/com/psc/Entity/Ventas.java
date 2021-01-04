/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v"),
    @NamedQuery(name = "Ventas.findByIdVentas", query = "SELECT v FROM Ventas v WHERE v.idVentas = :idVentas"),
    @NamedQuery(name = "Ventas.findByIdTipotv", query = "SELECT v FROM Ventas v WHERE v.idTipotv = :idTipotv"),
    @NamedQuery(name = "Ventas.findByIdPromosion", query = "SELECT v FROM Ventas v WHERE v.idPromosion = :idPromosion"),
    @NamedQuery(name = "Ventas.findByIdSegmento", query = "SELECT v FROM Ventas v WHERE v.idSegmento = :idSegmento"),
    @NamedQuery(name = "Ventas.findByIdTipoventa", query = "SELECT v FROM Ventas v WHERE v.idTipoventa = :idTipoventa"),
    @NamedQuery(name = "Ventas.findByVcerrada", query = "SELECT v FROM Ventas v WHERE v.vcerrada = :vcerrada"),
    @NamedQuery(name = "Ventas.findByVincorrecta", query = "SELECT v FROM Ventas v WHERE v.vincorrecta = :vincorrecta"),
    @NamedQuery(name = "Ventas.findByVscoring", query = "SELECT v FROM Ventas v WHERE v.vscoring = :vscoring"),
    @NamedQuery(name = "Ventas.findByVsystema", query = "SELECT v FROM Ventas v WHERE v.vsystema = :vsystema"),
    @NamedQuery(name = "Ventas.findByVvalidada", query = "SELECT v FROM Ventas v WHERE v.vvalidada = :vvalidada"),
    @NamedQuery(name = "Ventas.findByPermanencia", query = "SELECT v FROM Ventas v WHERE v.permanencia = :permanencia")})
public class Ventas implements Serializable {

    @Column(name = "Permanencia")
    private Integer permanencia;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVentas")
    private Integer idVentas;
    @Column(name = "id_tipotv")
    private Integer idTipotv;
    @Column(name = "id_Promosion")
    private Integer idPromosion;
    @Lob
    @Size(max = 65535)
    @Column(name = "FechaControl")
    private String fechaControl;
    @Lob
    @Size(max = 65535)
    @Column(name = "FechaVenta")
    private String fechaVenta;
    @Column(name = "id_segmento")
    private Integer idSegmento;
    @Column(name = "id_tipoventa")
    private Integer idTipoventa;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "NumeroAgente")
    private String numeroAgente;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "Vcerrada")
    private Integer vcerrada;
    @Column(name = "Vincorrecta")
    private Integer vincorrecta;
    @Column(name = "Vscoring")
    private Integer vscoring;
    @Column(name = "Vsystema")
    private Integer vsystema;
    @Column(name = "Vvalidada")
    private Integer vvalidada;
     @Column(name = "vbaja")
    private Integer vbaja;
    @Lob
    @Size(max = 65535)
    @Column(name = "nombreA")
    private String nombreA;
    @Lob
    @Size(max = 65535)
    @Column(name = "apellido1A")
    private String apellido1A;
    @Lob
    @Size(max = 65535)
    @Column(name = "apellido2A")
    private String apellido2A;
    @Lob
    @Size(max = 65535)
    @Column(name = "dniA")
    private String dniA;
    @Lob
    @Size(max = 65535)
    @Column(name = "PrecioM")
    private String precioM;
    @Lob
    @Size(max = 65535)
    @Column(name = "PrecioS")
    private String precioS;
    @Lob
    @Size(max = 65535)
    @Column(name = "PrecioA")
    private String precioA;
    @OneToMany( mappedBy = "idVenta")
    private List<Lineasasociadas> lineasasociadasList;
    @JoinColumn(name = "id_tomador", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Tomador idTomador;
    @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario")
    @ManyToOne
    private Usuarios idUsuario;
    @OneToMany( mappedBy = "ventasidVentas")
    private List<Asegurados> aseguradosList;

    public Ventas() {
    }

    public Ventas(Integer idVentas) {
        this.idVentas = idVentas;
    }


    public Integer getIdVentas() {
        return idVentas;
    }

    public Integer getVbaja() {
        return vbaja;
    }

    public void setVbaja(Integer vbaja) {
        this.vbaja = vbaja;
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

    @XmlTransient
    public List<Lineasasociadas> getLineasasociadasList() {
        return lineasasociadasList;
    }

    public void setLineasasociadasList(List<Lineasasociadas> lineasasociadasList) {
        this.lineasasociadasList = lineasasociadasList;
    }

    public Tomador getIdTomador() {
        return idTomador;
    }

    public void setIdTomador(Tomador idTomador) {
        this.idTomador = idTomador;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<Asegurados> getAseguradosList() {
        return aseguradosList;
    }

    public void setAseguradosList(List<Asegurados> aseguradosList) {
        this.aseguradosList = aseguradosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentas != null ? idVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.idVentas == null && other.idVentas != null) || (this.idVentas != null && !this.idVentas.equals(other.idVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Ventas[ idVentas=" + idVentas + " ]";
    }

    public Integer getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(Integer permanencia) {
        this.permanencia = permanencia;
    }
    
}
