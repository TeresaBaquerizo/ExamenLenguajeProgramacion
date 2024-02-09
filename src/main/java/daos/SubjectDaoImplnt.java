package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Subject; 

public class SubjectDaoImplnt implements SubjectDao {

    private EntityManagerFactory factory;
    private EntityManager em;

    public SubjectDaoImplnt() {
        factory = Persistence.createEntityManagerFactory("ExamenLPll");
        em = factory.createEntityManager();
    }

    @Override
    public void create(Subject subject) {
        em.getTransaction().begin();
        em.persist(subject);
        em.getTransaction().commit();
    }

    @Override
    public void update(Subject subject) {
        try {
            em.getTransaction().begin();
            em.merge(subject);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(); 
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Integer idsubject) {
        Subject subject = find(idsubject);
        if (subject != null) {
            em.getTransaction().begin();
            em.remove(subject);
            em.getTransaction().commit();
        }
    }

    @Override
    public Subject find(Integer idsubject) {
        return em.find(Subject.class, idsubject);
    }

    @Override
    public List<Subject> findAll() {
        Query query = em.createNamedQuery("Subject.findAll");
        List<Subject> lista = query.getResultList();
        return lista;
    }
}
