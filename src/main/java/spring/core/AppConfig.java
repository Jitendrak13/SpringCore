package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "spring.core")
public class AppConfig {
	
	@Bean(name = "basicSpellCheck", initMethod="init", destroyMethod="destroy")
	public BasicSpellChecker getBasicSpellChecker() {
		return new BasicSpellChecker();
	}
	
//	@Bean(name = "advancedSpellCheck")
//	public AdvancedSpellChecker getAdvancedSpellChecker() {
//		return new AdvancedSpellChecker();
//	}
//	
//	@Bean(name = "emailClient")
//	public EmailClient getEmailClient() {
//		EmailClient emailClient = new EmailClient();
//		emailClient.setSpellChecker(getAdvancedSpellChecker());
//		return emailClient;
//	}
	
}