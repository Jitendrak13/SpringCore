package spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {
	// private BasicSpellChecker basicSpell;
	private SpellChecker spellChecker;
	
	public EmailClient() {}
	
	@Autowired
	public void setSpellChecker(@Qualifier("advancedSpellChecker") SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void sendEmail(String message) {
		spellChecker.checkSpelling(message);
	}
}
