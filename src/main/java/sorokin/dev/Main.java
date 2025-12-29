package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserMessagePrinter userMessagePrinter = context.getBean(UserMessagePrinter.class);
        userMessagePrinter.printMessage("Ivan");
    }
}