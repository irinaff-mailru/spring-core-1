package sorokin.dev.task4;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("запущен конструктор");
    }

    @PostConstruct
    public void init() {
        System.out.println("Бин инициализирован");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Бин уничтожен");
    }
}
