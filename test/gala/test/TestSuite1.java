package gala.test;

import gala.cipher.Cipher;
import gala.cipher.MonoAlphabeticCipher;
import gala.cipher.SubstitutionCipher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({SubstitutionCipher.class,MonoAlphabeticCipher.class,Cipher.class})
public class TestSuite1 {
}