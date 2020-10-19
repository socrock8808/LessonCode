package j0722;

import java.util.Arrays;
/**
 * 亂數取7個不重複1~49
 * */
public class Lotto {

	public static void main(String[] args) {
		int[] num = new int[7];    //存放結果的陣列
		int tmp; //暫存取出的數字
		boolean flag; //跳出判斷
		for(int i =0;i<num.length;i++)
		{
			do
			{
				flag = false;//跳出預設為false
				tmp = (int)(Math.random()*49); //隨機取數字
				for(int j=0;j<=i;j++) //依序判斷是否有重複
				{
					if(tmp==num[j] || tmp==0) 
					{				 //可能出現0，排除
						flag = true;
						break;
					}
				}
			}while(flag);//若無重複數字則跳出
			num[i] = tmp; //放入數字
		}
		Arrays.sort(num); //排序數字
		for(int i=0;i<num.length;i++)  //列印結果
		{
			System.out.print(num[i]+"\t");
		}
	}
}