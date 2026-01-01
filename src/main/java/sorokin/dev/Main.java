package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sorokin.dev.task3.CounterBean;
import sorokin.dev.task3.PrototypeCounterBean;
import sorokin.dev.task3.Task3Configuration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Task3Configuration.class);
        CounterBean counterBean1 = context.getBean(CounterBean.class);
        CounterBean counterBean2 = context.getBean(CounterBean.class);
        counterBean1.increment();
        System.out.println(counterBean1.getCount() == counterBean2.getCount());

        PrototypeCounterBean counterBean3 = context.getBean(PrototypeCounterBean.class);
        PrototypeCounterBean counterBean4 = context.getBean(PrototypeCounterBean.class);
        counterBean3.increment();
        System.out.println(counterBean3.getCount() == counterBean4.getCount());

        System.out.println(counterBean1.getCount());
        System.out.println(counterBean2.getCount());
        System.out.println(counterBean3.getCount());
        System.out.println(counterBean4.getCount());
    }
}