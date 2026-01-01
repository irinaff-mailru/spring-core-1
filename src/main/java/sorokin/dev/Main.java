package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sorokin.dev.task2.GreetingPrinterConstructor;
import sorokin.dev.task2.GreetingPrinterField;
import sorokin.dev.task2.GreetingPrinterSetter;
import sorokin.dev.task2.Task2Configuration;

public class Main {
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