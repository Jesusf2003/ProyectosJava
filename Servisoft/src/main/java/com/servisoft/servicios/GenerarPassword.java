/**
 * 
 */
package com.servisoft.servicios;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * @author chema
 *
 */
public class GenerarPassword {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] symbols = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
				"~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", "\\", "|", ";", ":", ",", "<", ".", ">", "/", "?"};
		int length = (int) (Math.random() * (16 - 8)) + 8;
		Random random;
		try {
			random = SecureRandom.getInstanceStrong();
			StringBuilder sb = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				int indexRandom = random.nextInt(symbols.length);
				sb.append(symbols[indexRandom]);
			}
			String password = sb.toString();
			System.out.println(password);
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e.toString());
		}
	}
}