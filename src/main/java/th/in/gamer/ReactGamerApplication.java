package th.in.gamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("th.in.gamer.*")
public class ReactGamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactGamerApplication.class, args);
	}
}
