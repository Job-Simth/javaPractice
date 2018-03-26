package 作业题目31;

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
			// 输入年份
			System.out.println("Enter the year: ");

			String year = s.next();
			String a = "D:\\birth\\";
			String b = ".txt";
			// 将字符串拼接，来查询需要的文本文件
			File file = new File(a + year + b);

			Scanner input = new Scanner(file);
			// 输入查询性别
			System.out.println("Enter the gender: ");
			String sex = s.next();
			// 输入查询姓名
			System.out.println("Enter the name: ");
			String name = s.next();

			// 读取文本文件
			while (input.hasNext()) {
				int rank = input.nextInt();
				String man = input.next();
				// int manNum = input.nextInt();
				String woman = input.next();
				// int womanNum = input.nextInt();
				// 在文件中匹配要查询的信息
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
			// 输出结果
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
