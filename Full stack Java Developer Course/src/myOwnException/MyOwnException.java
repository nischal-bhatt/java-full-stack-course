package myOwnException;

public class MyOwnException {

	public static void main(String[] args) throws UserDefinedException {
		throwUserDefinedException();
	}

	private static void throwUserDefinedException() throws UserDefinedException {
		throw new UserDefinedException();
	}
}
