
public class TypeCastingProblems {

	public static void main(String[] args) {
		double v2 = 20.0123456789d;
		float v1 = (float)v2;
		System.out.println(v1);
		//loss of precision
	}
}
