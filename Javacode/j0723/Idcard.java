package j0723;
/**
 * 方法練習 身分證驗證
 * */
import java.util.Scanner;
public class Idcard {
	public static void main(String[] args)
	{
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入身分證: ");
		idcard(typ.next());
		typ.close();
	}
	public static void idcard(String str)
	{
		int[][]city={{'A',1,0},{'B',1,1},{'C',1,2},{'D',1,3},{'E',1,4},{'F',1,5},
					 {'G',1,6},{'H',1,7},{'I',3,4},{'J',1,8},{'K',1,9},{'L',2,0},
					 {'M',2,1},{'N',2,2},{'O',3,5},{'P',2,3},{'Q',2,4},{'R',2,5},
					 {'S',2,6},{'T',2,7},{'U',2,8},{'V',2,9},{'W',3,2},{'X',3,0},
					 {'Y',3,1},{'Z',3,3}}; //編碼陣列
		int sum =0; //存放總和
		int ch = str.toUpperCase().charAt(0); //取得地區代碼
		for(int i=0;i<city.length;i++) //liner search比對地區代碼，計算後放進sum
		{
			if(ch == city[i][0])
			{
				sum = city[i][1]+city[i][2]*9;
				break;
			}
		}
		for(int i=1;i<str.length()-1;i++)
		{ //將ACSII轉數字，計算中間流水號之總和
			sum += (str.charAt(9-i)-'0')*i;
		}
		if((10 - sum%10)== (str.charAt(9)-'0')) //驗證是否合法
		{
			System.out.print("有效");
		}
		else
		{
			System.out.print("無效");
		}
	}
}
