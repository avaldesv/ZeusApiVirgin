/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Lineasasociadas;
import com.psc.Entity.Segmentoventa;
import com.psc.Entity.Tipolineafija;
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
public class TipoLineaFijaDaoImp implements TipoLineaFijaDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Tipolineafija> findAll() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
Tipolineafija v = new Tipolineafija();
        v.setEliminada(0);
        return currentSession.createCriteria(Tipolineafija.class).add(Example.create(v)).list();
            




		//return currentSession.createQuery("from Tipolineafija").list();
    }
     @Override
    public List<Tipolineafija> findAllactivos() {
        
      Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
            
		return currentSession.createQuery("from Tipolineafija s WHERE s.eliminada != :par and s.estado = :par ").setParameter("par",1).list();
    }

   
      @Override
   public Tipolineafija getById(int id) {
        
      Session currentSession = sessionFactory.getCurrentSession();
                    Tipolineafija obj = (Tipolineafija) currentSession.get(Tipolineafija.class, id);
 		return obj;
    }
   
   
    @Override
    public Tipolineafija save(Tipolineafija obj) {
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
    public boolean edit(Tipolineafija obj) {
           boolean status=false;
       Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.update(obj);
            status=true;
        } catch (Exception e) {
            System.err.println("ERROR EDITANDO Tipolineafija  "+e);
        
        }
   return status;
    }

    @Override
    public void delete(Tipolineafija obj) {
        Session currentSession = sessionFactory.getCurrentSession();
               Lineasasociadas v = new Lineasasociadas();
        v.setTipo(obj.getId().toString());
         v.setTipoLinea("F");
        if(!currentSession.createCriteria(Lineasasociadas.class).add(Example.create(v)).list().isEmpty()){
            obj.setEliminada(1);
         currentSession.update(obj);
    }
        else{
        currentSession.delete(obj); 
        }
        
    }
    

    
    
}
