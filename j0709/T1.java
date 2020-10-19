package j0709;
/**
 * 迴圈練習
 * Sum 1 to 100
 * */
public class T1 {

	public static void main(String[] args) {
		int sum=0,w=1,sum1=0,d=1,sum2=0;
		for(int i=1;i<=100;i++)
		{
			sum = sum + i;
		}
		System.out.println("FOR迴圈1到100總和為: "+sum);
		
		while(w<101)
		{
			sum1 = sum1 + w;
			w++;
		}
		System.out.println("WHILE迴圈1到100總和為: "+sum1);
		
		do
		{
			sum2=sum2+d;
			d++;
		}while(d<101);
		System.out.println("Do WHILE迴圈1到100總和為: "+sum2);
	}

}
