package comsyntaxclass13;

public class HomeWork4String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * How would you check if String is palindrome or not? 
		 * aba=> true Abbc =>false
		 */

		String str = "aba";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			reverse += str.charAt(i);
		}

		System.out.println(str.equalsIgnoreCase(reverse));
	}

}
		
	
