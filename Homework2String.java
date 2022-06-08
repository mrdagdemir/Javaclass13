package comsyntaxclass13;

import java.util.Scanner;

public class Homework2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a String that will hold a sentence. Write a program 
		 * to get a new String without any spaces.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please write a sentence");
		String str = scanner.nextLine();
		String str1 = str.replace(" ", "");
		System.out.println(str1);
		scanner.close();

	}


	

}
