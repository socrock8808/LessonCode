package j0812;
/**
 * 例外練習：拋出例外
 * 樂透開獎
 * */
import java.util.Arrays;
/**
 * 例外練習，宣告樂透開球數
 * */
import java.util.Scanner;
import j0722.Lotto2;
public class P2000_1 {

	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入樂透開獎數:");
		int lottosize = typ.nextInt();
		int tmp,count=0;
		typ.close();
		try
		{
			if(lottosize < 6)
			{
				System.out.println("發生例外，開獎數過低");
				throw new LottoException1();//拋出例外
			}
			else if(lottosize > 49)
			{
				System.out.println("發生例外，開獎數過高");
				throw new LottoException2();//拋出例外
			}
		}
		catch(LottoException1 | LottoException2 e)
		{
			System.out.println("重製為6");
			lottosize = 6;
		}
		finally
		{
			System.out.println("開獎數為:"+lottosize);
		}
		int[] lotto = new int[lottosize];
		System.out.println("建置完畢，開始列印號碼");
		for(int i =0;i<lotto.length;i++)
		{
			do
			{
				tmp = (int)(Math.random()*49); //隨機取數字	
			}while(Lotto2.linearSearch(lotto,tmp,i));//若無重複數字則跳出
			lotto[i] = tmp; //放入數字
		}
		Arrays.sort(lotto); //排序數字
		for(int i=0;i<lotto.length;i++)  //列印結果
		{
			if(count==6)
			{
				System.out.println("");
				count=0;
			}
			System.out.print(lotto[i]+"\t");
			count++;
		}
	}
}
class LottoException1 extends Exception{
	private static final long serialVersionUID = 1L;
}
class LottoException2 extends Exception{
	private static final long serialVersionUID = 1L;
}