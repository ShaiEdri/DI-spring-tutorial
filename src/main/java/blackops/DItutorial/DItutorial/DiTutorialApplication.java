package blackops.DItutorial.DItutorial;

import blackops.DItutorial.DItutorial.controllers.ConstructorInjectedController;
import blackops.DItutorial.DItutorial.controllers.MyController;
import blackops.DItutorial.DItutorial.controllers.PropertyInjectedController;
import blackops.DItutorial.DItutorial.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiTutorialApplication {

	public static void main(String[] args) {

		ApplicationContext c = SpringApplication.run(DiTutorialApplication.class, args);

		System.out.println("---> Property:");
		MyController controller = (MyController) c.getBean("myController");
		System.out.println(controller.sayHello());

		System.out.println("---> Property:");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) c.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayHello());

		System.out.println("---> Setter:");
		SetterInjectedController setterInjectedController = (SetterInjectedController) c.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayHello());

		System.out.println("---> Constructor:");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) c.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayHello());
	}

}
