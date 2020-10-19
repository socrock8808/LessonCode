package j0709;
//1-100之奇偶數
public class T3 {

	public static void main(String[] args) {
		int i=0;
		System.out.print("1到100的奇數有: ");
		for(i=1;i<101;i++)
		{
			if( i % 2 == 1)
			{
				
				System.out.print(i+",");
			}
		}
		System.out.print("\n1到100的偶數有: ");
		for(i=1;i<101;i++)
		{
			if( i % 2 == 0)
			{
				
				System.out.print(i+",");
			}
		}

	}

}
