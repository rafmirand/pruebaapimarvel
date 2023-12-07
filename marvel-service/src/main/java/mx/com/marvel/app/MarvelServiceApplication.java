package mx.com.marvel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mx.com")
public class MarvelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelServiceApplication.class, args);
	}

}
