/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Tipoventa;
import com.psc.Entity.Ventas;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AVV
 */
@Repository
public class TipoVentaDaoImp implements TipoVentaDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Tipoventa> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
Tipoventa v = new Tipoventa();
        v.setEliminada(0);
        return currentSession.createCriteria(Tipoventa.class).add(Example.create(v)).list();

	//	return currentSession.createQuery("from Tipoventa").list();
    }

   
      @Override
   public Tipoventa getById(int id) {
        
      Session currentSession = sessionFactory.getCurrentSession();
                    Tipoventa obj = (Tipoventa) currentSession.get(Tipoventa.class, id);
 		return obj;
    }
   
             @Override
    public List<Tipoventa> findAllactivos() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
            
		return currentSession.createQuery("from Tipoventa s WHERE s.eliminada != :par and s.estado = :par ").setParameter("par",1).list();
    }

   
   
    @Override
    public Tipoventa save(Tipoventa obj) {
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
    public boolean edit(Tipoventa obj) {
           boolean status=false;
       Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.update(obj);
            status=true;
        } catch (Exception e) {
            System.err.println("ERROR EDITANDO Tipoventa  "+e);
        
        }
   return status;
    }

    @Override
    public void delete(Tipoventa obj) {
        Session currentSession = sessionFactory.getCurrentSession();
          Ventas v = new Ventas();
        v.setIdTipoventa(obj.getId());
        if(!currentSession.createCriteria(Ventas.class).add(Example.create(v)).list().isEmpty()){
            obj.setEliminada(1);
         currentSession.update(obj);
    }
        else{
        currentSession.delete(obj); 
        }
    }
    

    
    
}
