package j0709;
/**
 * 迴圈練習
 * 99乘法表
 * */
public class T2 {

	public static void main(String[] args) {
		int i=0,j=0;
		/*for(i=1;i<10;i++)
		{
			for(j=1;j<10;j++)
			{
				System.out.print( i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println("");
		}*/
		
		/*i=1;
		
		while(i<10)
		{
			j=1;
			while(j<10)
			{
				System.out.print( i+"*"+j+"="+(i*j)+"\t");
				j++;
			}
			System.out.println("");
			i++;
			
		}*/
		
		i=1;
		do
		{
			j=1;
			do
			{
				System.out.print( i+"*"+j+"="+(i*j)+"\t");
				j++;
			}while(j<10);
			System.out.println("");
			i++;
		}while(i<10);
		
	}

}
