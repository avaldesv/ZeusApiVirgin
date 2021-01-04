/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Rol;
import com.psc.Entity.Tomador;
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
public class TomadorDaoImp implements TomadorDao{
    
    	@Autowired
     	private SessionFactory sessionFactory;
        

    @Override
    public List<Tomador> findAll() {
       Session currentSession = sessionFactory.getCurrentSession();
		//      Query<Tomador> query=currentSession.createQuery("from Tomador", Rol.class);
		List<Tomador> list= currentSession.createQuery("from Tomador").list();
//                for (Rol rol : list) {
//             System.out.println("Nombree---------------------"+rol.getDescripcion());
//            System.out.println("Nombree---------------------"+rol.getRol());
//        }
		return list;
}

    @Override
    public Tomador findOne(int id) {
            Session currentSession = sessionFactory.getCurrentSession();
          Tomador aseg = (Tomador) currentSession.get(Tomador.class, id);
        return aseg;  
    }

    @Override
    public Tomador save(Tomador obj) {
       Session currentSession = sessionFactory.getCurrentSession();
       return  (Tomador) currentSession.save(obj);
    }

    @Override
    public void edit(Tomador rol) {
         Session currentSession = sessionFactory.getCurrentSession();
    currentSession.update(rol);
    }

    @Override
    public void delete(Tomador rol) {
        Session currentSession = sessionFactory.getCurrentSession();
    currentSession.delete(rol); 
    }
    
}

