package sorokin.dev.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTask2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Task2Configuration.class);
        GreetingPrinterConstructor greetingPrinter1 = context.getBean(GreetingPrinterConstructor.class);
        greetingPrinter1.print("Ivan");

        GreetingPrinterField greetingPrinter2 = context.getBean(GreetingPrinterField.class);
        greetingPrinter2.print("Ivan");

        GreetingPrinterSetter greetingPrinter3 = context.getBean(GreetingPrinterSetter.class);
        greetingPrinter3.print("Ivan");
    }
}