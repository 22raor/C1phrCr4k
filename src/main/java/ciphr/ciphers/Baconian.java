/**
 * MIT License

Copyright (c) 2020 Rishi Rao, Jiaxuan Wang

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 * 
 */
package ciphr.ciphers;

/**
 * This class allows you to encrypt and decrypt messages using the Baconian
 * Cipher.
 * 
 */
public class Baconian {

	private static final String alphabet = "abcdefghiklmnopqrstvwxyz";

	/**
	 * Returns the 5-letter sequence of a's and b's obtained from the specified
	 * binary number.
	 * 
	 * @param binary the binary number
	 * @return the 5-letter sequence
	 */
	private static String getSequence(String binary) {
		String sequence = binary.replace('0', 'a').replace('1', 'b');
		StringBuilder sequenceStr = new StringBuilder(sequence);
		while (sequenceStr.length() < 5) {
			sequenceStr.insert(0, 'a');
		}
		return sequenceStr.toString();
	}

	/**
	 * Encrypts the given message using the Baconian cipher.
	 * 
	 * @param message the message to encrypt
	 * @return the encrypted message
	 */
	public static String encrypt(String message) {
		message = message.toLowerCase().replaceAll("\\p{Punct}|\\s", "");
		StringBuilder ciphertext = new StringBuilder();
		for (char c : message.toCharArray()) {
			if (c == 'j') {
				String binary = Integer.toBinaryString(alphabet.indexOf('i'));
				ciphertext.append(getSequence(binary));
			} else if (c == 'u') {
				String binary = Integer.toBinaryString(alphabet.indexOf('v'));
				ciphertext.append(getSequence(binary));
			} else if (alphabet.indexOf(c) >= 0) {
				String binary = Integer.toBinaryString(alphabet.indexOf(c));
				ciphertext.append(getSequence(binary));
			}
		}
		return ciphertext.toString();
	}

	/**
	 * Decrypts the given message using the Baconian cipher.
	 * 
	 * @param message the message to decrypt
	 * @return the decrypted message
	 */
	public static String decrypt(String message) {
		message = message.toLowerCase().replaceAll("\\p{Punct}|\\s", "");
		StringBuilder plaintext = new StringBuilder();
		for (int i = 0; i + 4 < message.length(); i += 5) {
			String sequence = message.substring(i, i + 5);
			String binary = sequence.replace('a', '0').replace('b', '1');
			plaintext.append(alphabet.charAt(Integer.parseInt(binary, 2)));
		}
		return plaintext.toString();
	}

}
