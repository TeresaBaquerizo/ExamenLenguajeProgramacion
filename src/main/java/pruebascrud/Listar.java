package pruebascrud;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import model.Subject;

public class Listar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLPll");
		EntityManager em = factory.createEntityManager();
		
		Query query=em.createNamedQuery("Subject.findAll");
		
        List<Subject> subjectList =(List<Subject>)query.getResultList();
        
        for(Subject s:subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}