package blackops.DItutorial.DItutorial;

import blackops.DItutorial.DItutorial.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiTutorialApplication {

	public static void main(String[] args) {

		ApplicationContext c = SpringApplication.run(DiTutorialApplication.class, args);
		MyController x = (MyController) c.getBean("myController");
		System.out.println(x.sayHello());
	}

}
