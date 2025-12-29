package sorokin.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserMessageService userMessageService() {
        return new UserMessageService();
    }

    @Bean("taskManager")
    public UserMessagePrinter taskManager(UserMessageService userMessageService) {
        return new UserMessagePrinter (userMessageService);
    }
}
