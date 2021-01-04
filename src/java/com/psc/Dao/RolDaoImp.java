/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Rol;
import com.psc.Entity.Usuarios;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
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
public class RolDaoImp implements RolDao{

    	@Autowired
     	private SessionFactory sessionFactory;
        
   
	

    @Override
   public List<Rol> findAll1() {
        
      Session currentSession = sessionFactory.getCurrentSession();
		//      Query<Rol> query=currentSession.createQuery("from Rol").;//"from Rol", Rol.class);
		List<Rol> list= currentSession.createQuery("from Rol").list();
//                for (Rol rol : list) {
//             System.out.println("Nombree---------------------"+rol.getDescripcion());
//            System.out.println("Nombree---------------------"+rol.getRol());
//        }
		return list;
    }

    @Override
    public Rol findOne(int id) {
          Session currentSession = sessionFactory.getCurrentSession();
          Rol aseg = (Rol) currentSession.get(Rol.class, id);
        return aseg;  
    }

    @Override
    public Rol save(Rol obj) {
       Session currentSession = sessionFactory.getCurrentSession();
       return  (Rol) currentSession.save(obj);
    }

    @Override
    public void edit(Rol rol) {
          Session currentSession = sessionFactory.getCurrentSession();
    currentSession.update(rol);
    }

    @Override
    public void delete(Rol rol) {
           Session currentSession = sessionFactory.getCurrentSession();
    currentSession.delete(rol); 
    }
    
    
    
}

