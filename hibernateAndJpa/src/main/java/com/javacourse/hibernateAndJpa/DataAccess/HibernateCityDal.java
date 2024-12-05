package com.javacourse.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.javacourse.hibernateAndJpa.Entities.City;

public class HibernateCityDal implements ICityDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	//AOP - Aspect Oriented Programming
	@Override
	@Transactional
	public List<City> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
