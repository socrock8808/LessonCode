package j0723;
/**
 * 例8-8輸入整數n，回傳被3、7整除的數列
 * */
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入整數: ");
		int n = typ.nextInt();
		int[] num = div3(n);
		int[] num1= div7(n);
		System.out.println("1~"+n+"被3整除的數列:");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println("\n");
		//----------------------------------------
		System.out.println("1~"+n+"被7整除的數列:");
		for(int i=0;i<num1.length;i++)
		{
			System.out.print(num1[i]+" ");
		}
		typ.close();
	}
	//--------------------------------------------------
	public static int[] div3(int n) //回傳被3整除的數列
	{
		int[] num=new int[n/3];
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3 ==0)
			{
				num[count] = i;
				count++;
			}
		}
		return num;
	}
	//-------------------------------------------------
	public static int[] div7(int n) //回傳被7整除的數列
	{
		int[] num=new int[n/7];
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(i%7 ==0)
			{
				num[count] = i;
				count++;
			}
		}
		return num;
	}
}
