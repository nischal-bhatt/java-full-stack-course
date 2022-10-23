package Scopes;

public class App {
	public int i = 100;
    public static void main(String[] args) {
    	
    	
    	
    	for ( new App().i =0; new App().i<10 ; new App().i++)
    	{
    		System.out.println("printing");
    	}
    	
    	{
    		int i = 700;
    		System.out.println(i);
    		
    	}
    	System.out.println(new App().i); 
	}
	
}
