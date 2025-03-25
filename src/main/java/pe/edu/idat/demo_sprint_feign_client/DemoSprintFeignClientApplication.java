package pe.edu.idat.demo_sprint_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoSprintFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSprintFeignClientApplication.class, args);
	}

}
