package car.project.padrao_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PadraoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoSpringApplication.class, args);
	}

}
