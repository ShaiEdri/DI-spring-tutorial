package blackops.DItutorial.DItutorial;

import blackops.DItutorial.DItutorial.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiTutorialApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiTutorialApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("---> Primary:");
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

		System.out.println("---> Property:");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayHello());

		System.out.println("---> Setter:");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayHello());

		System.out.println("---> Constructor:");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayHello());
	}

}
