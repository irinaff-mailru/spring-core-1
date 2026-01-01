package sorokin.dev.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterSetter {

    private GreetingService service;

    @Autowired
    public void greetingService(@Qualifier("formalGreetingService") GreetingService service) {
        this.service = service;
    }

    public void print(String name) {
        System.out.println(service.greet(name));
    }
}
