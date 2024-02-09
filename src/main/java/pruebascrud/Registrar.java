package pruebascrud;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.SubjectDao;
import daos.SubjectDaoImplnt;

import java.util.List;
import model.Subject;

public class Registrar {

	public static void main(String[] args) {

		SubjectDao dao=new SubjectDaoImplnt();
		
		Subject subject =new Subject();
		subject.setSubject("Ciencias");
		subject.setCredits("5");
		
		dao.create(subject);
		
		List<Subject> subjectList =dao.findAll();
        
		for(Subject s:subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}

}
