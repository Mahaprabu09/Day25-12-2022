package day25122022;

interface intercode{
	public void testcode(String s);
}

public class interfacecode implements intercode {
	public void testcode(String s)
	{
		System.out.println(s);
	}
	public static void main(String[]args)
	{
		intercode ic=new interfacecode();
		ic.testcode("Anudip foundation");
	}
	

}
