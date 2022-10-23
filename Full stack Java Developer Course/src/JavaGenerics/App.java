package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

class Data {
	private Object obj;

	public Data(Object obj) {
		
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
	
}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
	
}


public class App {

	public static void main(String[] args) {
		
		Data data = new Data("some string");
		
		String var = (String)data.getObj();
		System.out.println(var);
		//int var2 = (Integer)data.getObj();
		//System.out.println(var2);
		//run time error
		
		
		GenericClass<String> a = new GenericClass<String>("stringdata");
		String variableString = a.getData();
	    System.out.println(variableString);
	
	
	    List<GenericClass<String>> elements = new ArrayList<>();
	    
	    elements.add(new GenericClass<String>("hey"));
	    elements.add(new GenericClass<String>("hey1"));
	    
	    elements.add(new GenericClass<String>("hey2"));
	    
	    elements.add(new GenericClass<String>("hey3"));
	    
	    for (GenericClass<String> a1 : elements)
	    {
	       System.out.println(a1.getData().length());
	    }
	}
}
