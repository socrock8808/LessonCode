package j0722;
/**
 * 亂數取7個不重複1~49
 * */
import java.util.Arrays;

public class Lotto2 {

	public static void main(String[] args) {
		int[] num = new int[7];    //存放結果的陣列
		int tmp; //暫存取出的數字
		for(int i =0;i<num.length;i++)
		{
			do
			{
				tmp = (int)(Math.random()*49); //隨機取數字	
			}while(linearSearch(num,tmp,i));//若無重複數字則跳出
			num[i] = tmp; //放入數字
		}
		Arrays.sort(num); //排序數字
		for(int i=0;i<num.length;i++)  //列印結果
		{
			System.out.print(num[i]+"\t");
		}
	}
									//參數為:陣列、key值、key值存放位置
	public static boolean linearSearch(int[] array,int key,int a)
	{//此為搜尋陣列裡是否存在重複數字的method，若有重複回傳true，否則回傳false
		boolean flag = false; //回傳直預設為false
		for(int i=0;i<=a;i++) //依序判斷是否有重複
		{
			if(key==array[i] || key==0) 
			{				 //可能出現0，排除
				flag = true;
				break;
			}
		}
		return flag;
	}
}

