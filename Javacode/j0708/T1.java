package j0708;
/**
 * 判斷輸入數字的奇偶
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		int n=0;
		Scanner typ = new Scanner(System.in);
		try {
			System.out.print("請輸入一個整數: ");
			n = typ.nextInt();
			System.out.println("您輸入的數字是: "+n);
			if( (n % 2) == 0) //如餘數為0，表為偶數
			{
				System.out.println(n+" is even");
			}
			else
			{
				System.out.println(n+" is odd");
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("您輸入的並非整數");
		}
		typ.close();
	}

}
