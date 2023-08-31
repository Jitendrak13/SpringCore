package spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class JavaLifecycleHooks {
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init of java lifecycle hooks");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy of java lifecycle hooks");
	}
}
