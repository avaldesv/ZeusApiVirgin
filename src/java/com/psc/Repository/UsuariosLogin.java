/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Repository;
import com.psc.Entity.Usuarios;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author AVV
 */
@Repository
public interface UsuariosLogin  extends JpaRepository<Usuarios, Serializable> {
	
	public abstract Usuarios findByUsuario(String usuario);

}
