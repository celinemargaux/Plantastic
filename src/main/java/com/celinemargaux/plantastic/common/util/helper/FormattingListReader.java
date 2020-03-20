package com.celinemargaux.plantastic.common.util.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.celinemargaux.plantastic.Plantastic;

public class FormattingListReader {
	private static List<String> stringList = new ArrayList<>();
	
	public static List<String> main (String filePath) {
		readStringList(filePath);
		formatStringList();
		return stringList;
	}


	public static void readStringList(String filePath) {
		try (FileReader fileReader = new FileReader(filePath)) {
			char[] buffer = new char[1024];
			while (fileReader.ready()) {
				fileReader.read(buffer);
			}
			StringBuilder testerString = new StringBuilder();
			StringBuilder bufferString = new StringBuilder();
			for (char letter : buffer) {
				if (!Character.isWhitespace(letter)) {
					bufferString.append(letter);
				} else {
					testerString.append(letter);
					if (testerString.toString().matches("\n")) {
						stringList.add(bufferString.toString());
						bufferString.delete(0, bufferString.length() - 1);
					}
				}
			}

		} catch (FileNotFoundException e) {
			Plantastic.LOGGER.error(e.getStackTrace());
		} catch (IOException e) {
			Plantastic.LOGGER.error(e.getStackTrace());
		}
	}

	public static void formatStringList() {
		for (String string : stringList) {
			string.replaceAll(" ", "_");
			string.toLowerCase();
		}
	}

}
