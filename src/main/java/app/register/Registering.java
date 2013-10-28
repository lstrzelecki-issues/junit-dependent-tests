package app.register;

import static app.LongLoadingCtxSimulator.simulateFor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import app.core.Entitities;

@Configuration
@Import(Entitities.class)
public class Registering {
    @Bean
    public RegisterService loginService(){

        simulateFor(1);

        return new RegisterService();
    }
}
