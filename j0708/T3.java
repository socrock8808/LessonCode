package j0708;
/**
 * 測試輸入字母的大小寫
 * */
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入字元: ");
		char ch = typ.next().charAt(0);//取得輸入的字母
		System.out.println("您輸入的第一個字元為: "+ch);
		if( ch >= 65 && ch <= 90) //以ACSII碼做偵測
		{
			System.out.println("這是大寫");
		}
		else if( ch >= 97 && ch <= 122)
		{
			System.out.println("這是小寫");
		}
		else
		{
			System.out.println("這不是字元");
		}
		typ.close();//物件關閉
	}

}
