package oct2020;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) 
	{
		/*ArrayList<Integer>ar =new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(500);
		ar.add(400);
		System.out.println(ar.get(1));
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));*/
			ArrayList<String> ab=new ArrayList<String>();
			ab.add("abc");
			ab.add("bcd");
			ab.add("bfsdsf");
			ab.add("vdhjvdsu");
			ab.forEach(name-> System.out.println(name));
			ab.forEach(z->System.out.println(z.toUpperCase()));
		}
	}


