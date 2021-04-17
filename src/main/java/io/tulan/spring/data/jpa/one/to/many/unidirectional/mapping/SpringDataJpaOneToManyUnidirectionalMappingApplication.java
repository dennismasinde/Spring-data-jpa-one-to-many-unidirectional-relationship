package io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping;

import io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.model.Student;
import io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.model.University;
import io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.repository.StudentRepository;
import io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.repository.UniversityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaOneToManyUnidirectionalMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(SpringDataJpaOneToManyUnidirectionalMappingApplication.class, args);

		StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);
		UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);


		Student firststudent = new Student("1111");
		Student secondstudent = new Student("1112");
		List<Student> students = Arrays.asList(firststudent,secondstudent);


		University university = new University("Moi University",students);
		universityRepository.save(university);

	}

}
