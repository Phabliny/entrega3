package br.edu.iftm.entrega3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Entrega3Application implements CommandLineRunner{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(Entrega3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcTemplate.execute("CREATE TABLE usuario(id SERIAL, nome VARCHAR(255), cpf VARCHAR(255), email varchar(255), PRIMARY KEY (id))");	
		jdbcTemplate.update("INSERT INTO usuario(nome, cpf, email) VALUES (?, ?, ?)", "Edson Angoti Júnior", "11122233344", "edson@gmail.com");
		jdbcTemplate.update("INSERT INTO usuario(nome, cpf, email) VALUES (?, ?, ?)", "Clarimundo Machado", "55566677788", "clarimundo@gmail.com");
		
	}
}
