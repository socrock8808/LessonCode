package J0702;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 計算面積的小程式
 * */
public class T6 {

	public static void main(String[] args) 
	{
		int r;
		double cir,ball;
		Scanner typ = new Scanner(System.in);
		try {
			System.out.print("請輸入半徑: ");
			r = typ.nextInt();
			cir = Math.PI *Math.pow(r, 2);
			ball = (4.0/3.0)*Math.pow(r, 3);
			System.out.printf("半徑為 %d 圓面積為 : %20.2f%n",r,cir);
			System.out.printf("半徑為 %d 球體面積為: %20.2f%n",r,ball);
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤~!");
		}
		typ.close();
	}

}
