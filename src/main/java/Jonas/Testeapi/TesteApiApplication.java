package Jonas.Testeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TesteApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApiApplication.class, args);
	}
	@GetMapping
	public String hello() {
		return "olá Mundo";

	}

}
