package j0715;
/**
 * 例題8-4
 * static方法練習
 * */
public class E804 {
	public static void main(String[] args)
	{
		System.out.println(add(new int[] {1,2,3,4,5})); //匿名陣列
		System.out.println(max(new int[] {1,2,3,4,5}));
		System.out.println(min(new int[] {1,2,3,4,5}));
		System.out.println(avg(new int[] {1,2,3,4,5}));
	}
	public static int add(int[] nums)//加總
	{
		int sum=0;
		for(int num:nums)
		{
			sum +=num;
		}
		return sum;
	}
	public static int max(int[] nums)//最大值
	{
		int max=0;
		for(int num:nums)
		{
			if (num>max)
			{
				max = num;
			}
		}
		return max;
	}
	public static int min(int[] nums)//最小值
	{
		int min=Integer.MAX_VALUE;
		for(int num:nums)
		{
			if (num<min)
			{
				min = num;
			}
		}
		return min;
	}
	public static double avg(int[] nums)//平均
	{
		double avg=0;
		for(int num:nums)
		{
			avg +=num;
		}
		return avg/nums.length;
	}
}
