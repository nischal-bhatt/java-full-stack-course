import java.math.BigDecimal;

public class BigDecimalClass {

	public static void main(String[] args) {
		double x = 1.45;
		double y = 2.55;
		System.out.println(x+y);
		
		
		System.out.println(1.0/3);
		
		System.out.println(1.05 + 2.55);
		
		
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		System.out.println(d1.add(d2));
		
	}
}
