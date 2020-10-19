package j0729;
/**
 * 類別練習：加減成除
 * */
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		int n,m;
		do
		{
			System.out.print("請輸入數字: ");
			n =typ.nextInt();
		}while(n<0);
		do
		{
			System.out.print("請輸入數字: ");
			m =typ.nextInt();
		}while(m<0);
		Calculator cc = new Calculator();
		System.out.println(n+"+"+m+"="+cc.plus(n,m));
		System.out.println(n+"-"+m+"="+cc.substract(n,m));
		System.out.println(n+"*"+m+"="+cc.devide(n,m));
		System.out.println(n+"/"+m+"="+cc.multiply(n,m));
		typ.close();
	}

}
class Calculator
{
	int plus(int n,int m)
	{
		return n+m;
	}
	int substract(int n,int m)
	{
		return n-m;
	}
	double devide(int n,int m)
	{
		return ((double)n*m);
	}
	double multiply(int n,int m)
	{
		return ((double)n/m);
	}

}