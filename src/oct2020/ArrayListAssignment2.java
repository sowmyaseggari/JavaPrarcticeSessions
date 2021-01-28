package oct2020;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment2 {

	public static void main(String[] args) 
	{
		ArrayList<String>src=new ArrayList<String>();
		src.add("pink");
		src.add("blue");
		src.add("black");
		src.add("red");
		src.add("yellow");
		src.add("white");
		src.add("green");
		src.add("grey");
		src.add("purpul");
		src.add("orange");
		src.add("indigo");
		src.add("silver");
		src.add("gold");
		
		System.out.println(src);
		src.add(0,"white1");
		src.add(10,"lightgreen");
		System.out.println(src);
		System.out.println(src.get(4));
		src.set(4, "lightblack");
		System.out.println(src);
		src.remove(3);
		System.out.println(src);
		System.out.println(src.contains("green"));
		Collections.sort(src);
		System.out.println(src);
		System.out.println("..........");
		
		Collections.reverse(src);
		System.out.println(src);
		System.out.println(".......");
		System.out.println("ORIGINAL LIST" + src);
		
		
		src.subList(0, 3);
		System.out.println("List of extract: " +src.subList(0, 3));
		Collections.swap(src, 1, 2);
		System.out.println(src);
		//src.removeAll(src);
		//System.out.println(src);
		src.trimToSize();
		System.out.println(src);
		
		int size=src.size();
		for(int a=0;a<size;a++)
			System.out.println(src.get(a));
		System.out.println("Size of list = "
                + size);
		
	}

}
