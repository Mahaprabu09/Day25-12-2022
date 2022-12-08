package day25122022;
//functional interface with lamda expression
interface testcode2{
	public void testcode(String c);
}
public class interfacewithlamda {
	public static void main(String[]args)
	{
	
	testcode2 code=(c)->System.out.println(c);
	code.testcode("Anudip foundation");
	
	}

}
