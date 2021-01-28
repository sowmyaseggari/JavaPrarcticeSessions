package oct2020;

public class Users {
	String name;
	int age;
	String city;

	public static void main(String[] args) 
	{
		Users us1=new Users();
		us1.name="john";
		us1.age=36;
		us1.city="hybd";
		
		
	Users us2=new Users();
	us2.name="mark";
	us2.age=14;
	us2.city="uk";
	
	
	Users us3=new Users();
	us3.name="ram";
	us3.age=67;
	us3.city="usa";
	
	System.out.println(us1.name);
	System.out.println(us1.age);
	System.out.println(us1.city);
	System.out.println(us2.name);
	System.out.println(us2.age);
	System.out.println(us2.city);
	System.out.println(us3.name);
	System.out.println(us3.age);
	System.out.println(us3.city);
	System.out.println("...............");
	us1=us2;
	System.out.println(us1.name);
	System.out.println(us1.age);
	System.out.println(us1.city);
	System.out.println(us2.name);
	System.out.println(us2.age);
	System.out.println(us2.city);
	System.out.println(us3.name);
	System.out.println(us3.age);
	System.out.println(us3.city);
	System.out.println("...............");
	
	us2=us3;
	System.out.println(us1.name);
	System.out.println(us1.age);
	System.out.println(us1.city);
	System.out.println(us2.name);
	System.out.println(us2.age);
	System.out.println(us2.city);
	System.out.println(us3.name);
	System.out.println(us3.age);
	System.out.println(us3.city);
	System.out.println("...............");
	us3=us1;
	System.out.println(us1.name);
	System.out.println(us1.age);
	System.out.println(us1.city);
	System.out.println(us2.name);
	System.out.println(us2.age);
	System.out.println(us2.city);
	System.out.println(us3.name);
	System.out.println(us3.age);
	System.out.println(us3.city);
	
	
	
	}

}
