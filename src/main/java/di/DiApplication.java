package di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args);

        context.getBean("constructorCar", di.constructor.Car.class).start();
        context.getBean("setterCar", di.setter.Car.class).start();
        context.getBean("fieldCar", di.field.Car.class).start();
	}
}
