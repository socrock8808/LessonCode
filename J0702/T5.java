package J0702;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * BMI小程式
 * */
public class T5 {

	public static void main(String[] args) {
		double hei;
		double wei;
		double BMI;
		Scanner typ = new Scanner(System.in);

		try 
		{
			System.out.print("請輸入身高(cm): ");
			hei = typ.nextDouble() / 100;
			System.out.print("請輸入體重(kg): ");
			wei = typ.nextDouble();
			BMI = wei / Math.pow(hei, 2); // 
			System.out.printf("您的BMI為: %3.1f", BMI);
		}
		catch (InputMismatchException e)
		{	/*如輸入的非數字，跳出例外輸出訊息*/
			System.out.print("輸入錯誤~");
		}

		typ.close();

	}

}
