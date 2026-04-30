package di;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void start(String method) {
        System.out.println(method + " Starting engine");
    }

    public void stop(){
        System.out.println("Stopping engine");
    }
}
