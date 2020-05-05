package io.dowlath.searchpagination;

import io.dowlath.searchpagination.entity.Student;
import io.dowlath.searchpagination.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SearchPaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchPaginationApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(StudentRepository repository){
		return args ->{
			repository.save(new Student(null,"Dowlath","one",1994));
			repository.save(new Student(null,"Arsh","two",2014));
			repository.save(new Student(null,"Ariz","one",2005));
			repository.save(new Student(null,"Raj","two",2012));
			repository.save(new Student(null,"Kumar","one",2003));
			repository.save(new Student(null,"Ajith","one",2003));
			repository.save(new Student(null,"Malathy","two",2003));
			repository.save(new Student(null,"Nirmal","one",2009));
			repository.save(new Student(null,"Veena","one",2013));
			repository.save(new Student(null,"Mohan","one",2005));
			repository.save(new Student(null,"Prathick","five",2001));
			repository.save(new Student(null,"Kapil","one",2018));
			repository.save(new Student(null,"Sathya","one",2016));
			repository.save(new Student(null,"Bala","one",2019));
			repository.save(new Student(null,"Prabhu","two",2010));
		};
	}

}
