/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Municipios;
import com.psc.Entity.Nomencladores;
import com.psc.Entity.Provincias;
import com.psc.Entity.Usuarios;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AVV
 */
@Repository
public class ProvinciaDaoImp implements ProvinciaDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Provincias> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
		   
		List<Provincias> list= currentSession.createQuery("from Provincias").list();

		return list;
    }

       @Override
    public Provincias getById(int id) {
       Session currentSession = sessionFactory.getCurrentSession();
          Provincias aseg = (Provincias) currentSession.get(Provincias.class, id);
        return aseg;  
    }


   
    
    
    
}

 