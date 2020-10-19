package j0723;
/**
 * 列印巴斯卡三角形
 *   1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
1 5 10 10 5 1 
 * */
import java.util.Scanner;

public class Btri {
	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入有幾層： ");
		int n = typ.nextInt();
		for (int i = 0; i < n; i++) 
		{
			for (int k = n - i - 1; k > 0; k--) // 印出空格
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) // 印出數值
			{
				System.out.print(bustriangle(i, j) + " ");
			}
			System.out.println("");
		}
		typ.close();
	} // 回報第n⾏左邊往右數第r個數的值
	public static int bustriangle(int n, int r)// 起始皆為0
	{ // 第0層、 每⾏第0個、每⾏最後⼀個 皆為1
		if (r == 0 || n == r) 
		{
			return 1;
		} 
		else 
		{ // 上⾯兩項相加
			return bustriangle(n - 1, r - 1) + bustriangle(n - 1, r);
		}
	}
}