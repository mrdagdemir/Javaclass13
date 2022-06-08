package comsyntaxclass13;

public class HomeWork3String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			// How would you swap  2 strings without a temporary variable?
			
			String x = "old";
			String y = "new";
			
	        y=x+y;                // oldnew
	        x=y.replace(x, "");   // new
	        y=y.replace(x, "");   // old
	        
	        System.out.println(x);
	        System.out.println(y);
	        
		}

	}
	
