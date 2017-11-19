package 习题2;

import java.io.*;
import java.util.*;

public class demon {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TreeSet<String> treeSet = new TreeSet<>();// 创建一个合集对象
		try (BufferedReader in = new BufferedReader(new FileReader(args[0]))) {
			String input = null;
			while ((input = in.readLine()) != null) {
				String[] str = input.trim().split("[^a-zA-Z]");// 利用正则表达式分割，正则表达式除开字母以外的任何元素
				Collections.addAll(treeSet, str);
				treeSet.remove("");// 移除空元素
			}
		}
		System.out.println(treeSet);
	}
}
