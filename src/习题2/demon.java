package ϰ��2;

import java.io.*;
import java.util.*;

public class demon {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TreeSet<String> treeSet = new TreeSet<>();// ����һ���ϼ�����
		try (BufferedReader in = new BufferedReader(new FileReader(args[0]))) {
			String input = null;
			while ((input = in.readLine()) != null) {
				String[] str = input.trim().split("[^a-zA-Z]");// ����������ʽ�ָ������ʽ������ĸ������κ�Ԫ��
				Collections.addAll(treeSet, str);
				treeSet.remove("");// �Ƴ���Ԫ��
			}
		}
		System.out.println(treeSet);
	}
}
