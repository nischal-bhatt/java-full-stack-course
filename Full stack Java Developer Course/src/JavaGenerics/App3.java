package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

class DataNew {
	public <E> void printListData(List<E> list)
	{
		for (E elem : list)
		{
			System.out.println(elem);
		}
	}
	
	
	public <E> void printArrayData (E[] arraydata)
	{
		for (E elem : arraydata)
		{
			System.out.println(elem);
		}
	}
}

public class App3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		DataNew a = new DataNew();
		a.printListData(list);
		
		List<String> strings = new ArrayList<>();
		strings.add("hey");
		
		a.printListData(strings);
	}
}
