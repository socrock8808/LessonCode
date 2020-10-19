package j0723;
/**
 * 遞迴練習：費氏數列、階層、整數和、最大公因數、n次方
 * */
public class Recursion {

	public static void main(String[] args) {
		System.out.println("階層:"+fac(5));
		System.out.println("費式數列:"+fib(6));
		System.out.println("整數和:"+add(10));
		System.out.println("最大公因數:"+gcd(50,30));
		System.out.println("n次方:"+pow(2,10));
	}
	public static int fib(int n) //費式數列
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		} 
	}
	public static int fac(int n) //階層
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fac(n-1);
		}
	}
	public static int add(int n) //整數和
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+add(n-1);
		}
	}
	public static int gcd(int a,int b) //最大公因數
	{
		int c=a%b;
		if(c==0)
		{
			return b;
		}
		else
		{
			return gcd(b,c);
		}
	}
	public static int pow(int a,int b) //n次方
	{
		if(b==0)
		{
			return 1;
		}
		else if(b==1)
		{
			return a;
		}
		else
		{
			return a*pow(a,b-1);
		}
	}
}
