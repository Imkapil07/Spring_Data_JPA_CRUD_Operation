package in.kp;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.kp.model.Student;
import in.kp.model.StudentRepo;

@SpringBootApplication
public class JpaPrac01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaPrac01Application.class, args); 
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);  
		StudentRepo repo = context.getBean(StudentRepo.class);
		
//		s1.setRollno(101);
//		s1.setName("Kapil Rai");
//		s1.setMarks(75);
//		
//		s2.setRollno(102);
//		s2.setName("Sachin Rai");
//		s2.setMarks(79);
//		
		s3.setRollno(103);
		s3.setName("Bhola Rai");
		s3.setMarks(70); 
		 
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3); 
		
//		Optional<Student> s = repo.findById(202);
//		System.out.println(s.orElse(new Student()));
		
//		System.out.print(repo.findByName("Kapil Rai"));
//		System.out.print(repo.findByMarks(70));
//		System.out.println(repo.findByMarksGreaterThan(74));
//		*
		repo.delete(s3);
		
		
	}

}
