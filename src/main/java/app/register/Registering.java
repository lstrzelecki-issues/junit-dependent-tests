package app.register;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import app.core.Entitities;

@Configuration
@Import(Entitities.class)
public class Registering {
    @Bean
    public RegisterService loginService(){

        return new RegisterService();
    }
}
