package dev.learning.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Encryption {

	private static HashMap<String, String> map = null;

	public static void main(String[] args) {
		String stringEncryptor = stringEncryptor("ru78e@7@", "saral345");
		System.out.println("encryption: " + stringEncryptor);
		System.out.println("decryption: " + stringDecryptor(stringEncryptor));
	}

	public static HashMap<String, String> getMap() {
		if (map == null) {
			prepareMapObject();
		}

		return map;
	}

	/**
	 * Gets the password in encrypted form
	 * 
	 * @param userPassword
	 * @param userId
	 * @return the encryptedPassword {@link String}
	 */
	public static String stringEncryptor(String userPassword, String userId) {
		StringBuilder encryptedPassword = new StringBuilder();
		Set<Entry<String, String>> entrySet = getMap().entrySet();
		for (int i = 0; i < userPassword.length(); i++) {
			String charAt = String.valueOf(userPassword.charAt(i));
			if (map.containsKey(charAt)) {
				Iterator<Entry<String, String>> iterator = entrySet.iterator();
				while (iterator.hasNext()) {
					Entry<String, String> entry = iterator.next();
					if (entry.getKey().equals(charAt)) {
						encryptedPassword.append(entry.getValue());
						break;
					}
				}
			}
		}

		return userId + encryptedPassword.reverse().toString();
	}

	/**
	 * Gets the password in decrypted form
	 * 
	 * @param encryptedPassword
	 * @return the userPassword {@link String}
	 */
	public static String stringDecryptor(String encryptedPasswordFromDb) {
		StringBuilder encryptedPassword = new StringBuilder(
				encryptedPasswordFromDb.substring(8,
						encryptedPasswordFromDb.length())).reverse();

		Set<Entry<String, String>> entrySet = getMap().entrySet();

		for (int i = 0; i < encryptedPassword.length(); i++) {
			String charAt = String.valueOf(encryptedPassword.charAt(i));
			if (map.containsValue(charAt)) {
				Iterator<Entry<String, String>> iterator = entrySet.iterator();
				while (iterator.hasNext()) {
					Entry<String, String> entry = iterator.next();
					if (entry.getValue().equals(charAt)) {
						encryptedPassword.replace(i, i + 1, entry.getKey());
						break;
					}
				}
			}
		}
		return encryptedPassword.toString();
	}

	/**
	 * Prepares the HashMap which will be used for encrypting/decrypting
	 * userPassword.
	 * 
	 */
	private static void prepareMapObject() {
		map = new HashMap<String, String>();
		map.put("a", "1");
		map.put("b", "5");
		map.put("c", "4");
		map.put("d", "0");
		map.put("e", "8");
		map.put("f", "2");
		map.put("g", "7");
		map.put("h", "3");
		map.put("i", "9");
		map.put("j", "6");
		map.put("k", "!");
		map.put("l", ".");
		map.put("m", "*");
		map.put("n", "$");
		map.put("o", "%");
		map.put("p", "#");
		map.put("q", "^");
		map.put("r", "@");
		map.put("s", "&");
		map.put("t", "-");
		map.put("u", "_");
		map.put("v", "+");
		map.put("w", "=");
		map.put("x", "~");
		map.put("y", "`");
		map.put("z", "|");
		map.put("A", "u");
		map.put("B", "r");
		map.put("C", "m");
		map.put("D", "l");
		map.put("E", "q");
		map.put("F", "z");
		map.put("G", "y");
		map.put("H", "s");
		map.put("I", "n");
		map.put("J", "v");
		map.put("K", "e");
		map.put("L", "c");
		map.put("M", "d");
		map.put("N", "i");
		map.put("O", "A");
		map.put("P", "f");
		map.put("Q", "w");
		map.put("R", "L");
		map.put("S", "O");
		map.put("T", "h");
		map.put("U", "t");
		map.put("V", "D");
		map.put("W", "B");
		map.put("X", "R");
		map.put("Y", ":");
		map.put("Z", "E");
		map.put("0", "C");
		map.put("1", "G");
		map.put("2", "Y");
		map.put("3", "U");
		map.put("4", "K");
		map.put("5", "M");
		map.put("6", "S");
		map.put("7", "H");
		map.put("8", "J");
		map.put("9", "I");
		map.put("`", "P");
		map.put("~", "N");
		map.put("!", "F");
		map.put("@", "Q");
		map.put("#", "W");
		map.put("$", ">");
		map.put("%", "<");
		map.put("^", "{");
		map.put("&", "}");
		map.put("*", "[");
		map.put("(", "]");
		map.put(")", "\\");
		map.put("_", ";");
		map.put("-", "\"");
		map.put("+", "'");
		map.put("=", ",");
		map.put("{", "/");
		map.put("}", "?");
		map.put("[", "(");
		map.put("]", ")");
		map.put("|", "T");
		map.put("\\", "Z");
		map.put(";", "X");
		map.put(":", "x");
		map.put("'", "V");
		map.put("<", "b");
		map.put(">", "k");
		map.put(",", "j");
		map.put(".", "g");
		map.put("?", "a");
		map.put("/", "p");
		map.put("\"", "o");
	}

}
