package J0702;
/**
 * overflow練習
 * 隱性型別轉換
 * */
public class T3 {
	public static void main(String[] args)
	{
		final float PI = 3.1415926f; //常數通常設定為大寫，加上final值不可變
		System.out.println(PI);
		/*overflow練習*/
		int imax = Integer.MAX_VALUE;
		System.out.println("imax = "+imax);
		imax = imax+1;
		System.out.println("imax + 1 = "+imax);
		System.out.println("imax + 1 = "+((long)imax+1));
		/*隱性型別轉換*/
		int a =2;
		long b = 3;
		long sum = a+b;
		System.out.println("sum = "+sum);
	}

}
