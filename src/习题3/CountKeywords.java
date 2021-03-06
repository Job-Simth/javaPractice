package 习题3;

import java.io.*;
import java.util.*;

public class CountKeywords {
    public static void main(String[] args) throws Exception {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a Java source file: ");
        String filename = args[0];

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
        } else {
            System.out.println("File " + filename + " does not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        String[] keywordString = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String word = input.next();
            if (word.contains("//")) // 注释风格为"//"时跳过
                input.nextLine();
            else if (word.contains("/*")) // 注释风格为"/**/"时跳过
                while (input.hasNext() && !input.next().contains("*/")) {

                }
            else if (keywordSet.contains(word))
                count++;
        }
        input.close();
        return count;
    }
}