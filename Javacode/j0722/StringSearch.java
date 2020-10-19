package j0722;
/**
 * 字串搜尋
 * */
import java.util.Arrays;
import java.util.Scanner;
public class StringSearch {

	public static void main(String[] args) {
		String[] chinese = {"我","是","大","中","天"}; //字元陣列
		Arrays.sort(chinese);  //先行排序
		System.out.print("請輸入: ");
		Scanner typ = new Scanner(System.in);
		String cha = typ.next(); //取的輸入的資料
		for(String ch:chinese)
		{
			System.out.print(ch+"\t");
		}
		int n = Arrays.binarySearch(chinese, cha);
		System.out.println("n= "+n);	
		typ.close();
	}

}
