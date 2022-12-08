package day25122022;
interface lambdatype2{
	public int lambdatest(int m);
}
public class lamda2 {
	public static void main(String[]ars)
	{
		lambdatype2 lb=m->m+m;
		System.out.println("Lambda addtion");
		System.out.println(lb.lambdatest(5));
	}

}
