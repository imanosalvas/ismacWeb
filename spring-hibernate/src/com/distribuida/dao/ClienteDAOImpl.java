package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

 
	@Override
	@Transactional
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Cliente",Cliente.class).getResultList();
	}

	@Override
	@Transactional
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		return session.get(Cliente.class,id);
	}

	@Override
	@Transactional

	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		 session.saveOrUpdate(cliente);

		
	}

	/*@Override
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	@Transactional

	public void del(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Cliente cliente=session.get(Cliente.class, id);
		 session.delete(cliente);
	}



	@Override
	@Transactional
	public List<Cliente> findAll(String busqueda){
		Session session=sessionFactory.getCurrentSession();
        Query<Cliente> query= session.createQuery(
        		
        		"select CL"
        		+ " from Cliente CL"
        		+ " where CL.cedula LIKE: KeyBusqueda"
        		+" or CL.nombre LIKE: KeyBusqueda"
        		+" or CL.apellido LIKE: KeyBusqueda"
        		+" or CL.edad LIKE: KeyBusqueda"
        		+" or CL.fechaNacimiento LIKE: KeyBusqueda"
        		+" or CL.direccion LIKE: KeyBusqueda"
        		+" or CL.telefono LIKE: KeyBusqueda"
        		+" or CL.correo LIKE: KeyBusqueda"


     		,Cliente.class);
        query.setParameter("keyBusqueda","%"+busqueda+"%");
		return query.getResultList();
	}
	
	
	
	
}
