package comsyntaxclass13;

public class HomeWork6String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * How would you reverse a String word by word? for example // 
		 * input=>This is sentence i want to reverse // output=>sihT si 
		 * ecnetnes i tnaw ot esrever
		 */

		String str="This is sentence I want to reverse";
		
         String[] arr=str.split(" ");
		
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		//new StringBuilder(s) object of StringBuilder is craeted
		
		System.out.println();
		//System.out.println(new StringBuilder(str).reverse());
		
		System.out.println("---------");

		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}

