package j0708;
/**
 * 判斷是否為閏年
 * */
import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		int year;
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入西元年: ");
		year = typ.nextInt();
		System.out.println("您輸入的西元年為: "+year);
		if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			System.out.println(year+" 年為閏年!");
		}
		else
		{
			System.out.println(year+" 年不是閏年!");
		}
		typ.close();
	}

}
