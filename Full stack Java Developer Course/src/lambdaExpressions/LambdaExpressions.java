package lambdaExpressions;

public class LambdaExpressions {

	public static void main(String[] args) {
		int yy = 400;
		Thread a = new Thread(()-> {
		      try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      System.out.println("hhe");
		      
		});
		a.start();
		
		Something s = () -> System.out.println("hey");
		s.write();
		
		
		Something q = () -> {
			int r = 2 + 200;
			System.out.println(yy);
		};
		//System.out.println(r);
		
		q.write();
		
		System.out.println("-----------------------------------------------------");
		
		Something2 abc = (String xxx) -> {
			return xxx;
		};
		
		System.out.println(abc.write("jim"));
		System.out.println("----------");
		
		
	}
}


@FunctionalInterface
interface Something 
{
	public void write();
}

@FunctionalInterface
interface Something2 
{
	public String write(String r);
}
