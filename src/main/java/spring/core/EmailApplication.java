package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailApplication {
	
	public static void main(String[]args) {
		
		// Basic Example of Dependency Injection
		// Dependency is injected at runtime manually by passing Interface reference
		// EmailClient client = new EmailClient(new AdvancedSpellChecker());
		
		// Invoke IOC Container - Reading from XML
		//		ApplicationContext applicationContext = 
		//				new ClassPathXmlApplicationContext("beans.xml");
		
		// Invoke IOC Container - Reading from AppConfig Class
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
		
		emailClient.sendEmail("Sending First Message");
		emailClient.sendEmail("Sending Second Message");
		
		AdvancedSpellChecker ad1 = 
				applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
		System.out.println(ad1);
		AdvancedSpellChecker ad2 = 
				applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
		System.out.println(ad2);
		
		((AnnotationConfigApplicationContext)applicationContext).registerShutdownHook();
		
	}
}
