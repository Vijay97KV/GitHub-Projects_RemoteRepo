package scannerClass;

import java.util.Scanner;

public class Scan_UserName_UserAge_And_UserPhno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter user name");
		String name = sc.nextLine();// reads n store string value
		System.out.println("UserName: " + name);// prints string value
		System.out.println();

		System.out.println("please enter user Age");
		int age = sc.nextInt(); // reads n store int value
		System.out.println("UserAge: " + age); // prints user age
		System.out.println();

		System.out.println("please enter user contact Number");
		long phno = sc.nextLong(); // reads n store int value 
		System.out.println("UserPhno: " + phno);// prints user phoneNumber
		System.out.println();

	}

}
