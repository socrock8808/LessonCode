package j0723;
/**
 * 訪法練習 一維、二維陣列，例8-7陣列排序
 * */
public class TestArray {

	public static void main(String[] args) {
		int[] num ={1,2,3,4,5,6,7};
		int[] num1={7,6,5,4,3,2,1};
		int[][] nm ={{1,2,3,4,5,6,7},
					 {7,6,5,4,3,2,1}};
		oneDim(num);
		twoDim(nm);
		SmallBig(num1);
		BigSmall(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num1[i]+"\t");
		}
		System.out.println("\n");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"\t");
		}
	}
	//-------------------------------------------------
	public static void oneDim(int[] a) //一維陣列*10
	{
		for(int i=0;i<a.length;i++)
		{
			a[i] *= 10;
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");
	}
	public static void twoDim(int[][] a) //二維陣列*10
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] *= 10;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	//--------------------------------------------------
	public static void SmallBig(int[] a) //小到大排序bubble
	{
		int tmp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
	//---------------------------------------------------
	public static void BigSmall(int[] a) //大到小排序bubble
	{
		int tmp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
}
