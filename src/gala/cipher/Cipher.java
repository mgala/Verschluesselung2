package gala.cipher;
/**
* Interface
* @author Mateusz Gala
* @version 2014-04-07
*
*/
public interface Cipher {

	/**
	 * Methode zum verschlüsseln mit dem dazugehörigen Alphabet
	 * @param text eingabetext
	 * @return text verschlüsselter Text
	 */
	public String encrypt(String text);
	/**
	 * Methode zum entschlüsseln mit dem dazugehörigen Alphabet
	 * @param text verschlüsselter Text
	 * @return text entschlüsselter Text
	 */
	public String decrypt(String text);

}