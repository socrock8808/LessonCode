package J0702;
/**
 * 基本參數型態上下限
 * */
public class T2 {
	public static void main(String[] args)
	{
		long lmax=java.lang.Long.MAX_VALUE;
		long lmin=Long.MIN_VALUE;
		int imax = java.lang.Integer.MAX_VALUE;
		int imin=Integer.MIN_VALUE;
		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		byte bmax = Byte.MAX_VALUE;
		byte bmin = Byte.MIN_VALUE;		
		System.out.println("Max long = "+lmax);
		System.out.println("Min long = "+lmin);
		System.out.println("Max int = "+imax);
		System.out.println("Min int = "+imin);
		System.out.println("Max float = "+fmax);
		System.out.println("Min float = "+fmin);
		System.out.println("Max double = "+dmax);
		System.out.println("Min double = "+dmin);
		System.out.println("Max char = "+bmax);
		System.out.println("Min char = "+bmin);
		
	}

}
