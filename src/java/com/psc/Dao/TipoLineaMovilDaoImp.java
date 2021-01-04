/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Lineasasociadas;
import com.psc.Entity.Tipolineamovil;
import com.psc.Entity.Usuarios;
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
public class TipoLineaMovilDaoImp implements TipoLineaMovilDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Tipolineamovil> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
Tipolineamovil v = new Tipolineamovil();
        v.setEliminada(0);
        return currentSession.createCriteria(Tipolineamovil.class).add(Example.create(v)).list();
            


	//	return currentSession.createQuery("from Tipolineamovil").list();
    }
   
       @Override
    public List<Tipolineamovil> findAllactivos() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
            
		return currentSession.createQuery("from Tipolineamovil s WHERE s.eliminada != :par and s.estado = :par ").setParameter("par",1).list();
    }

   
      @Override
   public Tipolineamovil getById(int id) {
        
      Session currentSession = sessionFactory.getCurrentSession();
                    Tipolineamovil obj = (Tipolineamovil) currentSession.get(Tipolineamovil.class, id);
 		return obj;
    }
   
   
    @Override
    public Tipolineamovil save(Tipolineamovil obj) {
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
    public boolean edit(Tipolineamovil obj) {
           boolean status=false;
       Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.update(obj);
            status=true;
        } catch (Exception e) {
            System.err.println("ERROR EDITANDO Tipolineamovil  "+e);
        
        }
   return status;
    }

    @Override
    public void delete(Tipolineamovil obj) {
        Session currentSession = sessionFactory.getCurrentSession();
                Lineasasociadas v = new Lineasasociadas();
        v.setTipo(obj.getId().toString());
        v.setTipoLinea("M");
        if(!currentSession.createCriteria(Lineasasociadas.class).add(Example.create(v)).list().isEmpty()){
            obj.setEliminada(1);
         currentSession.update(obj);
    }
        else{
        currentSession.delete(obj); 
        }
    }
    

    
    
}
