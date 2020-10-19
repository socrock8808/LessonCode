package j0806;
//猜拳遊戲
import java.util.Scanner;

public class P1001 {

	public static void main(String[] args) {
		String[][] s = {{"剪刀","石頭","布"},
						{"石頭","布","剪刀"},
						{"布","剪刀","石頭"}};
		Scanner typ=new Scanner(System.in);
		String str;
		double rate;
		int count=0;
		char ch;
		boolean flag;
		do
		{
			System.out.print("猜拳遊戲，請輸入您要出的拳種(輸入q或Q結束程式): ");
			str = typ.next();
			ch = str.charAt(0);
			rate = Math.random();
			count=0;
			flag=true;
			if(ch == 'q' || ch == 'Q')
			{
				break;
			}
			else
			{
				for(int i=0;i<3;i++)
				{
					if(str.equals(s[i][0]))
					{
						flag =false;
						count =i;
						break;
					}
				}
				if(flag)
				{
					System.out.println("輸入錯誤，請重新輸入");
				}
				else if(rate>0.2)
				{
					System.out.println("電腦出 "+s[count][1]+" 您輸了");
				}
				else
				{
					System.out.println("電腦出 "+s[count][2]+" 您贏了");
				}
			}
		}while(true);
		System.out.println("結束程式");
		typ.close();
	}

}
