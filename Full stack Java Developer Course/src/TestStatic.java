
public class TestStatic {

	int staticVariable = 0;
	
	private static int testStaticVar = 0;

	//above var is shared among all objs
	public int getStaticVariable() {
		return staticVariable;
	}

	public void setStaticVariable(int staticVariable) {
		this.staticVariable = staticVariable;
	}

	public  int getTestStaticVar() {
		return testStaticVar;
	}

	public static void setTestStaticVar(int testStaticVar) {
		TestStatic.testStaticVar = testStaticVar;
	}
	
	
	
	
}
