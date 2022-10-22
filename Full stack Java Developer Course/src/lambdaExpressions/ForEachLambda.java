package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {
	
		 List<String> li = new ArrayList<>();
		 li.add("2000");
		 li.add("300");
		 li.add("400");
		 li.add("500");
		 
		 li.forEach(edgeandchristian -> System.out.println(edgeandchristian.length()));
		 
		 
	}
}
