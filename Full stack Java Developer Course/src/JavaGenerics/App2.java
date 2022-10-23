package JavaGenerics;


class DataT<K,V>{
	private K Key;
	private V Value;
	
	public DataT(K Key, V Value)
	{
		this.Key = Key;
		this.Value = Value;
	}

	public K getKey() {
		return Key;
	}

	public void setKey(K key) {
		Key = key;
	}

	public V getValue() {
		return Value;
	}

	public void setValue(V value) {
		Value = value;
	}

	@Override
	public String toString() {
		return "Data [Key=" + Key + ", Value=" + Value + "]";
	}
	
	
	
}

class GenericMethods {
	
	public <E,N> void display(E element, N number)
	{
		System.out.println(element);
		System.out.println(number);
	}
}

public class App2 {

	public static void main(String[] args) {
		
		DataT<Integer,String> data = new DataT<Integer,String>(1,"nish");
	    
		System.out.println(data);
		
		GenericMethods m = new GenericMethods();
		
		m.display("hey", 2);
		m.display(2.3, 'c');
	}
}
