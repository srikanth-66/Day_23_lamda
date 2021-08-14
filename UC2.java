package com.LamdaExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 {
	// validating last name
		public int lastName(String str) {
			int flag = 0;
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{2}");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("valid last Name");
				return 1;
			} else {
				System.out.println("invalid last Name");
				return 0;
			}

		}
		public static void main(String[] args) {
			// creating uc1 object
			UC1 uc1 = new UC1();
			uc1.firstName("Pratik");
			// creating uc2 object
			UC2 uc2 = new UC2();
			uc2.lastName("Talele");
		}

}