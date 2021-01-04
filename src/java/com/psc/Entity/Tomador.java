/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "tomador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tomador.findAll", query = "SELECT t FROM Tomador t"),
    @NamedQuery(name = "Tomador.findById", query = "SELECT t FROM Tomador t WHERE t.id = :id"),
    @NamedQuery(name = "Tomador.findByDireccionPoblacion", query = "SELECT t FROM Tomador t WHERE t.direccionPoblacion = :direccionPoblacion")})
public class Tomador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Direccion")
    private String direccion;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionBloque")
    private String direccionBloque;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionCP")
    private String direccionCP;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionEscalera")
    private String direccionEscalera;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionNumero")
    private String direccionNumero;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionPlanta")
    private String direccionPlanta;
    @Column(name = "DireccionPoblacion")
    private Integer direccionPoblacion;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionPortal")
    private String direccionPortal;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionProvincia")
    private String direccionProvincia;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DireccionPuerta")
    private String direccionPuerta;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Dni")
    private String dni;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DniReverso")
    private String dniReverso;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Email")
    private String email;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Iban")
    private String iban;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Credit")
    private String credit;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Nombre")
    private String nombre;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Pedido")
    private String pedido;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PrimerApellido")
    private String primerApellido;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SegundoApellido")
    private String segundoApellido;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Telefono1")
    private String telefono1;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Telefono2")
    private String telefono2;
    @Lob
    @Size(max = 65535)
    @Column(name = "Profesion")
    private String profesion;
    @Lob
    @Size(max = 65535)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    @Lob
    @Size(max = 65535)
    @Column(name = "IngresoNeto")
    private String ingresoNeto;
    @OneToOne(mappedBy = "idTomador")
    private Ventas ventas;

    public Tomador() {
    }

    public Tomador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionBloque() {
        return direccionBloque;
    }

    public void setDireccionBloque(String direccionBloque) {
        this.direccionBloque = direccionBloque;
    }

    public String getDireccionCP() {
        return direccionCP;
    }

    public void setDireccionCP(String direccionCP) {
        this.direccionCP = direccionCP;
    }

    public String getDireccionEscalera() {
        return direccionEscalera;
    }

    public void setDireccionEscalera(String direccionEscalera) {
        this.direccionEscalera = direccionEscalera;
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

    public Integer getDireccionPoblacion() {
        return direccionPoblacion;
    }

    public void setDireccionPoblacion(Integer direccionPoblacion) {
        this.direccionPoblacion = direccionPoblacion;
    }

    public String getDireccionPortal() {
        return direccionPortal;
    }

    public void setDireccionPortal(String direccionPortal) {
        this.direccionPortal = direccionPortal;
    }

    public String getDireccionProvincia() {
        return direccionProvincia;
    }

    public void setDireccionProvincia(String direccionProvincia) {
        this.direccionProvincia = direccionProvincia;
    }

    public String getDireccionPuerta() {
        return direccionPuerta;
    }

    public void setDireccionPuerta(String direccionPuerta) {
        this.direccionPuerta = direccionPuerta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDniReverso() {
        return dniReverso;
    }

    public void setDniReverso(String dniReverso) {
        this.dniReverso = dniReverso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
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

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tomador)) {
            return false;
        }
        Tomador other = (Tomador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Tomador[ id=" + id + " ]";
    }
    
}
