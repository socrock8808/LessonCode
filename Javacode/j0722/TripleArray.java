package j0722;
/**
 * 三維陣列運算
 * */
public class TripleArray {

	public static void main(String[] args) {
		int[][][] a = { {{79,45},{6,42},{12,23},{74,6}},
						{{21,5},{4,8},{46,87},{12,73}},
						{{56,32},{48,89},{9,76},{5,4}}};
		int sum=0,max=a[0][0][0],min=a[0][0][0];
		float count=0,avg;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					if(max < a[i][j][k]) //最大值
					{
						max = a[i][j][k];
					}
					if(min > a[i][j][k]) //最小值
					{
						min = a[i][j][k];
					}
					sum += a[i][j][k]; //總和
					count ++; //總數計算
				}
			}
		}
		avg = sum/count;
		System.out.println("最大值為: "+max);
		System.out.println("最小值為: "+min);
		System.out.println("總和為: "+sum);
		System.out.println("平均為: "+avg);
	}

}
