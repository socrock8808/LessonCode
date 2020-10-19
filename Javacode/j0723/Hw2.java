package j0723;
/**
 * 求0!+1!+....+n!之和
 * */
import java.util.Scanner;
public class Hw2 {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		int n = typ.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum += fac(i);
		}
		System.out.print("總合為:"+sum);
		typ.close();
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
}
