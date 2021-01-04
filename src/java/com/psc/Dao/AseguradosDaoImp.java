/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;


import com.psc.Entity.Asegurados;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AVV
 */
@Repository
public class AseguradosDaoImp implements AseguradosDao{
    
    	@Autowired
     	private SessionFactory sessionFactory;
        

    @Override
    public List<Asegurados> findAll() {
       Session currentSession = sessionFactory.getCurrentSession();
		//      Query<Asegurados> query=currentSession.createQuery("from Asegurados", Rol.class);
		List<Asegurados> list= currentSession.createQuery("from Asegurados").list();
//                for (Rol rol : list) {
//             System.out.println("Nombree---------------------"+rol.getDescripcion());
//            System.out.println("Nombree---------------------"+rol.getRol());
//        }
		return list;
}

    @Override
    public Asegurados findOne(int id) {
          Session currentSession = sessionFactory.getCurrentSession();
       Asegurados aseg = (Asegurados) currentSession.get(Asegurados.class, id);
        return aseg; 
    }

    @Override
    public Asegurados save(Asegurados rol) {
        Session currentSession = sessionFactory.getCurrentSession();
       return  (Asegurados) currentSession.save(rol);
    }

    @Override
    public void edit(Asegurados rol) {
            Session currentSession = sessionFactory.getCurrentSession();
    currentSession.update(rol);
    }

    @Override
    public void delete(Asegurados rol) {
          Session currentSession = sessionFactory.getCurrentSession();
    currentSession.delete(rol);  
    }
    
}
