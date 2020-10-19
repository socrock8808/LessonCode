package j0709;

/**列印樹 
 *  _______
 * |   *   |
 * |  ***  |
 * | ***** |
 * |*******|
 * |  ***  |
 * |  ***  |
 * ---------
*/
import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		int n=0;
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入數字(7or8): ");
		n = typ.nextInt();
		for(int i=1;i<=2*n+1;i++)//列印上邊界
		{
			System.out.print("_");
		}
		System.out.println("");
		for(int i=1;i<=n;i++)
		{
			System.out.print("|");//列印左邊界
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");//列印樹葉左邊的空格
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");//列印樹葉
			}
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");//列印樹葉右邊的空格
			}
			System.out.println("|");//列印右邊界
		}
		int z=(2*n-1)/3;//樹幹高度
		if(n%2==1)//基數偶數呈現方式不同
		{
			for(int m = 0;m<=z;m++)
			{
				System.out.print("|");//列印左邊界
				for(int o = 0;o<z;o++)
				{
					System.out.print(" ");//列印樹幹左邊的空格
				}
				for(int p = 0;p<=z;p++)
				{
					System.out.print("*");//列印樹幹
				}
				for(int o = 0;o<z;o++)
				{
					System.out.print(" ");//列印樹幹右邊的空格
				}
				System.out.println("|");//列印右邊界
			}
		}
		else if(n%2==0)//基數偶數呈現方式不同
		{
			for(int m = 0;m<=z;m++)
			{
				System.out.print("|");//列印樹幹左邊的空格
				for(int o = 0;o<z;o++)
				{
					System.out.print(" ");//列印樹幹左邊的空格
				}
				for(int p = 0;p<z;p++)
				{
					System.out.print("*");//列印樹幹
				}
				for(int o = 0;o<z;o++)
				{
					System.out.print(" ");//列印樹幹右邊的空格
				}
				System.out.println("|");//列印右邊界
			}
		}
		typ.close();
	}

}