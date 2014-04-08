package gala.cipher;
/**
*
* @author Matek Gala
* @version 2014-04-07
*/

public class MonoAlphabeticCipher implements Cipher{

	private String secretAlphabet = "uflpwdrasjmconqybvtexhzkgi"; 
	/**
	 * Konstruktor
	 */
	public MonoAlphabeticCipher(){
	}

	/**
	 * getter Methode f�r das alphabet
	 * @return secretAlphabet liefert das Alphabet zur�ck
	 */
	public String getSecretAlphabet() {
		return secretAlphabet;
	}
	/**
	 * setter Methode f�r das alphabet
	 * @param secretAlphabet ver�ndert das alphabet
	 */
	protected void setSecretAlphabet(String secretAlphabet) {
		this.secretAlphabet = secretAlphabet;
	}

	/**
	 * Verschl�sselungsmethode mit dem Geheimtext
	 * @param text text
	 * @return text gibt den verschl�sselten Text zur�ck
	 */
	@Override
	public String encrypt(String text) {
		String text1 = text.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz����";
		String text2 = "";
		for(int i = 0; i < text1.length(); i++){
				char a=text1.charAt(i);
				int stelle = alphabet.indexOf(a); 
				if(stelle >= 0){
				text2 += this.secretAlphabet.charAt(stelle);
					}
				else {
				text2 += a;
				}
			}
		
		return text2;
	}
	
	/**
	 * Entschl�sselugsmethode vom Geheimtext
	 * @param verText verschl�sselter Text
	 * @return entText entschl�sselter Text
	 */
	@Override
	public String decrypt(String text) {
		String alphabet="abcdefghijklmnopqrstuvwxyz����";
		String fertig="";
		String t= text.toLowerCase();
		for(int i=0; i<t.length(); ++i){
		char b=t.charAt(i);
		int index= this.secretAlphabet.indexOf(b);
			if(index>=0){
				fertig+=alphabet.charAt(index);
			}
		else {
			fertig+=b; 
			}
		}
		return fertig;
	}

}