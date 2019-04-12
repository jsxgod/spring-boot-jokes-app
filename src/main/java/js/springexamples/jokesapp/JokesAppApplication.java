package js.springexamples.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:joke-config.xml")
public class JokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesAppApplication.class, args);
    }

}
