package j0715;
/**
 * 例題8-3
 * 加減乘除方法練習
 * */
class SmallMath
{
	int add(int x,int y)//加
	{
		int z = x+y;
		return z;
	}
	int sub(int x,int y)//減
	{
		return x-y;
	}
	int times(int x,int y)//乘
	{
		return x*y;
	}
	double div(int x,int y)//除
	{
		return (double)x/y;
	}
}
public class E803 {

	public static void main(String[] args) {
		SmallMath A = new SmallMath();
		int x=10,y=20;
		System.out.println(A.add(x, y));
		System.out.println(A.sub(x, y));
		System.out.println(A.times(x, y));
		System.out.println(A.div(x, y));
	}
}