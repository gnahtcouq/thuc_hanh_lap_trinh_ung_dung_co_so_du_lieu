package controller;

import java.util.List;

import org.hibernate.Session;

import model.Contact;
import util.HibernateUtil;

public class ContactService {
	public List<Contact> getContacts() {
		Session ses = HibernateUtil.openSession();
		ses.beginTransaction();
		List<Contact> listContacts = ses.createQuery("from Contact").list();
		ses.getTransaction().commit();
		ses.close();
		return listContacts;
	}
	
	public Contact get(int id) {
		Session ses = HibernateUtil.openSession();
		ses.beginTransaction();
		Contact c = (Contact) ses.get(Contact.class, id);
		ses.getTransaction().commit();
		ses.close();
		return c;
	}
	
	public void create(Contact obj) {
		Session ses = HibernateUtil.openSession();
		ses.beginTransaction();
		ses.save(obj);
		ses.getTransaction().commit();
		ses.close();
	}
	
	public void save(Contact obj) {
		Session ses = HibernateUtil.openSession();
		ses.beginTransaction();
		ses.update(obj);
		ses.getTransaction().commit();
		ses.close();
	}
	public void delete(Contact obj) {
		Session ses = HibernateUtil.openSession();
		ses.beginTransaction();
		ses.delete(obj);
		ses.getTransaction().commit();
		ses.close();
	}
}

