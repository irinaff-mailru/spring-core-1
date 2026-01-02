package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sorokin.dev.task4.LifecycleBean;
import sorokin.dev.task4.Task4Configuration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Task4Configuration.class);
        LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);

        context.close();



    }
}