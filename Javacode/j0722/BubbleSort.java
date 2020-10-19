package j0722;
/**
 * Bubble sort 測試
 * */
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {10,32,5,78,5};
		int tmp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])//交換位置
				{
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

	}

}
