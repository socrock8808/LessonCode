package j0806;
/**
 * 庫克牌發牌程式
 * */
public class P1006 {

	public static void main(String[] args) {
		//---------------0----1-----2-----3
		String[] type={"黑桃","愛心","菱形","梅花"};
		char[][] num=new char[4][14];
		for(int i=0;i<num.length;i++)
		{
			num[i][1] = 'A';
			for(int j=2;j<10;j++)
			{
				num[i][j]= Character.forDigit(j, 10);
			}
			num[i][10] = '1';
			num[i][11] = 'J';
			num[i][12] = 'Q';
			num[i][13] = 'K';
		}
//---------------------------------------------設定初值
		int t=0;
		int n=0;
		boolean[] flag=new boolean[4];
		boolean flagn;
		int count=0;
		do
		{
			t=(int)(Math.random()*4);//隨機選花色
			n=(int)(Math.random()*13+1);//隨機選數值
			if(num[t][n] == '0')
			{
				continue;
			}
			else
			{
				if(n==10)//如數值為10，輸出10
				{
					System.out.printf("%s%c0\t",type[t],num[t][n]);
				}
				else
				{	
					System.out.printf("%s%c\t",type[t],num[t][n]);
				}
				num[t][n] = '0';//用過的數值該為0
				count++;//計算已發的玩家數
				if(count ==4)//如已發完四位，從第一位開始發
				{
					count=0;
					System.out.println("");
				}
			}
			//--------------------------------發牌
			for(int i=0;i<num.length;i++)
			{
				flagn =true;
				for(int j=0;j<num[i].length;j++)
				{
					if(num[i][j] != 0)
					{
						flagn =false;
						break;
					}
				}
				if(flagn)
				{
					flag[i] = true;
				}
			}//--------------------------判斷是否用盡
		}while(flag[0]==false || flag[1]==false || flag[2]==false || flag[3]==false);
	}

}
