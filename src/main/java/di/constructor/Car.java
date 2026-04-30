package di.constructor;

import di.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("constructorCar")
public class Car {

    private final Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start("[Constructor]");
        System.out.println("car with constructor Injection: started");
    }
}
