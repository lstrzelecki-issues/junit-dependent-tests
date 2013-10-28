package app.register;

import static app.LongLoadingCtxSimulator.simulate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Registering {
    @Bean
    public RegisterService loginService(){

        simulate(1000L);

        return new RegisterService();
    }
}
