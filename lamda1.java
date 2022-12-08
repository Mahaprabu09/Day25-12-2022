package day25122022;

interface lamdatype1{
	public int t1(int n);
}
public class lamda1 {
	public static void main(String[]args)
	{
		lamdatype1 lt=n->n*n*n;
		System.out.print(lt.t1(3));
	}
	

}
