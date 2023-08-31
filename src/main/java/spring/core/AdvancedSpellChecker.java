package spring.core;

import java.io.File;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("singleton")
@PropertySource("classpath:/application.properties")
public class AdvancedSpellChecker implements SpellChecker, InitializingBean, DisposableBean{
	
	@Value("${app.database.uri}")
	public String dbName;
	
	public AdvancedSpellChecker() {
	}
	
	@Override
	public void checkSpelling(String message) {
		System.out.println("Advanced spell check is finished.");
		System.out.println("DB Name is :- " + dbName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method is called.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After property set is called.");
	}

}