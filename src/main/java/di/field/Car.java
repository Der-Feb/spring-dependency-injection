package di.field;

import di.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fieldCar")
public class Car {
    @Autowired
    private Engine engine;

    public void start() {
        engine.start("[Field]");
        System.out.println("Car with field Injection: started");
    }
}
