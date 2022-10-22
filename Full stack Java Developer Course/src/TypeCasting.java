
public class TypeCasting {
	public static void main(String[] args) {
            
		short x = 5;
		int y = 10;
		
		//x = y;
		y=x; //short can be stored in int no problem - widening - implicit
		
		
		int age = 24;
		byte r = 2;
		r = (byte)age;
		//explicit - because byte can easily store the value of 24
	}
}
