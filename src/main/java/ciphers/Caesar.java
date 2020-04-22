/**
 * MIT License
 * 
 * Copyright (c) 2020 Rishi Rao, Jiaxuan Wang
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package ciphers;

/**
 * This class allows you to encrypt and decrypt messages using a Caesar cipher
 * with any integer shift.
 * 
 * @author Jiaxuan Wang
 */
public class Caesar {

	/**
	 * Encrypts the provided message using the specified shift.
	 * 
	 * @param plaintext the plain text to encrypt
	 * @param shift     the shift to apply
	 * @return the encrypted message
	 */
	public static String encrypt(String plaintext, int shift) {
		StringBuilder ciphertext = new StringBuilder();
		for (char c : plaintext.toCharArray()) {
			if (Character.isUpperCase(c)) {
				int letterVal = (int) c - 65;
				ciphertext.append((char) ((letterVal + shift) % 26 + 65));
			} else if (Character.isLowerCase(c)) {
				int letterVal = (int) c - 97;
				ciphertext.append((char) ((letterVal + shift) % 26 + 97));
			} else {
				ciphertext.append(c);
			}
		}
		return plaintext.toString();
	}

	/**
	 * Decrypts the provided message using the specified shift.
	 * 
	 * @param ciphertext the cipher text to decrypt
	 * @param shift      the shift applied when encrypting
	 * @return the decrypted message
	 */
	public static String decrypt(String ciphertext, int shift) {
		StringBuilder plaintext = new StringBuilder();
		for (char c : ciphertext.toCharArray()) {
			if (Character.isUpperCase(c)) {
				int letterVal = (int) c - 65;
				plaintext.append((char) ((letterVal - shift + 26) % 26 + 65));
			} else if (Character.isLowerCase(c)) {
				int letterVal = (int) c - 97;
				plaintext.append((char) ((letterVal - shift + 26) % 26 + 97));
			} else {
				plaintext.append(c);
			}
		}
		return plaintext.toString();
	}

}
