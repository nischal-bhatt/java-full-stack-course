package ObjectOriented;

public class Composition {
	public static void main(String[] args) {

		Screen s = new Screen(89);
		Latop p = new Latop();
		p.setScreen(s);
		
		System.out.println(p.getScreen().getSize());
	    System.out.println(p);
	}
}


class Latop {
	
	private Screen screen;

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Latop [screen=" + screen + "]";
	}
	
	
	
	
}

class Screen {
	private int size;

	public Screen(int size)
	{
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Screen [size=" + size + "]";
	}
	
	
	
	
}
