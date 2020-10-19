package j0722;
/**
 * 轉置矩陣
 * 
 * 轉成{ {1,4,7},
 *		{2,5,8},
 *		{3,6,9}};
 * */
public class MatrixTransport {

	public static void main(String[] args) {
		int[][] A= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int tmp=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i;j<A[i].length;j++)//對角互換
			{
				tmp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = tmp;
			}
		}
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
