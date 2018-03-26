package 习题3;

import java.io.*;
import java.util.*;

public class CountOccurrenceOfWord implements Comparable<CountOccurrenceOfWord> {
    public String word;
    public int count;

    public CountOccurrenceOfWord(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public int compareTo(CountOccurrenceOfWord other) {
        return this.count - other.count;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        try (BufferedReader in = new BufferedReader(new FileReader(args[0]))) {
            String input = null;
            while ((input = in.readLine()) != null) {
                String[] words = input.split("[ \n\t\r.,;:'!?(){}]");
                for (int i = 0; i < words.length; i++) {
                    String word = words[i].toLowerCase();
                    if (!map.containsKey(word)) {
                        map.put(word, 1);
                    } else {
                        int value = map.get(word);
                        value++;
                        map.put(word, value);
                    }
                }
            }
            ArrayList<CountOccurrenceOfWord> list = new ArrayList<CountOccurrenceOfWord>();

            Set<String> mapSet = map.keySet();
//			Iterator<String> it = mapSet.iterator();
//
//			while (it.hasNext()) {
//				String name = it.next();
//				CountOccurrenceOfWord cw = new CountOccurrenceOfWord(name, map.get(name));
//				list.add(cw);
//			}
            for (String s : mapSet) {
                CountOccurrenceOfWord cw = new CountOccurrenceOfWord(s, map.get(s));
                list.add(cw);
            }

            Collections.sort(list);
            System.out.println("次数\t\t单词");
            for (CountOccurrenceOfWord c : list) {
                System.out.println(c.count + "\t\t" + c.word);
            }
//			list.forEach((c)->System.out.println(c.count + " " + c.word));
//			list.forEach(System.out::println);
        }
    }
}