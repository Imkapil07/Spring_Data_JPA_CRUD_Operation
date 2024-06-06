package in.kp.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

	
	List<Student> findByName(String name);
	List<Student> findByMarks(int marks);
	List<Student> findByMarksGreaterThan(int marks);
}
