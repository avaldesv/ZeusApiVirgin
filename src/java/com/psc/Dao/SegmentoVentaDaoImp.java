/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Segmentoventa;
import com.psc.Entity.Ventas;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AVV
 */
@Repository
public class SegmentoVentaDaoImp implements SegmentoVentaDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Segmentoventa> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();

Segmentoventa v = new Segmentoventa();
        v.setEliminada(0);
        return currentSession.createCriteria(Segmentoventa.class).add(Example.create(v)).list();
            
		//return currentSession.createQuery("from Segmentoventa s where WHERE s.eliminada != :par").setParameter("par",1).list();
                
                
    }
   
      public List<Segmentoventa> findAllactivos() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
            
		return currentSession.createQuery("from Segmentoventa s WHERE s.eliminada != :par and s.estado = :par ").setParameter("par",1).list();
    }

   
      @Override
   public Segmentoventa getById(int id) {
        
      Session currentSession = sessionFactory.getCurrentSession();
                    Segmentoventa obj = (Segmentoventa) currentSession.get(Segmentoventa.class, id);
 		return obj;
    }
   
   
    @Override
    public Segmentoventa save(Segmentoventa obj) {
        boolean status=false;
       Session currentSession = sessionFactory.getCurrentSession();
        try {
           currentSession.save(obj);
           return obj;
            //status=true;
        } catch (Exception e) {
            System.err.println("ERROR ADICIONANDO Segmentoventa  "+e);
         return null;
        }

    }

    @Override
    public boolean edit(Segmentoventa obj) {
           boolean status=false;
       Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.update(obj);
            status=true;
        } catch (Exception e) {
            System.err.println("ERROR EDITANDO Segmentoventa  "+e);
        
        }
   return status;
    }

    @Override
    public void delete(Segmentoventa obj) {
         Session currentSession = sessionFactory.getCurrentSession();
        Ventas v = new Ventas();
        v.setIdSegmento(obj.getId());
        if(!currentSession.createCriteria(Ventas.class).add(Example.create(v)).list().isEmpty()){
            obj.setEliminada(1);
         currentSession.update(obj);
    }
        else{
        currentSession.delete(obj); 
        }
          
        
    
    }
    

    
    
}
