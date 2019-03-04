package com.cts.employeemngt.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cts.employeemngt.bean.Employee;
import com.cts.employeemngt.util.HibernateUtil;

public class EmployeeMngtDAOImpl implements EmployeeMngtDao {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//	private static EmployeeMngtDAOImpl employeeMngtDAOImpl;
//	public static EmployeeMngtDAOImpl getInstance(){
//		if(employeeMngtDAOImpl!=null)
//		{
//			employeeMngtDAOImpl=new EmployeeMngtDAOImpl();
//			return employeeMngtDAOImpl;
//		}
//		else
//		{
//			return employeeMngtDAOImpl;
//		}
//	}

	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try{
		 session = sessionFactory.openSession();
		 transaction = session.getTransaction();
		transaction.begin();
		session.save(employee);
		transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally{
			if(session!=null)
			{
				session.close();
			}
		}
		return null;
	}

	public String deleteEmployeeById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployeeByName(String Id) {
		// TODO Auto-generated method stub
		String query=" from Empl where firstName=?";
		Session session=null;
		 Query<Employee> query2=null;
		 try{
			 session= sessionFactory.openSession();
			 query2= session.createQuery(query);
			 query2.setParameter(0, Id);
			 List<Employee> list= query2.getResultList();
			 return list;
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 finally
		 {
			 if(session!=null)
			 {
				 session.close();
			 }
		 }
		 
		return null;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session=null;
		String query="from Empl";
		Query<Employee> query2=null;
		try{
			session=sessionFactory.openSession();
			query2= session.createQuery(query);
			List<Employee> list= query2.getResultList();
			return list;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(session!=null)
			{
				session.close();
			}
		}
		
		return null;
	}

	public Employee getEmployeeById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
