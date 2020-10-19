package j0819;
/**
 * 身分證正規表達式
 * */
import java.util.Scanner;
public class P1300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入身分證: ");
		String str = typ.next();
		//regular expression
		String pattern = "([a-z]|[A-Z])[1-2]\\d{8}";
		System.out.println("輸入的身分證為: "+ str.matches(pattern));
		typ.close();
	}

}
