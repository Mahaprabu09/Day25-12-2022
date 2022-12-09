package day25122022;
//Star pattern program Using lambda expression
//Multithreads
public class lambdamulthread {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=5;i++)
			{
				for(int j=0;j<=i;j++)
				{
				System.out.print("*");
			}
				System.out.println();
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
