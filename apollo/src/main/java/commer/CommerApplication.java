package commer;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import commer.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class CommerApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommerApplication.class, args);



    }


}
