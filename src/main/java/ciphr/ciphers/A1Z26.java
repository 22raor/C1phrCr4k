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

import java.util.stream.Collectors;

public class A1Z26 {
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * Encodes a given message with the {@link A1Z26} cipher
	 * 
	 * @param message to be encoded
	 * @return encoded string
	 */
	public static String encode(String message) {
		return message.toUpperCase().chars().mapToObj(c -> (char) c)
				.map(c -> !alphabet.contains(c + "") ? c + "" : (1 + alphabet.indexOf(c))).map(c -> c.toString() + "-")
				.collect(Collectors.joining()).replaceFirst(".$", "");
	}

	public static String decode(String message) {
		String a = "";
		for (String b : message.split("-")) {

			try {
				a += alphabet.charAt(Integer.parseInt(b) - 1);
			} catch (Exception e) {
				a += b;
			}

		}

		return a;

	}

}
