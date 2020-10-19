package j0708;
/**
 * 判斷輸入的成績是否大於60分
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		int n=0;
		Scanner typ = new Scanner(System.in);
		try {
			System.out.print("請輸入您的成績: ");
			n = typ.nextInt();//取得輸入的數字
			System.out.println("您輸入的成績為: "+n);
			if( n < 60) //分數小於60
			{
				System.out.println(n+" 分，不及格");
			}
			else if( n >= 60 && n < 101)//分數介於60~100
			{
				System.out.println(n+" 分，及格!");
			}
			else if( n < 0 || n > 100) //非正常範圍的分數
			{
				System.out.println("輸入錯誤");
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("您輸入的並非整數");
		}
		typ.close();

	}

}
