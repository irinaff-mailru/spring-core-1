package sorokin.dev.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterConstructor {

    @Qualifier("friendlyGreetingService")
    final public GreetingService service;

    @Autowired
    public GreetingPrinterConstructor(GreetingService service) {
        this.service = service;
    }

    public void print(String name) {
        System.out.println(service.greet(name));
    }
}
