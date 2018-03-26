package 作业题目21单元4;

import java.util.*;
import java.io.*;

public class Chapter4 {
	public static void main(String args[]) throws Exception {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Java source file: ");
		String filename = input.nextLine();

		File file = new File(filename);
		if (file.exists()) {
			countkeywords(file);
		} else {
			System.out.println("File " + filename + " does not exist");
		}
	}

	public static void countkeywords(File file) throws Exception {
		String[] keywordString = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
		Set<String> keywordset = new HashSet<>(Arrays.asList(keywordString));
		int count = 0;
		int count1 = 0;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			int m = 0;
			String word = input.next();
			for (String p1 = word.substring(0, 1); m < word.length(); m++) {
				count++;
				if (keywordset.contains(p1))
					count1++;
				if (m + 1 < word.length()) {
					p1 = word.substring(m + 1, m + 2);
				}
			}
		}
		count = count - count1;
		System.out.println("有" + count + "个辅音字母");
		System.out.println("有" + count1 + "个元音字母");
	}
}
