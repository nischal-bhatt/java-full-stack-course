package org.nish;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.case1(1, 0);
		app.case2(1, 0);
	}
	
	public void case1(int x , int y)
	{
		if (y != 0)
		{
		System.out.println(x/y);
		}else {
			System.out.println("valye of y is 0");
		}
	}
	
	public void case2(int x , int y)
	{
		try {
		System.out.println(x/y);
		}catch (Exception e)
		{
			System.out.println("value of y is zero");
		}
	}
}
