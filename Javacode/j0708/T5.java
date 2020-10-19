package j0708;
/**
 * 判斷最大最小值
 * */
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		int a,b,c,t;
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入第一個數字: ");
		a = typ.nextInt();
		System.out.print("請輸入第二個數字: ");
		b = typ.nextInt();
		System.out.print("請輸入第三個數字: ");
		c = typ.nextInt();
		System.out.println("您輸入的三個數字為: "+a+" , "+b+" , "+c);
		if( a < b ) //三個數字做排序
		{
			t = b;
			b = a;
			a = t;
		}
		if( b < c )
		{
			t = c;
			c = b;
			b = t;
		}
		if( a < b )
		{
			t = b;
			b = a;
			a = t;
		}
		System.out.println("最大值為: "+a);
		System.out.println("最小值為: "+c);
		typ.close();
	}

}