package j0806;
/**
 * 隨機產生10000個1~49的數字，顯示分配率
 * */
public class P4 {

	public static void main(String[] args) {
		int[] num = new int[10000];
		int count;
		for(int i=0;i<10000;i++)
		{
			num[i] = (int)(Math.random()*49+1);
		}
		for(int i=1;i<50;i++)
		{
			count=0;
			for(int j=0;j<10000;j++)
			{
				if(num[j] == i)
				{
					count++;
				}
			}
			System.out.printf("數字%d分配率為: %5.4f\n",i,(double)count/10000);
		}
	}

}
