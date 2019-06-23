package springHelloAnnotation_noXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springHelloAnnotation_noXml")
@PropertySource("classpath:myApp.properties")
public class appConfig {

@Bean
public Advice newAdvice() {
	Advice adAdvice=new AdditionalAdvice();
	return adAdvice;
}
}
