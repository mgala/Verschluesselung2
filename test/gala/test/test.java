package gala.test;
import gala.cipher.*;

import org.junit.Test;

public class test {
	SubstitutionCipher s = new SubstitutionCipher("uflpwdrasjmconqybvtexhzkgi");
	
	
	
	@Test
	public void getSecretAlphabet(){
		s.getSecretAlphabet();
	}
	@Test
	public void encrypt(){
		s.encrypt("Hallo wie gehts");
	}
	@Test
	public void dencrypt(){
		s.decrypt(s.encrypt("Hallo wie gehts"));
				}
	}
