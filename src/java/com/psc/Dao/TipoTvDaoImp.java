/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Tipotv;
import com.psc.Entity.Usuarios;
import com.psc.Entity.Ventas;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
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
public class TipoTvDaoImp implements TipoTvDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Tipotv> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();

Tipotv v = new Tipotv();
        v.setEliminada(0);
        return currentSession.createCriteria(Tipotv.class).add(Example.create(v)).list();
	//	return currentSession.createQuery("from Tipotv").list();
    }
   
       @Override
    public List<Tipotv> findAllactivos() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
            
		return currentSession.createQuery("from Tipotv s WHERE s.eliminada != :par and s.estado = :par ").setParameter("par",1).list();
    }

   
      @Override
   public Tipotv getById(int id) {
        
      Session currentSession = sessionFactory.getCurrentSession();
                    Tipotv obj = (Tipotv) currentSession.get(Tipotv.class, id);
 		return obj;
    }
   
   
    @Override
    public Tipotv save(Tipotv obj) {
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
    public boolean edit(Tipotv obj) {
           boolean status=false;
       Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.update(obj);
            status=true;
        } catch (Exception e) {
            System.err.println("ERROR EDITANDO Tipotv  "+e);
        
        }
   return status;
    }

    @Override
    public void delete(Tipotv obj) {
        Session currentSession = sessionFactory.getCurrentSession();
               Ventas v = new Ventas();
        v.setIdTipotv(obj.getId());
        if(!currentSession.createCriteria(Ventas.class).add(Example.create(v)).list().isEmpty()){
            obj.setEliminada(1);
         currentSession.update(obj);
    }
        else{
        currentSession.delete(obj); 
        }
    }
    

    
    
}
