# C1phrCr4k
C1phrCr4k is a simple Java GUI for encrypting and decrypting popular ciphers.

## Usage
In src/main/java, there is a Main class. Running the main method inside this class will launch the GUI, which prompts you to select one of the available ciphers in a dropdown menu. After selecting one and clicking "OK", you will be prompted to enter your message and any other necessary information to encrypt/decrypt using the chosen cipher.

The current ciphers are:

## Atbash
Monoalphabetic cipher that reverses the alphabet. 
|   A| B  | C  | D  |E   |F   |G   |H   |I   | J  |  K|  L| M |  N|O   |P   |Q   | R | S | T | U | V | W | X | Y | Z |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
| Z |  X | Y  | W  |V   |U   | T  |S   | R  | Q  | P  | O  | N  |M   |L   | K  | J  | I  | H  |G   |F   | E  | D  |C   | B  | A  |

## A1Z26
Direct substitution cipher that replaces each letter with its index in the alphabet 
|   A| B  | C  | D  |E   |F   |G   |H   |I   | J  |  K|  L| M |  N|O   |P   |Q   | R | S | T | U | V | W | X | Y | Z |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
| 1 |  2 | 3  | 4  |5   |6   | 7  |8   | 9  | 10  | 11  | 12  | 13  |14   |15  |16  | 17  | 18  | 19  |20   |21   | 22  | 23  |24   | 25  | 26  |

## Baconian
Cipher that uses five letter strings to represent each letter as its index in the alphabet in binary, using A's for 0's and B's for 1's
|   A| B  | C  | D  |E   |F   |G   |H   |I/J   |   K|  L| M |  N|O   |P   |Q   | R | S | T | U/V |  W | X | Y | Z |
| ------------ |   ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
| AAAAA |  AAAAB | AAABA  | AAABB  |AABAA   |AABAB   | AABBA  |AABBB   | ABAAA  | ABAAB  | ABABA  | ABABB  | ABBAA  |ABBAB   |ABBBA  |ABBBB  | BAAAA  | BAAAB  | BAABA  |BAABB   |BABAA   | BABAB  | BABBA  |BABBB   | 
## Caesar
The Caesar cipher is a substitution cipher in which all letters are shifted down the alphabet by a given amount. For example, with a shift of 2, A would become C, B would become D, etc. 
## Vigenère
The Vigenère Cipher can be used to encrypt and decrypt messages using the following 26x26 grid.

| |A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z
:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:
**A**|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z
**B**|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A
**C**|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B
**D**|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C
**E**|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D
**F**|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E
**G**|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F
**H**|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G
**I**|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H
**J**|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I
**K**|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J
**L**|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K
**M**|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L
**N**|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M
**O**|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N
**P**|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O
**Q**|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P
**R**|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q
**S**|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R
**T**|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S
**U**|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T
**V**|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U
**W**|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V
**X**|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W
**Y**|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X
**Z**|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y

Although the table may look daunting, it's really just a series of Caesar ciphers!

Here is how the Vigenère Cipher is used to encrypt a message in plain text:

**Step 1:** 
Using the key word/phrase, generate a key with the same length as the plain text. Start by removing all spaces and punctuation.
If the key is longer than the plain text, start from the beginning of the keyword and use as many letters as needed for the key. If 
the plain text is longer than the key (as is usually the case), once the end of the keyword is reached, just repeat the keyword as many
times as necessary.

**Step 2:**
Now, since the plain text and the key have the same length, we can assign each letter in the plain text to a letter in the key.

**Step 3:**
Each letter in the key denotes a shift, where A=0, B=1, C=2, and so on, up to Z=25. So now, since each letter in the plain text
message has been assigned a shift, simply apply the corresponding shift to each letter to obtain your encrypted message.

This can be reversed to decrypt messages; instead of adding the shifts, subtract them.

