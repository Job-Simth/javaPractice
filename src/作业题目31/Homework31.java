package ��ҵ��Ŀ31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework31 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner use = new Scanner(System.in);
		String con = "Y";
		while (con.equals("Y")) {
			Scanner s = new Scanner(System.in);
			int number = 0;
			int count = 0;
			String manSex = "M";
			String womanSex = "F";
			// �������
			System.out.println("Enter the year: ");

			String year = s.next();
			String a = "D:\\birth\\";
			String b = ".txt";
			// ���ַ���ƴ�ӣ�����ѯ��Ҫ���ı��ļ�
			File file = new File(a + year + b);

			Scanner input = new Scanner(file);
			// �����ѯ�Ա�
			System.out.println("Enter the gender: ");
			String sex = s.next();
			// �����ѯ����
			System.out.println("Enter the name: ");
			String name = s.next();

			// ��ȡ�ı��ļ�
			while (input.hasNext()) {
				int rank = input.nextInt();
				String man = input.next();
				// int manNum = input.nextInt();
				String woman = input.next();
				// int womanNum = input.nextInt();
				// ���ļ���ƥ��Ҫ��ѯ����Ϣ
				if (man.equals(name) && sex.equals(manSex)) {
					number = rank;
					count = 1;
					break;
				} else if (woman.equals(woman) && sex.equals(womanSex)) {
					number = rank;
					count = 1;
					break;
				}
			}
			s.close();
			input.close();
			// ������
			if (count == 1) {
				System.out.println(name + " is ranked #" + number + " in year " + year);
			} else {
				System.out.println("the name " + name + " is not ranked in year " + year);
			}
			System.out.println("Enter another inquiry?");
			con = use.nextLine();
		}
		use.close();
	}
}
