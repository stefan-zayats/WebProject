package org.example.webproject;

import org.example.webproject.controller.DepController;
import org.example.webproject.entity.DepResult;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class WebProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(DepController depController) {
        return args -> {
            DepResult result = depController.calculateDep(10000.0, 12, "USD", 5.0);

            System.out.println(result);

        };
    }

}