package j0715;

import java.util.Scanner;

/**
 * 例題8-5 費氏數列
 * */
public class E805 {
	public static void main(String[] args) {
		Scanner typ = new Scanner(System.in);
		System.out.print("請輸入費氏數列的項數：");
		int n = typ.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
		typ.close();
	}
	
	public static int fib(int n) {
		if(n == 0)
			return 1;
		else if(n == 1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
}
