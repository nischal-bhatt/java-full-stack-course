package org.nish;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {

	public static void main(String[] args) throws FileNotFoundException {
		//someMethod();
		someMethod2();
	}
	
	public static void someMethod() throws FileNotFoundException
	{
		FileReader in = new FileReader("file.txt");
		System.out.println("message from method");
	}
	
	public static void someMethod2()
	{
		throw new ArithmeticException();
	}
}
