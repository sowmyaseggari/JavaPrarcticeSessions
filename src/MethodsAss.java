import java.util.Scanner;


public class MethodsAss {

	public static void main(String[] args) 
	{
		MethodsAss ms =new MethodsAss();
		Scanner s= new Scanner(System.in);
		System.out.println("Enterd two new numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int s1=ms.getSum(a,b);
		System.out.println("sum of two numbers"+ " " +s1);
		int p=ms.getProduct(a, b);
		System.out.println("product of two numbers"+ " " +p);
		System.out.println("enterd radius");
		float f=s.nextFloat();
		float f1=ms.getcircumference(f);
		System.out.println("circumference"+ " " +f1);
		System.out.println("enterd value");
		int a1=s.nextInt();
		int b1=s.nextInt();
		int c1=s.nextInt();
		ms.getMaximum(a1, b1, c1);
		ms.getMinimum(a1, b1, c1);
		System.out.println("enterd value");
		int z=s.nextInt();
		boolean b3=ms.getPrime(z);
		System.out.println("prime number:"+ " "+b3);
		System.out.println("enterd value");
		int k=s.nextInt();
		int q=ms.getEvenOdd(k);
		System.out.println("enter age");
		int k1=s.nextInt();
		int y=ms.getVote(k1);
		System.out.println("enter marks");
		int k2=s.nextInt();
		ms.getGrade(k2);
		
		
		
	}
	
	
	public int getSum(int a,int b)
	{
	     int sum=a+b;
		return sum;
	}
	public int getProduct(int a,int b){
		int product=a*b;
		return product;
		
	}
	public float getcircumference(float r)
	{
		float circumference=(float) (2 *Math.PI*r);
		return circumference;
	}
	public void getMaximum(int a,int b,int c){
		if(a >  b)
			if(a>c)
				System.out.println("The greatest: " + a);
		if(b>a)
			if(b>c)
				System.out.println("The greatest: " + b);
		if (c>a)
			if(c>b)
				System.out.println("The greatest: " + c);
			
	}
	public void getMinimum(int a,int b,int c){
		if(a < b)
			if(a<c)
				System.out.println("The smallest: " + a);
		if(b<a)
			if(b<c)
				System.out.println("The smallest: " + b);
		if (c<a)
			if(c<b)
				System.out.println("The smallest: " + c);
				
	}
	public boolean getPrime(int n)
	{
		if(n<=1)
			return false;
		
		for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
		return true;
	}
	public int getEvenOdd(int num){
		if(num % 2==0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is even");
		
		return num;
		
			
		}
	public int getVote(int age){
		if(age>=18)
			System.out.println(age + " is elligible");
		else
			System.out.println(age + " is notelligible");
			
			return age;
			
	}
	public void getGrade(int marks)
	{
		if((marks >=90)&&(marks<=100))
		{
			System.out.println("Grade AA");
		}
		if((marks >=81)&&(marks<90))
		{
			System.out.println("Grade AB");
			
		}
		if((marks >=71)&&(marks<=80))
		{
			System.out.println("Grade BB");
		}
		if((marks >=61)&&(marks<=70))
		{
			System.out.println("Grade BC");
		}
		if((marks >=51)&&(marks<=60))
		{
			System.out.println("Grade CD");
		}
		if((marks >=41)&&(marks<=50))
		{
			System.out.println("Grade DD");
		}
		if(marks <=40){
			System.out.println("FAIL");
		}
		
	}
	
	
	}
	


