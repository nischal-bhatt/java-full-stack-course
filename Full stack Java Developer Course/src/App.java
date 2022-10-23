
public class App {

	public static void main(String[] args) {
		TestStatic a = new TestStatic();
		System.out.println(a.getStaticVariable());
		
		TestStatic b = new TestStatic();
		b.setStaticVariable(24);
		System.out.println(b.getStaticVariable());
		
		
		TestStatic c = new TestStatic();
		TestStatic.setTestStaticVar(88);
		
		TestStatic d = new TestStatic();
		System.out.println(d.getTestStaticVar());
	}
}
