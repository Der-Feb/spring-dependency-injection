package di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import di.Engine;

@Component("setterCar")
public class Car {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start("[Setter]");
        System.out.println("Car with setter Injection: started");
    }
}