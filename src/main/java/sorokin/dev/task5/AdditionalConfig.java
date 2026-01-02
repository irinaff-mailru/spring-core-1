package sorokin.dev.task5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
@PropertySource("classpath:additional.properties")
public class AdditionalConfig {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("#{'${list.values}'.split(',')}}")
    private List<String> listValues;

    @Value("#{'${set.values}'.split(',')}}")
    private Set<String> setValues;

    @Value("#{${map.values}}")
    private Map<String, Integer> mapValues;

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "AdditionalConfig{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", listValues=" + listValues +
                ", setValues=" + setValues +
                ", mapValues=" + mapValues +
                '}';
    }
}
