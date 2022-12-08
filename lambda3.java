package day25122022;
interface lambdatype3
{
	public int lambdatest3(int l);
}
public class lambda3 {
	public static void main(String[] args) {
		System.out.println("Lambda type3");
		lambdatype3 lb=l->{return l*l*l;};
		System.out.println(lb.lambdatest3(10));
	}
}
