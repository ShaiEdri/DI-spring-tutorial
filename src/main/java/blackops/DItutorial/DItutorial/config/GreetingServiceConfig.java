package blackops.DItutorial.DItutorial.config;

import blackops.DItutorial.DItutorial.services.ConstructorInjectedGreetingService;
import blackops.DItutorial.DItutorial.services.PropertyInjectedGreetingService;
import blackops.DItutorial.DItutorial.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        SetterInjectedGreetingService setterInjectedGreetingService = new SetterInjectedGreetingService();
        System.out.println(setterInjectedGreetingService);
        return setterInjectedGreetingService;
    }

}
