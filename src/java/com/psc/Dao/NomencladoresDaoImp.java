/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Nomencladores;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AVV
 */
@Repository
public class NomencladoresDaoImp implements NomencladoresDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Nomencladores> findAll1() {
        
      Session currentSession = sessionFactory.getCurrentSession();
		   
		List<Nomencladores> list= currentSession.createQuery("from Nomencladores").list();

		return list;
    }

    @Override
    public Nomencladores findOne(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
          Nomencladores aseg = (Nomencladores) currentSession.get(Nomencladores.class, id);
        return aseg;  }

    @Override
    public Nomencladores save(Nomencladores nom) {
        Session currentSession = sessionFactory.getCurrentSession();
       return  (Nomencladores) currentSession.save(nom);}

    @Override
    public void edit(Nomencladores nom) {
          Session currentSession = sessionFactory.getCurrentSession();
    currentSession.update(nom);
    }

    @Override
    public void delete(Nomencladores nom) {
         Session currentSession = sessionFactory.getCurrentSession();
    currentSession.delete(nom);  
    }
    
    
    
}

 