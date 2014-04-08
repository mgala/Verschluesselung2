package gala.cipher;
/**
* Interface
* @author Mateusz Gala
* @version 2014-04-07
*
*/
public interface Cipher {

	/**
	 * Methode zum verschl�sseln mit dem dazugeh�rigen Alphabet
	 * @param text eingabetext
	 * @return text verschl�sselter Text
	 */
	public String encrypt(String text);
	/**
	 * Methode zum entschl�sseln mit dem dazugeh�rigen Alphabet
	 * @param text verschl�sselter Text
	 * @return text entschl�sselter Text
	 */
	public String decrypt(String text);

}