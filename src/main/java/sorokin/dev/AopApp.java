package sorokin.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sorokin.dev.task5.AdditionalConfig;
import sorokin.dev.task5.AppProperties;
import sorokin.dev.task6.PaymentService;

@SpringBootApplication
public class AopApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AopApp.class, args);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.processPayment(1500);
        System.out.println(paymentService.checkStatus());

        try {
            paymentService.processPayment(-500);
        } catch (Exception ignored) {}
    }
}
