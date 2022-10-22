package SOLIDDESIGNPRINCIPLES;

public class Liskov {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle();
		a.setWidth(3);
		a.setHeight(5);
		System.out.println(a.calculateArea());
		
		
		Square b = new Square();
		b.setWidth(3);
		b.setHeight(3); //is this correct?
		System.out.println(b.calculateArea());
	}
}

class Rectangle {

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea()
	{
		return this.width * this.height;
	}

}

class Square extends Rectangle {
	
}
