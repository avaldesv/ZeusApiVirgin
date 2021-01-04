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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AVV
 */
@Entity
@Table(name = "logs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logs.findAll", query = "SELECT l FROM Logs l"),
    @NamedQuery(name = "Logs.findByIdlogs", query = "SELECT l FROM Logs l WHERE l.idlogs = :idlogs")})
public class Logs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlogs")
    private Integer idlogs;

    public Logs() {
    }

    public Logs(Integer idlogs) {
        this.idlogs = idlogs;
    }

    public Integer getIdlogs() {
        return idlogs;
    }

    public void setIdlogs(Integer idlogs) {
        this.idlogs = idlogs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlogs != null ? idlogs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logs)) {
            return false;
        }
        Logs other = (Logs) object;
        if ((this.idlogs == null && other.idlogs != null) || (this.idlogs != null && !this.idlogs.equals(other.idlogs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.psc.Entity.Logs[ idlogs=" + idlogs + " ]";
    }
    
}
