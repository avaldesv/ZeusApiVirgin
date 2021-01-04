/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Campanyas;
import com.psc.Entity.Rol;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AVV
 */
@Repository
public class CampanyaDaoImp implements CampanyaDao{
    
    	@Autowired
     	private SessionFactory sessionFactory;
        

    @Override
    public List<Campanyas> findAll() {
       Session currentSession = sessionFactory.getCurrentSession();
	List<Campanyas> list= currentSession.createQuery("from Campanyas").list();
        return list;
}

    @Override
    public Campanyas findOne(int id) {
       Session currentSession = sessionFactory.getCurrentSession();
       Campanyas aseg = (Campanyas) currentSession.get(Campanyas.class, id);
        return aseg; 
    }

    @Override
    public Campanyas save(Campanyas rol) {
        Session currentSession = sessionFactory.getCurrentSession();
       return  (Campanyas) currentSession.save(rol);
    }

    @Override
    public void edit(Campanyas rol) {
          Session currentSession = sessionFactory.getCurrentSession();
    currentSession.update(rol);
    }

    @Override
    public void delete(Campanyas rol) {
        Session currentSession = sessionFactory.getCurrentSession();
    currentSession.delete(rol);  
    }
    
}