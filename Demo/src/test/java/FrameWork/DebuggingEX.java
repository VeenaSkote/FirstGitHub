package FrameWork;

public class DebuggingEX {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("A value before swapping:"+a);
		System.out.println("B value before swapping:"+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("A value after swapping:"+a);
		System.out.println("B value after swapping:"+b);
	}

}
