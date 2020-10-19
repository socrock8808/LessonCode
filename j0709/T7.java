package j0709;
/**
 * 暴力破解密碼的程式
 * 註：3為數密碼
 * */
import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入3位數密碼: ");
		int pw = typ.nextInt();
		int ans;
		for(int i=0;i<1000;i++)//從001開始試到對為止
		{
			ans = i;
			if(pw == ans)
			{
				System.out.println("您的密碼是: "+ans);
				break;
			}
			else
			{
				System.out.println(ans+"是錯誤的密碼");
			}
		}
		typ.close();
	}

}
