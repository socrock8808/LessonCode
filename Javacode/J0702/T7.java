
package J0702;

import java.util.Scanner;
/** �����P�_��J�l����PA�����j���{��
 * */
public class T7 {
	public static void main(String[] args) {
		String a;
		char b;
		int c;
		Scanner typ = new Scanner(System.in);  //建立取得輸入的物件
		System.out.print("請輸入英文字母: "); 
		a = typ.next(); 			//取得輸入的字串
		b = a.toUpperCase().charAt(0); //將字串第一個字元轉大寫

		while((int)b < 65 || (int)b > 90)	//如果輸入的不是英文字自重複跑到輸出英文為止
		{
			System.out.print("請輸入英文字母: ");
			a = typ.next();
			b = a.toUpperCase().charAt(0);
		}
		System.out.println("您輸入的第一個字母的大寫為: " + b);
		c = (int) b - 'A';   //轉換成ACSII用以比較差距
		System.out.print("此字母跟Ａ相差: " + c);
		typ.close(); //關閉輸入物件
	}

}
