package JavaGenerics;

class DataNewOne<K,V> {
	private K key;
	private V value;
	public DataNewOne(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends Nish,N extends Number> void display(E element, N number)
	{
		System.out.println(element);
		System.out.println(number);
	}
	
	
}

class Nish{
	public String toString() {
		return "nish";
	}
}


public class App4 {

	public static void main(String[] args) {
		
		DataNewOne<String,Integer> a = new DataNewOne<String,Integer>("hi",1);
		a.display(new Nish(), 2);
	}
}
