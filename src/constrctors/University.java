package constrctors;

import java.util.ArrayList;

public class University {
	String name;
	String country;
	int stablishedDate;
	ArrayList<String>Listofcourse;
	
	
public University(String name, String country, int stablishedDate,ArrayList<String> listofcourse) 
{
	
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		Listofcourse = listofcourse;
	}

	public University(String name, int stablishedDate) 
	{
	
	this.name = name;
	this.stablishedDate = stablishedDate;
   }
	public University(String name) 
	{
	
	this.name = name;
   }
	public University(String name, String country) 
	{
	
	this.name = name;
	this.country = country;
    }

	public University(String name, String country, int stablishedDate) 
	{
	
	this.name = name;
	this.country = country;
	this.stablishedDate = stablishedDate;
   }
	public University(String name, String country,ArrayList<String> listofcourse) {
		
		this.name = name;
		this.country = country;
		Listofcourse = listofcourse;
	}

	public static void main(String[] args) 
	{
		
	    ArrayList<String>course=new ArrayList<String>();
	    course.add("CSE");
	    course.add("IT");
	    course.add("ECE");
	    
		University u1= new University("JNTU");
		System.out.println(u1.name);
		
		University u2= new University("JNTU","INDIA",course);
		System.out.println(u2.name+ " "+u2.country+ " "+u2.Listofcourse);
		
		University u5= new University("MIT","USA");
		System.out.println(u5.name+ " "+u5.country);
		
		University u3= new University("JNTU","INDIA",1972,course);
		System.out.println(u3.name+ " "+u3.country+ " "+u3.stablishedDate+ " "+u3.Listofcourse);
		
		University u6= new University("MIT","USA",1861);
		System.out.println(u6.name+ " "+u6.country+ " "+u6.stablishedDate);
		
		
		

	}

	
}
