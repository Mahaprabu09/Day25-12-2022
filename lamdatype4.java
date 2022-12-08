package day25122022;

interface multistate{
	public String lambda4(String o);
}
public class lamdatype4 {
	public static void main(String[] args) {
		multistate ms=o->{
			String s1="Hello ";
			String s2=s1+o;
			return s2;};
			
			System.out.println(ms.lambda4("Mahaprabu "));
		}
	}


