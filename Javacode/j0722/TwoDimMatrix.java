package j0722;
/**
 * 二元矩陣運算
 * Q1銷售員銷售總額、產品銷售總額
 * Q2產品最佳
 * Q3業務最佳
 * Q4銷售總計
 * */
public class TwoDimMatrix {

	public static void main(String[] args) {
		String[] product = {"-A","-B","-C","-D","銷售員總計"};
		String[] name = {"銷售員\\產品","--業務員A ","--業務員B ","--業務員C ","產品總計  "};
		int[][] table ={{33,32,56,45,0},
						{77,33,68,45,0},
						{43,55,43,67,0},
						{0,0,0,0,0}};
		int sum=0,max1=0,max2=0,p1=0,p2=0; 
		//------------------------------------列印初值
		System.out.println("初值為:");
		for(int i =0;i<name.length;i++)
		{
			System.out.print(name[i]+"|");
			if(i ==0)
			{
				for(int j=0;j<product.length;j++)
				{
					System.out.print(product[j]+"|");
				}
				System.out.println("");
			}
			else
			{
				for(int k=0;k<5;k++)
				{
					System.out.print(table[i-1][k]+"|");
				}
				System.out.println("");
			}
		}
		for(int i=0;i<30;i++)
		{
			System.out.print("-");
		}
		System.out.println("");
		//-------------------------------------列印初值
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[i].length-1;j++)
			{
				table[i][4] += table[i][j]; //計算銷售員銷售總額
				if(i<3)
				{
					sum += table[i][j]; //計算總銷售額
				}
			}
			for(int j=0;j<table.length-1;j++)
			{
				table[3][i] += table[j][i]; //計算產品銷售總額
			}
		}
		table[3][4]=sum;//存值到總和欄位
		for(int i=0;i<3;i++) //最佳銷售員
		{
			if(max1<table[i][4])
			{
				max1 = table[i][4];
				p1 =i; //紀錄最佳位置
			}
		}
		for(int i=0;i<4;i++) //最佳產品
		{
			if(max2<table[3][i])
			{
				max2 = table[3][i];
				p2=i;//紀錄最佳位置
			}
		}
		//--------------------------------------計算完畢，列印值
		System.out.println("計算後為:");
		for(int i =0;i<name.length;i++)
		{
			System.out.print(name[i]+"|");
			if(i ==0)
			{
				for(int j=0;j<product.length;j++)
				{
					System.out.print(product[j]+"|");
				}
				System.out.println("");
			}
			else
			{
				for(int k=0;k<5;k++)
				{
					System.out.print(table[i-1][k]+"|");
				}
				System.out.println("");
			}
		}
		for(int i=0;i<30;i++)
		{
			System.out.print("-");
		}
		System.out.println("\n最佳產品是:"+ product[p2]);
		System.out.println("最佳業務員是:"+ name[p1+1]);
		System.out.println("銷售總額是:"+sum);
	}
}
