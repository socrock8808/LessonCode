package j0723;
/**
 * 方法簽章 不同型態不同運算
 * */
public class MethodSignature {

	public static void main(String[] args) {
		short s =0;
		float f=0.0f;
		int i =0;
		double d=0.0;
		System.out.println(count(i,100,2));
		System.out.println(count(s,100,2));
		System.out.println(count(f,100,2));
		System.out.println(count(d,100,2));
		

	}
	public static int count(short s,int x,int y)
	{
		return x-y;
	}
	public static int count(int s,int x,int y)
	{
		return x+y;
	}
	public static int count(float s,int x,int y)
	{
		return x*y;
	}
	public static int count(double s,int x,int y)
	{
		return x/y;
	}
}
