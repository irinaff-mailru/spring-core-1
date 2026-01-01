package sorokin.dev.task2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FriendlyGreetingService implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello, " + name + "! (friendly)!";
    }

}
