package j0729;
/**
 * 類別練習：將數字月份轉為英文
 * */
import java.util.Scanner;
public class P902 {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		int n = typ.nextInt();
		Months mon = new Months();
		mon.inputMonths(n);
		typ.close();
	}

}
class Months
{
	String[] month;
	Months()
	{
		String[] mon={"January","February","March","April","May","June",
					  "July","August","September","October","November","December"};
		month = mon;
	}
	void inputMonths(int m)
	{
		for(int i=0;i<12;i++)
		{
			if( m==i+1)
			{
				System.out.println(month[i]);
			}
		}
	}
}