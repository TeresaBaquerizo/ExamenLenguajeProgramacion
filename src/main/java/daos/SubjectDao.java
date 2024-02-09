package daos;

import java.util.List;

import model.Subject; 

public interface SubjectDao {
	
	public void create(Subject subject);
	
	public void update(Subject subject);
	
	public void delete(Integer idsubject);
	
	public Subject find(Integer subject);
	
	public List<Subject> findAll();
}
