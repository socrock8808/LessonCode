package j0805;
/**
 * 抽象類別：繼承練習
 * */
public class P1606 {

	public static void main(String[] args) {
		MyMath obj=new MyTest();
		obj.output();
		System.out.println("結果: "+ obj.add(3, 8));
		System.out.println("結果: "+ obj.mul(3, 8));
		System.out.println("結果: "+ obj.times(3, 8));
		System.out.println("結果: "+ obj.div(20, 8));
		System.out.println("結果: "+ obj.add(3, 8, 5));
		System.out.println("結果: "+ obj.mul(3, 8, 5));
	}
}
abstract class MyMath
{
	abstract int add(int n1,int n2);
	abstract int mul(int n1,int n2);
	abstract int times(int n1,int n2);
	abstract double div(double n1,int n2);
	abstract int add(int n1,int n2,int n3);
	abstract int mul(int n1,int n2,int n3);
	void output()
	{
		System.out.println("我的計算器");
	}
}
class MyTest extends MyMath
{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	public int mul(int n1,int n2)
	{
		return n1-n2;
	}
	public int times(int n1,int n2)
	{
		return n1*n2;
	}
	public double div(double n1,int n2)
	{
		return n1/n2;
	}
	public int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public int mul(int n1,int n2,int n3)
	{
		return n1-n2-n3;
	}
}