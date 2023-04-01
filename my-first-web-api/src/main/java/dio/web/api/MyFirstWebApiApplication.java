package dio.web.api;

// Acesso da API pela porta: localhost:8081/welcome

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstWebApiApplication.class, args);
    }

}
