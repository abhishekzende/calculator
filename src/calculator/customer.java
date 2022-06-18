package calculator;

import java.util.Scanner;

class a{
	
	private double a,b;
	 
	
	
	public void addition(double c)
	{
		System.out.println("ENTER THE NUMBER");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		
		c=a+b;
		System.out.print("addition="+c);
		
	}
	
	public void substraction(double c) 
	{
		System.out.println("ENTER THE NUMBER");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		
		c=a-b;
		System.out.print("subtraction="+c);
		
	}
	
	public void multiplication(double c) 
	{
		System.out.println("ENTER THE NUMBER");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		
		c=a*b;
		System.out.print("multiplication="+c);
		
	}
	
	public void division(double c) 
	{
		System.out.println("ENTER THE NUMBER");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		
	     c=a/b;
		System.out.print("division="+c);
		
		
	}
	
	
	
}

public class customer {

	public static void main(String[] args) {
		
		a x=new a();
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
		int ch;
		System.out.println("ENTER THE CHOICE");
		Scanner s= new Scanner(System.in);
		ch=s.nextInt();
		
		switch(ch) 
		{
		case 1: x.addition(ch);
		break;
		
		case 2: x.substraction(ch);
		break;
		
		case 3: x.multiplication(ch);
		break;
		
		case 4: x.division(ch);
		break;
		
		default: System.out.print("invalid option");
		
		}
		
		

	}

}
