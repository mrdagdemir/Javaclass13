package comsyntaxclass13;

public class HomeWork1String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a 
		 * Java Class today?” How would you find out how many sentences are 
		 * in that String?
		 */

		String str="Is it saturday? Is it raining? Do we have a Java Class today? i love Java. we go to park today.";
		System.out.println(str.split("[?.!]").length);
		
	}
}