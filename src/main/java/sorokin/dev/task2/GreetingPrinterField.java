package sorokin.dev.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingPrinterField {

    @Autowired
    @Qualifier("formalGreetingService")
    private GreetingService service;

    public void print(String name) {
        System.out.println(service.greet(name));
    }

}
