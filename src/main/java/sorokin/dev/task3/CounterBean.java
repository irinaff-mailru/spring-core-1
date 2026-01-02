package sorokin.dev.task3;

import org.springframework.stereotype.Component;

@Component
public class CounterBean {

    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
