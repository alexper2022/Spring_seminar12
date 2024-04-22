package my.teststarter.timer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectTimerAutoConfiguration {

    @Bean
    ElapsedTime elapsedTime() {
        return new ElapsedTime();
    }
}
