package com.example.SimpleH2JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SimpleH2JpaApplication implements CommandLineRunner {

	@Autowired
	private MyRepo repo;

//	Pojo pojo = new Pojo();

	public static void main(String[] args) {
		SpringApplication.run(SimpleH2JpaApplication.class, args);
	}

	@GetMapping("/students")
	List<Pojo> api2String(){
		return repo.findAll();
	}

	@GetMapping("/hi")
	public String apiString(){
		return "Hello-World";
	}


	@GetMapping("/hi1")
	public String api1String(){
		return "Hello-World";
	}

	@Override
	public void run(String... args) throws Exception {
//		rep.save(new Pojo(1,"Nav","BNG"));

//		List<Pojo> st=new ArrayList<>();
//		p1.add(new Pojo(1,"Nav","BNG"));
//		p1.add(new Pojo(2,"David","MBI"));
		Pojo p1 = new Pojo(1,"Nav","BNG");
		Pojo p2 = new Pojo(2,"David","MBI");
//		st.add(p1);
//		st.add(p2);
		repo.save(p1);
		repo.save(p2);
	}

}
