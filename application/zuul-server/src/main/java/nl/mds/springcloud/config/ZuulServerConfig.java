package nl.mds.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ZuulServerConfig {

    @Bean
    public WebMvcConfigurer corsConfigure() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/student/find/**").allowedOrigins("http://localhost:3000");
                registry.addMapping("/course/find/**").allowedOrigins("http://localhost:3000");
            }
        };
    }

}
