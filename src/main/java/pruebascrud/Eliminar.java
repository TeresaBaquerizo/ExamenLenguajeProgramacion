package pruebascrud;

import daos.SubjectDao;
import daos.SubjectDaoImplnt;
import model.Subject;

import java.util.List;

public class Eliminar {

    public static void main(String[] args) {

        SubjectDao dao = new SubjectDaoImplnt();

        Integer idToDelete = 1;

        dao.delete(idToDelete);

        List<Subject> subjectList = dao.findAll();
        for (Subject s : subjectList) {
            System.out.println(s.getIdsubject());
            System.out.println(s.getSubject());
            System.out.println(s.getCredits());
        }
    }
}