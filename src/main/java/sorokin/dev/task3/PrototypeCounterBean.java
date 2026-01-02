package sorokin.dev.task3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeCounterBean {

    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
