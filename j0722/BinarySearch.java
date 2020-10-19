package j0722;
/**
 * 二元搜尋法
 * */
public class BinarySearch {

	public static void main(String[] args) {
		int[] in = {11,12,23,44,58,68,72,90,108};
		int a = binsearch(in,18);
		System.out.print(a);

	}
	public static int binsearch(int[] num,int key)
	{
		int L=0,R=num.length;//左右指標
		int mid; //中間欄位
		do
		{
			mid = (L+R)/2; //取中間值
			if(num[mid]==key)  //找到key值回報
			{
				return mid;
			}
			else if(num[mid] > key) //key值較小，找左邊
			{
				R = mid-1;   //改變右指標
			}
			else if(num[mid] < key) //key值較大，找右邊
			{
				L = mid+1;  //改變左指標
			}
		}while(R>=L); //當左右指標位置互換時結束
		return -1;
	}
}
