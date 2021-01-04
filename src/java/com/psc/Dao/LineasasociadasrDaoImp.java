/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Rol;
import com.psc.Entity.Lineasasociadas;
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
public class LineasasociadasrDaoImp implements LineasasociadasDao{
    
    	@Autowired
     	private SessionFactory sessionFactory;
        

    @Override
    public List<Lineasasociadas> findAll() {
       Session currentSession = sessionFactory.getCurrentSession();
	  List<Lineasasociadas> list= currentSession.createQuery("from Lineasasociadas").list();
              for (Lineasasociadas rol : list) {
           System.out.println("Nombree---------------------"+rol.getDni());
         //  System.out.println("Nombree---------------------"+rol.getIdVenta());
       }
		return list;
}

    @Override
    public Lineasasociadas findOne(int id) {
          Session currentSession = sessionFactory.getCurrentSession();
          Lineasasociadas aseg = (Lineasasociadas) currentSession.get(Lineasasociadas.class, id);
        return aseg; 
    }

    @Override
    public Lineasasociadas save(Lineasasociadas rol) {
        Session currentSession = sessionFactory.getCurrentSession();
       return  (Lineasasociadas) currentSession.save(rol);
    }

    @Override
    public void edit(Lineasasociadas rol) {
         Session currentSession = sessionFactory.getCurrentSession();
    currentSession.update(rol);
    }

    @Override
    public void delete(Lineasasociadas rol) {
              Session currentSession = sessionFactory.getCurrentSession();
    currentSession.delete(rol);  
    }
    
}
 