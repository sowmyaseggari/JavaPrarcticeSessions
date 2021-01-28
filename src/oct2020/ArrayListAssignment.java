package oct2020;

public class ArrayListAssignment {

	public static void main(String[] args) 
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=9;j++)
			{
				System.out.print(i+""+j+ " ");
			}
			System.out.println();
		}

	//2. Static array
		
		String src[]= new String[6];
		src[0]="name";
		src[1]="age";
		src[2]="teamname";
		src[3]="DOB";
		src[4]="gender";
		src[5]="Strike Rate";
		for(String e:src)
		{
			System.out.print(e+" ,");
			
		}
		System.out.println();
		
		
	//2.1 Object arrays;	
		Object obj[]=new Object[6];
		obj[0]="sachin";
		obj[1]=40;
		obj[2]="india";
		obj[3]=24/1987;
		obj[4]="male";
		obj[5]=8.5;
		for(Object s:obj)
		{
			System.out.print(s+",");
			
		}
		System.out.println();
		System.out.println("...........");
		
		Object obj1[]=new Object[6];
		obj1[0]="Dhoni";
		obj1[1]=40;
		obj1[2]="india";
		obj1[3]=26/1987;
		obj1[4]="male";
		obj1[5]=8.4;
		for(Object s1:obj1)
		{
			System.out.print(s1+",");
			
		}
		System.out.println();
		
		Object obj2[]=new Object[6];
		obj2[0]="kohli";
		obj2[1]=35;
		obj2[2]="india";
		obj2[3]=24/1990;
		obj2[4]="male";
		obj2[5]=8.2;
		for(Object s2:obj2)
		{
			System.out.print(s2+",");
			
		}
		System.out.println();
		
		//3 Try to print the following pattern on the console:
		
		System.out.println("..........");
		String z="n" ;
		for(int i=4;i>=0;i--){
			System.out.println( z+"=" +i);
		}
	}

}
