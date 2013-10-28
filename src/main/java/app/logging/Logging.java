package app.logging;

import static app.LongLoadingCtxSimulator.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import app.core.Entitities;

@Configuration
@Import(Entitities.class)
public class Logging {
    @Bean
    public LoginService loginService(){

        simulateFor(1);

        return new LoginService();
    }

}
