package lambdaExpressions;

import java.util.function.IntPredicate;

public class PredicatesExamples {

	public static void main(String[] args) {
		IntPredicate lessThan18 = 
				(c) -> c < 18;
				
				System.out.println(lessThan18.test(2));
	
	     int JohnsAge = 3;
	     
	     if(lessThan18.test(JohnsAge))
	     {
	    	 System.out.println("mosj");
	     }else {
	    	 System.out.println("[r");
	     }
	
	}
}
