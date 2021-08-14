package com.junitsample;
import  com.LamdaExpression.*;


import static org.junit.jupiter.api.Assertions.*;

import java.awt.SecondaryLoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class userError extends Exception {
	public userError(String str) {
		super(str);
	}
}

public class UC12 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		try {
			UC1 uc1 = new UC1();
			UC2 uc2 = new UC2();
			UC3 uc3 = new UC3();
			UC4 uc4 = new UC4();
			UC9 uc9 = new UC9();

			int first=uc1.firstName("Pratik");
			int last=uc2.lastName("Talele");
			int mail=uc3.email("abc.xyz@bl.co.in");
			int phone =uc4.phoneNumber("91 8421863149");
			int pass=uc9.password("A0*aaaaaa");

			assertEquals(1, first);			
			assertEquals(1, last);
			assertEquals(1, mail);
			assertEquals(1, phone);
			assertEquals(1, pass);

			if (uc1.firstName("Pratik") == 0 || uc2.lastName("Talele") == 0 || uc3.email(" xyz@bl.co.in") == 0
					|| uc4.phoneNumber("91 8421863149") == 0 || uc9.password("A0*aaaaaa") == 0) {
				throw new userError(" :: user failed ");

			} else {
				System.out.println("valid user :)");
			}

	}catch (Exception e) {
		System.out.println("found :: "+e);
	}

}
}
