package net.dinostrkljevic.springboot;

import net.dinostrkljevic.springboot.model.User;
import net.dinostrkljevic.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
  	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Dino", "Strkljevic" , "dinos@gmail.com"));
		this.userRepository.save(new User("Arijan", "Strkljevic" , "arijans@gmail.com"));
		this.userRepository.save(new User("Iram", "Gladan" , "iramg@gmail.com"));
	}
}
