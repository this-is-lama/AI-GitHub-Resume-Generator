package my.project.aigrg.config;

import com.openai.springboot.OpenAIClientCustomizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${base-url}")
    private String baseUrl;

    @Value("${api-key}")
    private String apiKey;

    @Bean
    public OpenAIClientCustomizer customizer() {
        return builder -> builder
                .apiKey(apiKey)
                .baseUrl(baseUrl)
                .build();
    }
}