package dev.learning.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class WordCount {

	public static void countWords(String fileName, String searchWord) {
		if (StringUtils.isEmpty(fileName) || StringUtils.isEmpty(searchWord)) {
			throw new IllegalArgumentException(
					"Text and searchWord cannot be empty or null");
		}

		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
