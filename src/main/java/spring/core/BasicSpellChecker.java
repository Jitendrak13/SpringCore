package spring.core;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component
public class BasicSpellChecker implements SpellChecker{
	
	public BasicSpellChecker() {
	}
	
	public void init() {
		System.out.println("Inside BasicSpell Check init method.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside BasicSpell Check destroy method.");
	}
	
	@Override
	public void checkSpelling(String message) {
		System.out.println("Basic spell check is finished.");
	}

}
