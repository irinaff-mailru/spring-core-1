package sorokin.dev.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTask1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Task1AppConfig.class);
        UserMessagePrinter userMessagePrinter = context.getBean(UserMessagePrinter.class);
        userMessagePrinter.printMessage("Ivan");
    }
}