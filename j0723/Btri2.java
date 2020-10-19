package j0723;
/**
 * 巴斯卡三角形
 * 第n列會有n+1個數
 * (n)  =n!/((n-r)!r!)
 * (r)
 * */
import java.util.Scanner;
public class Btri2 {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入整數n:");
		int n = typ.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=n-1-i;k>0;k--) //列印空格
			{
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++)  //列印數字
			{
				System.out.print((int)(ctriangle(i,j))+" ");
			}
			System.out.println("");
		}
		typ.close();
	}
	public static double ctriangle(int n,int r) 
	{	//計算卡巴斯三角形第n層(0開始)第r個數(0開始)
		return (double)(fac(n)/(fac(r)*fac(n-r)));
	}
	public static double fac(int n) //階層方法
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (double)(n*fac(n-1));
		}
	}
}
