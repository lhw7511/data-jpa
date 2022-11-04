package study.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		System.out.println("SERVER START");
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
