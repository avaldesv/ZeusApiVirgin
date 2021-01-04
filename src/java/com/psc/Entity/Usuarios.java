/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author AVV
 */
@Entity
@DynamicUpdate
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuarios.findByApellidos", query = "SELECT u FROM Usuarios u WHERE u.apellidos = :apellidos"),
    @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuarios.findByEnabled", query = "SELECT u FROM Usuarios u WHERE u.enabled = :enabled"),
    @NamedQuery(name = "Usuarios.findByIdCoordinador", query = "SELECT u FROM Usuarios u WHERE u.idCoordinador = :idCoordinador"),
    @NamedQuery(name = "Usuarios.findByMovil", query = "SELECT u FROM Usuarios u WHERE u.movil = :movil"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password"),
    @NamedQuery(name = "Usuarios.findByUsername", query = "SELECT u FROM Usuarios u WHERE u.username = :username"),
    @NamedQuery(name = "Usuarios.findByCampanaidCampana", query = "SELECT u FROM Usuarios u WHERE u.campanaidCampana = :campanaidCampana"),
    @NamedQuery(name = "Usuarios.findByEliminada", query = "SELECT u FROM Usuarios u WHERE u.eliminada = :eliminada")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Size(max = 255)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 255)
    @Column(name = "correo")
    private String correo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "idCoordinador")
    private Integer idCoordinador;
      @Column(name = "idSupervisor")
    private Integer idSupervisor;
    @Size(max = 255)
    @Column(name = "movil")
    private String movil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
   @NotNull
   @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Campana_idCampana")
    private int campanaidCampana;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eliminada")
    private int eliminada;
    @JoinColumn(name = "id_campanya", referencedColumnName = "idCampana")
    @ManyToOne(optional = false)
    private Campanyas idCampanya;
    @JoinColumn(name = "rol_idRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false)
    private Rol rolidRol;
    @OneToMany(mappedBy = "idUsuario")
    private List<Ventas> ventasList;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdSupervisor() {
        return idSupervisor;
    }

    public Usuarios(Integer idUsuario, String apellidos, String correo, String direccion, Boolean enabled, Integer idCoordinador, Integer idSupervisor, String movil, String nombre, String password, String username, int campanaidCampana, int eliminada, Campanyas idCampanya, Rol rolidRol, List<Ventas> ventasList) {
        this.idUsuario = idUsuario;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.enabled = enabled;
        this.idCoordinador = idCoordinador;
        this.idSupervisor = idSupervisor;
        this.movil = movil;
        this.nombre = nombre;
        this.password = password;
        this.username = username;
        this.campanaidCampana = campanaidCampana;
        this.eliminada = eliminada;
        this.idCampanya = idCampanya;
        this.rolidRol = rolidRol;
        this.ventasList = ventasList;
    }

    public void setIdSupervisor(Integer idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public Usuarios(Integer idUsuario, String nombre, String password, String username, int campanaidCampana, int eliminada) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.password = password;
        this.username = username;
        this.campanaidCampana = campanaidCampana;
        this.eliminada = eliminada;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(Integer idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCampanaidCampana() {
        return campanaidCampana;
    }

    public void setCampanaidCampana(int campanaidCampana) {
        this.campanaidCampana = campanaidCampana;
    }

    public int getEliminada() {
        return eliminada;
    }

    public void setEliminada(int eliminada) {
        this.eliminada = eliminada;
    }

    public Campanyas getIdCampanya() {
        return idCampanya;
    }

    public void setIdCampanya(Campanyas idCampanya) {
        this.idCampanya = idCampanya;
    }

    public Rol getRolidRol() {
        return rolidRol;
    }

    public void setRolidRol(Rol rolidRol) {
        this.rolidRol = rolidRol;
    }

    @XmlTransient
    public List<Ventas> getVentasList() {
        return ventasList;
    }

    public void setVentasList(List<Ventas> ventasList) {
        this.ventasList = ventasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
