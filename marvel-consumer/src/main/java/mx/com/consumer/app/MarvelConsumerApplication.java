package mx.com.consumer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MarvelConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelConsumerApplication.class, args);
	}

}
