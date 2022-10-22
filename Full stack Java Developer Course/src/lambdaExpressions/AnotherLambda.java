package lambdaExpressions;

public class AnotherLambda {
	public static void main(String[] args) {
		int y = 20;
		//y++;
		//must be effectively final
		a A = () -> System.out.println(y);
		A.s();
	}

}

@FunctionalInterface
interface a {
	public void s();
}
