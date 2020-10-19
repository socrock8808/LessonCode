package j0708;
/**
 * 測試帳號密碼是否正確
 * */
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		
		String acc,pw;
		String acc1 = "root";
		String pw1 = "redhat";
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入帳號: ");
		acc = typ.next();//取得輸入帳號
		System.out.println("您輸入的帳號為: "+ acc);
		System.out.print("請輸入密碼: ");
		pw = typ.next();//取得輸入密碼
		if( acc.equals(acc1) && pw.equals(pw1))//驗證
		{
			System.out.println("帳號密碼正確");
		}
		else
		{
			System.out.println("您輸入的帳號或密碼不正確");
		}
		typ.close();//物件關閉
	}

		
}
