/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.psc.Entity.Usuarios;
import com.psc.Entity.Ventas;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.ScrollableResults;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
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
@Repository("UsuariosDao")
//@Qualifier
public class UsuariosDaotImp implements UsuariosDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Usuarios> findAll1() {

        Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();
//        Usuarios v = new Usuarios();
//        v.setEliminada(0);
//        return currentSession.createCriteria(Usuarios.class).add(Example.create(v)).list();

        return currentSession.createQuery("from Usuarios s WHERE s.eliminada != :par").setParameter("par", 1).list();
    }

    @Override
    public List<Usuarios> findAllactivos() {

        Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
//		List<Usuarios> list=query.getResultList();

        return currentSession.createQuery("from Usuarios s WHERE s.eliminada != :par and s.enabled = :par1 ").setParameter("par", 1).setParameter("par1", 1).list();
    }

    @Override
    public List<Usuarios> getUsersByRol(int rol) {

        Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
        List<Usuarios> list = currentSession.createQuery("FROM Usuarios u WHERE u.rolidRol.idRol = :rol").setParameter("rol", rol).list();
        for (Usuarios usuarios : list) {
            System.out.println("Usuarios por Rol" + usuarios.getUsername());

        }
        return list;
    }

    @Override
    public Usuarios findOne(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Usuarios aseg = (Usuarios) currentSession.get(Usuarios.class, id);
        return aseg;
    }

    @Override
    public boolean save(Usuarios obj) {
        boolean status = false;
        Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.save(obj);
            status = true;
        } catch (Exception e) {
            System.err.println("ERROR ADICIONANDO USUARIO  " + e);

        }
        return status;
    }

    @Override
    
    public boolean edit(Usuarios user) {
        boolean status = false;
        Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.update(user);
            status = true;
        } catch (Exception e) {
            System.err.println("ERROR ADICIONANDO USUARIO  " + e);

        }
        return status;
    }

    @Override
    public void delete(Usuarios user) {
        Session currentSession = sessionFactory.getCurrentSession();

        Ventas v = new Ventas();

        try {

            Criteria cri = currentSession.createCriteria(Usuarios.class);
            cri.add(Restrictions.eq("idCoordinador", new Integer(user.getIdUsuario())));
            ScrollableResults items = cri.scroll();

            while (items.next()) {

                Usuarios e = (Usuarios) items.get(0);
                e.setIdCoordinador(0);
                currentSession.update(e);

            }
            if (!currentSession.createCriteria(Ventas.class).add(Example.create(v)).createAlias("idUsuario", "idUsuario").add(Restrictions.eq("idUsuario.idUsuario", user.getIdUsuario())).list().isEmpty()) {
                user.setEliminada(1);
                currentSession.update(user);
            } else {
                currentSession.delete(user);

            }

        } catch (HibernateException e) {

            System.out.println(e.getMessage());
        }

    }

    @Override
    public int CheckUsername(String user) {
        //   "SELECT u FROM Usuarios u WHERE u.username = :username"
        Session currentSession = sessionFactory.getCurrentSession();
        int existe = 0;
        try {
            existe = currentSession.createQuery("FROM Usuarios u WHERE u.username = :username").setParameter("username", user).list().size();
            System.out.println("Existe Usuario----------------------------" + existe);
        } catch (Exception e) {

            return 0;
        }

        return existe;
    }

    @Override
    @Transactional
    public Usuarios getUsuariobyUsername(String username) {
        Session currentSession = sessionFactory.getCurrentSession();
        Usuarios user;
        try {
            System.out.println("USERNAMEEEEEEEEEEEEEEEE" + username);
            // user = currentSession.createQuery("FROM Usuarios u WHERE u.username = :username").setParameter("username", user).list();
            user = (Usuarios) currentSession.createQuery("FROM Usuarios u WHERE u.username = :username").setParameter("username", username).uniqueResult();// currentSession.get(Usuarios.class, username);
            System.out.println("USERNAMEEEEEEEEEEEEEEEqE " + user.getIdUsuario());

            return user;
        } catch (Exception e) {
            System.out.println("ERROR2 " + e);
            return new Usuarios();
        }

        //    return new Usuarios();
    }

    @Override
    public List<Usuarios> getUsersByCoordinador(int idCoordinador) {

        Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
System.out.println("getUsersByCoordinador id"+idCoordinador);
        List<Usuarios> list = currentSession.createQuery("FROM Usuarios u WHERE u.idCoordinador = :idCoordinador").setParameter("idCoordinador", idCoordinador).list();
        for (Usuarios usuarios : list) {
            System.out.println("Usuarios por idCoordinador" + usuarios.getUsername());

        }
        return list;
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuarios> getUsersBySupervisor(int idSupervisor) {
        Session currentSession = sessionFactory.getCurrentSession();
//		      Query<Usuarios> query=currentSession.createQuery("from Usuarios", Usuarios.class);
        List<Usuarios> list = currentSession.createQuery("FROM Usuarios u WHERE u.idSupervisor = :idSupervisor").setParameter("idSupervisor", idSupervisor).list();
        for (Usuarios usuarios : list) {
            System.out.println("Usuarios por idCoordinador" + usuarios.getUsername());

        }
        return list;
    }

  
}
