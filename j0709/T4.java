package j0709;
/**
 * 列出小於100的質數 用費馬不行60後的數字太大
 * */
public class T4 {

	public static void main(String[] args) {
		int i=0;	
		System.out.print("1到100的質數有: ");
		for(i=2;i<101;i++)
		{
			if(i==2)//2為質數
			{
				System.out.print(i+",");
			}
			else
			{
				boolean prime = true;//是否為質數的flag
				for(int j=2;j<=i-1;j++)
				{
					if( i % j == 0)//有因數，非質數
					{	
						prime = false;//flag設定為false
						break;
					}
				}
				if(prime)//若flag為true，表為質數
				{
					System.out.print(i+",");
				}
			}
		}
	}
}
