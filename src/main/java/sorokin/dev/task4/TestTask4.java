package sorokin.dev.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTask4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Task4Configuration.class);
        LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);

        context.close();



    }
}