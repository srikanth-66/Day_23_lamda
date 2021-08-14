package com.junitsample;
import  com.LamdaExpression.*;

@FunctionalInterface
interface FirstName{
	void first();
}

@FunctionalInterface
interface LastName{
	void last();
}

@FunctionalInterface
interface Email{
	void email();
}

@FunctionalInterface
interface Mobile{
	void mobile();
}

@FunctionalInterface
interface Password{
	void password();
}
public class UC13 {
	public void checkDetailsUsingLambda() {
		//creating anonymous function
		FirstName firstName=()->{
			UC1 uc1=new UC1();
			uc1.firstName("pratik");
		};

		LastName lastName=()->{
			UC2 uc2=new UC2();
			uc2.lastName("talele");
		};

		Email email=()->{
			UC3 uc3=new UC3();
			uc3.email("pratik22@gmail.com");
		};

		Mobile mobile=()->{
			UC4 uc4=new UC4();
			uc4.phoneNumber("91 8421863149");
		};

		Password password=()->{
			UC9 uc9=new UC9();
			uc9.password("A*0215652545");
		};

		firstName.first();
		lastName.last();
		email.email();
		mobile.mobile();
		password.password();
	}
}
