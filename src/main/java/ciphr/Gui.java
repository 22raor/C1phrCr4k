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
package ciphr;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import ciphr.ciphers.A1Z26;
import ciphr.ciphers.Atbash;
import ciphr.ciphers.Baconian;
import ciphr.ciphers.Caesar;
import ciphr.ciphers.Vigenere;

public class Gui {

	private static final String[] options = new String[] { "Encrypt", "Decrypt" };

	public Gui() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e3) {
			e3.printStackTrace();
		}

		runDropDown();
	}

	public void runDropDown() {
		Object[] ciphers = { "Atbash", "A1Z26", "Baconian", "Caesar", "Vigenere" };
		String ciphr = (String) JOptionPane.showInputDialog(null, "Choose a cipher", "Cipher Selector",
				JOptionPane.QUESTION_MESSAGE, null, ciphers, ciphers[0]);

		switch (ciphr) {
		case "Atbash":
			atbash();
			break;
		case "A1Z26":
			a1z26();
			break;
		case "Baconian":
			baconian();
			break;
		case "Caesar":
			caesar();
			break;
		case "Vigenere":
			vigenere();
			break;

		}

	}

	public void atbash() {
		JPanel pane = new JPanel();
		JTextField message = new JTextField(10);
		pane.add(new JLabel("Message: "));
		pane.add(message);

		int result = JOptionPane.showOptionDialog(null, pane, "Atbash Cipher", JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, null);

		if (result == 0) {
			JOptionPane.showMessageDialog(null, "Encrypted Message:\r\n\r\n" + Atbash.translate(message.getText()));
		} else {
			JOptionPane.showMessageDialog(null, "Decrypted Message:\r\n\r\n" + Atbash.translate(message.getText()));
		}
	}

	public void a1z26() {
		JPanel pane = new JPanel();
		JTextField message = new JTextField(10);
		pane.add(new JLabel("Message: "));
		pane.add(message);

		int result = JOptionPane.showOptionDialog(null, pane, "A1Z26 Cipher", JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, null);

		if (result == 0) {
			JOptionPane.showMessageDialog(null, "Encrypted Message:\r\n\r\n" + A1Z26.encode(message.getText()));
		} else {
			JOptionPane.showMessageDialog(null, "Decrypted Message:\r\n\r\n" + A1Z26.decode(message.getText()));
		}
	}

	public void baconian() {
		JPanel pane = new JPanel();
		JTextField message = new JTextField(10);
		pane.add(new JLabel("Message: "));
		pane.add(message);

		int result = JOptionPane.showOptionDialog(null, pane, "Baconian Cipher", JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, null);

		if (result == 0) {
			JOptionPane.showMessageDialog(null, "Encrypted Message:\r\n\r\n" + Baconian.encrypt(message.getText()));
		} else {
			JOptionPane.showMessageDialog(null, "Decrypted Message:\r\n\r\n" + Baconian.encrypt(message.getText()));
		}
	}

	public void caesar() {
		JPanel pane = new JPanel();
		JTextField message = new JTextField(10);
		JTextField shift = new JTextField(10);
		pane.add(new JLabel("Message: "));
		pane.add(message);
		pane.add(new JLabel("Shift: "));
		pane.add(shift);

		int a = JOptionPane.showOptionDialog(new JFrame(), pane, "Caesar Cipher", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, null);

		if (a == 0) {
			JOptionPane.showMessageDialog(null, "Encrypted Message:\r\n\r\n"
					+ Caesar.encrypt(message.getText(), Integer.parseInt(shift.getText())));
		} else {
			JOptionPane.showMessageDialog(null, "Decrypted Message:\r\n\r\n"
					+ Caesar.decrypt(message.getText(), Integer.parseInt(shift.getText())));
		}
	}

	public void vigenere() {
		JPanel pane = new JPanel();
		JTextField message = new JTextField(10);
		JTextField key = new JTextField(10);
		pane.add(new JLabel("Text: "));
		pane.add(message);
		pane.add(new JLabel("Key: "));
		pane.add(key);

		int a = JOptionPane.showOptionDialog(new JFrame(), pane, "Vigenere Cipher", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, null);

		if (a == 0) {
			JOptionPane.showMessageDialog(null,
					"Encrypted Message:\r\n\r\n" + Vigenere.encrypt(message.getText(), key.getText(), true));
		} else {
			JOptionPane.showMessageDialog(null,
					"Decrypted Message:\r\n\r\n" + Vigenere.decrypt(message.getText(), key.getText(), true));
		}

	}

}