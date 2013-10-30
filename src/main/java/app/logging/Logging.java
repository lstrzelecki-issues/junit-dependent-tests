package app.logging;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import app.core.Entitities;

@Configuration
@Import(Entitities.class)
public class Logging {
    @Bean
    public LoginService loginService(){

        return new LoginService();
    }

}
