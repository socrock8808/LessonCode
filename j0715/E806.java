package j0715;
/**
 * 例題8-6 篩選大於20的數字
 * */
public class E806 {

	public static void main(String[] args) {
		int[] num= filter(new int[] {25,18,12,22,31,17,26,19,18,10});//匿名陣列
		for(int i=0;i<num.length;i++) //印出結果
		{
			System.out.print(num[i]+",");
		}
	}
	
	public static int[] filter(int[] num) //篩選大於20的數字，回報array
	{
		int count=0;
		int[] filt = new int[num.length];
		for(int n:num)
		{
			if(n>=20)
			{
				filt[count] = n;
				count++;
			}
		}
		return filt;
	}

}
