package j0814;
/**
 * String 類別練習
 * 使用者輸入整數
 * 1.將此整數轉換為國字大寫
 * 2.不能當機
 * */
import java.util.Scanner;
public class NumToBignum {
	
	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		String n = typ.next();
		System.out.println(numTransWord(n));
		typ.close();
	}
	public static String numTransWord(String num)
	{
		final char[] ch1={'零','壹','貳','參','肆','伍','陸','柒','捌','玖'};
		final char[] ch2={' ','拾','佰','仟'};
		final char[] ch3={' ','萬','億','兆'};
		try {
			int n = num.length();//數字總個數
			int n1,n2;
			String result = ""; //結果字串
			int tmp,tmp1=0; //數字暫存區
			boolean flag = true; //很多連續0狀況
			for(int i=0;i<num.length();i++)
			{
				tmp = num.charAt(i)-'0'; //由左邊開始取第i個數字
				if(i < num.length()-1) //避免指標超出界線
					tmp1 = num.charAt(i+1)-'0';
				n1 = (n-1)/4; //計算單位(萬億)
				n2 = (n-1)%4; //計算單位(個十百)，餘0為個位數跳過
				if ( tmp == 0 && tmp1 == 0) //很多連續0狀況
				{
					if(n%4==1 && flag) //當位數為個位數且沒補過單位(萬億)
					{
						result += ch3[n1];//補單位(萬億)
						flag = false; //不用再連續0狀況補單位(萬億)
					}
				}
				else
				{
					flag = true; //連續0中斷
					if (n % 4 != 1) //非個位數的情況
					{
						result += ch1[tmp]; //數字
						if (tmp != 0) //數字不為0才補單位 
							result += ch2[n2]; //補單位(個十百)
					} 
					else //個位數的情況
					{
						if (tmp != 0)//個位數不為0才補國字
							result += ch1[tmp]; //數字
						result += ch3[n1]; //補單位(萬億)
					} 
				}
				n--; //計算下一個位數
			}
			return result;
		} catch (ArrayIndexOutOfBoundsException e) {
			return "您輸入的並非整數"; //輸入非數字時跳例外
		}
	}
}
