package ���﷨����;

import java.util.Arrays;
import java.util.List;

public class Lambad {
	public static void main(String[] args) {
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		List<String> keyword = Arrays.asList(keywordString); // ��keywordStringת��Ϊlist����
		keyword.forEach((word) -> System.out.print(word + " "));
		// ����forEachʹ��lambad���ʽ���keyword�ȼ���
		// for (String word : keyword) {
		// System.out.print(word + " ");
		// }
		keyword.forEach(System.out::print);// ʹ��˫ð�����������::��ʾ���õķ���
	}
}
