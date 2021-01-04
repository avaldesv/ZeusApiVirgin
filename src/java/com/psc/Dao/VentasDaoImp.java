/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Dao;

import com.google.gson.Gson;
import com.psc.Entity.Lineasasociadas;
import com.psc.Entity.Ventas;
import com.psc.Entity.Tomador;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 *
 * @author AVV
 */
@Repository
public class VentasDaoImp implements VentasDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Ventas> findAll() {

        Session currentSession = sessionFactory.getCurrentSession();
        //   System.out.println("asdasd"+currentSession.createQuery("from Ventas").list());
        //	return currentSession.createQuery("from Ventas").list();
        List<Ventas> list = currentSession.createQuery("from Ventas v ORDER BY v.idVentas DESC").list();

        for (Ventas rol : list) {
            System.out.println("FECHA VENTA---------------------" + rol.getFechaVenta());
            System.out.println("IDVENTA---------------------" + rol.getIdVentas());
            System.out.println("TOMADOR---------------------" + rol.getIdTomador());
        }
        return list;
    }

    @Override
    public Ventas findOne(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Ventas aseg = (Ventas) currentSession.get(Ventas.class, id);
        return aseg;
    }

    @Override
    @Transactional
    public Ventas save(Ventas obj) {
        System.out.println(new Gson().toJson(obj));
        //obj.setIdUsuario(12);
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(obj);
        //    System.out.println(obj.getLineasasociadasList().size());
        for (Lineasasociadas object : obj.getLineasasociadasList()) {
            object.setIdVenta(obj);
            currentSession.saveOrUpdate(object);
        }

        return obj;
    }

    @Override
    public void edit(Ventas obj) {
        Session currentSession = sessionFactory.getCurrentSession();
        System.out.println(new Gson().toJson(obj));
        currentSession.saveOrUpdate(obj);
        //System.out.println(obj.getIdVentas());
        //  System.out.println(obj.getLineasasociadasList().size());
        for (Lineasasociadas object : obj.getLineasasociadasList()) {
            object.setIdVenta(obj);
            currentSession.update(object);
        }

    }

    @Override
    public void delete(Ventas obj) {
        Session currentSession = sessionFactory.getCurrentSession();
        for (Lineasasociadas object : obj.getLineasasociadasList()) {
            currentSession.delete(object);
        }
        currentSession.delete(obj.getIdTomador());
        currentSession.delete(obj);
    }

    @Override
    public List<Ventas> ListarbyUserId(int id, String fechaI, String fechaF) {
        Session currentSession = sessionFactory.getCurrentSession();
        //   System.out.println("asdasd"+currentSession.createQuery("from Ventas").list());
        //	return currentSession.createQuery("from Ventas").list();
        List<Ventas> list = currentSession.createQuery("FROM Ventas v WHERE v.idUsuario.idUsuario = :idUsuario AND v.fechaVenta BETWEEN :fechaI AND :fechaF ORDER BY v.idVentas DESC")
                .setParameter("idUsuario", id)
                .setParameter("fechaI", fechaI)
                .setParameter("fechaF", fechaF).list();
        return list;
        //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //  public List<Ventas> getBySearch(String nombre, String apell, String dni, String telef, String idcoordinador, String idsegmento, String fechai, String fechaf) {
    public List<Ventas> getBySearch(Ventas ventaseach, String fechai, String fechaf, int idcoordinador) {

        Session currentSession = sessionFactory.getCurrentSession();

        Ventas example = new Ventas();
        Criteria crit = currentSession.createCriteria(Ventas.class);

        Tomador tomadorexample = new Tomador();

        tomadorexample.setNombre(ventaseach.getIdTomador().getNombre());
        tomadorexample.setTelefono1(ventaseach.getIdTomador().getTelefono1());
        tomadorexample.setDni(ventaseach.getIdTomador().getDni());
        tomadorexample.setPrimerApellido(ventaseach.getIdTomador().getPrimerApellido());
       // example.setIdTomador(tomadorexample);

        if (ventaseach.getIdSegmento() != null) {
            if (ventaseach.getIdSegmento() != 0) {
                System.out.println("IF 1");
                example.setIdSegmento(ventaseach.getIdSegmento());
            }
        }

        Example ejemplo = Example.create(example);
        crit.add(ejemplo);
        
        
        if (!fechai.isEmpty() && !fechai.equals("null")) {
            if (!fechaf.equals("null") && !fechaf.isEmpty()) {
                System.out.println("IF 2");
                crit.add(Restrictions.between("fechaVenta", fechai, fechaf));

            } else {
                System.out.println("IF 3");
                crit.add(Restrictions.like("fechaVenta", fechai, MatchMode.ANYWHERE));

            }
        }
        if (idcoordinador != 0) {
System.out.println("IF 4");
            crit.createAlias("idUsuario", "idUsuario").add(Restrictions.eq("idUsuario.idCoordinador", idcoordinador));
        }

        crit.createAlias("idTomador", "tomador");
        if (!StringUtils.isEmpty(ventaseach.getIdTomador().getNombre())) {
            System.out.println("IF 5");
            crit.add(Restrictions.like("tomador.nombre", ventaseach.getIdTomador().getNombre(), MatchMode.ANYWHERE));
        }
        if (!StringUtils.isEmpty(ventaseach.getIdTomador().getDni())) {
System.out.println("IF 6");
            crit.add(Restrictions.like("tomador.dni", ventaseach.getIdTomador().getDni(), MatchMode.ANYWHERE));
        }
        if (!StringUtils.isEmpty(tomadorexample.getTelefono1())) {
System.out.println("IF 7");
            crit.add(Restrictions.like("tomador.telefono1", ventaseach.getIdTomador().getTelefono1(), MatchMode.ANYWHERE));
        }
        if (!StringUtils.isEmpty(tomadorexample.getPrimerApellido())) {
System.out.println("IF 8");
            crit.add(Restrictions.like("tomador.primerApellido", ventaseach.getIdTomador().getPrimerApellido(), MatchMode.ANYWHERE));
        }
        // crit.add(Restrictions.between("fechaVenta", fechai, fechaf));       

        return crit.list();

    }

}
