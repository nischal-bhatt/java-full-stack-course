package org.nish;

public class App1 {

	public static void main(String[] args) {
		int x;
		String y="";
		try {
			x = 10/0;
			y.charAt(2);
		}catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("in arithmetic exception");
		}catch (Exception e)
		{
			System.out.println("in generic exception");
		}finally {
			System.out.println("close connection");
		}
	}
}
