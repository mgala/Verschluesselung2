package gala.cipher;

	/**
	 * erweitert die Klasse MonoAlphabeticCipher
	 * @author Mateusz Gala
	 * @version 2014-04-07
	 */
public class SubstitutionCipher extends MonoAlphabeticCipher {
	/**
	 * Kontruktor, der erbt
	 * @param secretAlphabet Geheimalphabet
	 */
public SubstitutionCipher(String secretAlphabet) {
	super();
	super.setSecretAlphabet(secretAlphabet);
}

	/**
	 * @param setSecretAlphabet sectretAlphabet
	 */
@Override
public void setSecretAlphabet(String secretAlphabet) {	
	super.setSecretAlphabet(secretAlphabet);
	}
}