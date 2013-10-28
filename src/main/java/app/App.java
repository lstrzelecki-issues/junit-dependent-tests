package app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import app.logging.Logging;
import app.register.Registering;

@Configuration
@Import({Registering.class,Logging.class})
public class App {


}
