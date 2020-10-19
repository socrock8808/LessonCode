package j0812;
/**
 * 簡便銀行程式，例外練習
 * */
import java.util.InputMismatchException;
import java.util.Scanner;
public class P2006 {

	public static void main(String[] args) {
		Bank bb = new Bank();
		Scanner typ = new Scanner(System.in);
		char str;
		boolean flag = true;
		int n=0;
		System.out.println("歡迎來到XXBank");
		do {
			try {
				System.out.println("提款請按w，存款請按d，查詢餘額請按i，離開請按q，返回請輸入任意鍵: ");
				str = typ.next().toLowerCase().charAt(0);
				switch(str)
				{
					case 'w':
						System.out.println("請輸入提款金額");
						n = typ.nextInt();
						bb.withdraw(n);
						break;
					case 'd':
						System.out.println("請輸入存款金額");
						n = typ.nextInt();
						bb.deposit(n);
						break;
					case 'i':
						bb.getAmount();
						break;
					case 'q':
						flag = false;
						break;
					default:
						System.out.println("請重新輸入");
						break;
				}
		
			} catch (BankException e) {
				System.out.println("存款餘額不足" + e.getAmount());
			} catch (BankDeException e) {
				System.out.println("存款不得為負數");
			} catch (InputMismatchException e) {
				System.out.println("金額應為數字");
			}
		} while (flag);
		System.out.println("程式結束");
		typ.close();
	}

}
class Bank{
	int account=0;
	void deposit(int n) throws BankDeException
	{
		if(n<0)
		{
			System.out.println("存入: "+n);
			throw new BankDeException();
		}
		else
		{
			this.account += n;
			System.out.println("存入: "+n+"，餘額: "+this.account);
		}
		
	}
	void withdraw(int n) throws BankException
	{
		if(n>this.account)
		{
			System.out.println("提款: "+n);
			int shortA = this.account - n;
			throw new BankException(shortA);
		}
		else
		{
			this.account -= n;
			System.out.println("提款: "+n+"，餘額: "+this.account);
		}
	}
	void getAmount()
	{
		System.out.println("目前帳戶餘額為: "+this.account);
	}
}
class BankException extends Exception{
	private static final long serialVersionUID = 1L;
	private int shortA;
	public BankException(int shot)
	{
		this.shortA= shot;
	}
	public int getAmount()
	{
		return this.shortA;
	}
}
class BankDeException extends Exception{
	private static final long serialVersionUID = 1L;
}
