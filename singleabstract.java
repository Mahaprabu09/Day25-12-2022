package day25122022;

interface sample{
 void m();
	
	default public void m1()
	{
		System.out.println("method 1");
	}
	static public void m2()
	{
		System.out.println("method 2");
	}
}

public class singleabstract implements sample{
	public void m(){
		System.out.println("This is single abstract method");
	}
	public static void main(String[]args)
	{
		sample sc=new singleabstract();
		sc.m();
		sc.m1();
		sample.m2();
		
		
	}
	

}
