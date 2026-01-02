package sorokin.dev.task5;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private String name;

    private String version;

    private String developer;

    private List<String> recipients;

    @Override
    public String toString() {
        return "AppProperties{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", developer='" + developer + '\'' +
                ", recipients=" + recipients +
                '}';
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }
}
