package sorokin.dev.task5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertyDemoApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PropertyDemoApp.class, args);
        AdditionalConfig config = context.getBean(AdditionalConfig.class);
        config.printInfo();
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.printInfo();
    }
}
