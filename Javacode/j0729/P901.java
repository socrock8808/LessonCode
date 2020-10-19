package j0729;
/**
 * 類別練習：方法簽章
 * */
public class P901 {

	public static void main(String[] args) {
		MyMax a = new MyMax();
		System.out.println(a.getMax(10));
		System.out.println(a.getMax(10,2));
		System.out.println(a.getMax(1,5,2,6,74,4,2));
	}
}
class MyMax
{
	int max;
	MyMax()
	{
		max=0;
	}
	int getMax(int x)
	{
		return x;
	}
	int getMax(int x,int y)
	{
		if(x>=y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	int getMax(int x,int ... y)
	{
		max = x;
		for(int num:y)
		{
			if(num>max)
			{
				max =num;
			}
		}
		return max;
	}
}
