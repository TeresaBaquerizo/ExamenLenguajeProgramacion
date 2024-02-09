package pruebascrud;

import daos.SubjectDao;
import daos.SubjectDaoImplnt;
import model.Subject;

import java.util.List;

public class Editar {

    public static void main(String[] args) {

        SubjectDao dao = new SubjectDaoImplnt();

        Subject subjectToUpdate = dao.find(1);

        if (subjectToUpdate != null) {
            subjectToUpdate.setSubject("Matematica Avanzada");
            subjectToUpdate.setCredits("5");

            dao.update(subjectToUpdate);
        } else {
            System.out.println("No se encontró el registro con el id especificado.");
        }

        List<Subject> subjectList = dao.findAll();
        for (Subject s : subjectList) {
            System.out.println(s.getIdsubject());
            System.out.println(s.getSubject());
            System.out.println(s.getCredits());
        }
    }
}