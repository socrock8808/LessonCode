package j0709;
/**
 * 列印數列：1+2-3+4.....n
 * */
import java.util.Scanner;

public class T5 {
	public static void main(String[] args)
	{
		int n=0;
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		n = typ.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			if(i == 1)
			{
			System.out.print(i);
			}
			else if(i%2==1)
			{
				System.out.print(" - "+i);				
			}
			else if(i%2==0)
			{
				System.out.print(" + "+i);				
			}
		}
		typ.close();
		
	}
}
