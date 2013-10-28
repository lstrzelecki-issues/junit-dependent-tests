package app.logging;

import static app.LongLoadingCtxSimulator.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Logging {
    @Bean
    public LoginService loginService(){

        simulate(1000L);

        return new LoginService();
    }

}
