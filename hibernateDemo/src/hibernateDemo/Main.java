package hibernateDemo;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		//Unit of Work
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//from City c where c.countryCode='TUR' AND c.district='Ankara'
			// from City c where c.name LIKE '%kar%'
			//List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
					
			//for(String countryCode: countryCodes)
			//{
			//System.out.println(countryCode);
			//}
			
			//INSERT
			/*
			 * City city = new City(); city.setName("Asgard"); city.setCountryCode("TUR");
			 * city.setDistrict("Karadeniz"); city.setPopulation(100000);
			 * 
			 * session.save(city);
			 */
			
			//UPDATE
			/*
			 * City city = session.get(City.class, 50); System.out.println(city.getName());
			 * city.setName("Tiaret");
			 * session.save(city);
			 */
			
			 City city = session.get(City.class, 4000); System.out.println(city.getName());
			 session.delete(city);
			
			
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}
}