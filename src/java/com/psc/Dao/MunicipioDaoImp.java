/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Municipios;
import com.psc.Entity.Nomencladores;
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
public class MunicipioDaoImp implements MunicipioDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Municipios> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
		   
		List<Municipios> list= currentSession.createQuery("from Municipios").list();

		return list;
    }

    @Override
    public List<Municipios> findOne(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        List<Municipios> list= currentSession.createQuery("FROM Municipios m WHERE m.provinciaId = :provinciaId").setParameter("provinciaId", id).list();
        
        return list;  }

    @Override
    public Municipios getById(int id) {
       Session currentSession = sessionFactory.getCurrentSession();
          Municipios aseg = (Municipios) currentSession.get(Municipios.class, id);
        return aseg;  
    }


   
    
    
    
}

 