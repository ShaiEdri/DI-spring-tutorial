package blackops.DItutorial.DItutorial.config;

import blackops.DItutorial.DItutorial.services.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {

    @Profile("EN")
    @Bean("i18service")
    i18nEnglishService i18nEnglishService(){
        return new i18nEnglishService();
    }
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
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
