package j0715;
/**
 * 類別練習
 * 例題8-2，銀行存提款小程式
 * */
class TaipaiBank{
	int account;
	int balance;
	Boolean saveMoney(int save)//存錢方法
	{
		if(save >0) //驗證輸入值是否合法
		{
			balance += save;
			return true;
		}
		else
		{
			return false;
		}
	}
	void printInfo()//列印帳戶資料
	{
		System.out.printf("帳戶: %d, 餘額: %d\n",account,balance);
	}
	Boolean withdraw_money(int n)//提款方法
	{
		if(balance >= n)//驗證提款金額是否大於存款餘額
		{
			balance -= n;
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class E802 {

	public static void main(String[] args) {
		TaipaiBank A = new TaipaiBank();
		A.account = 1000001;
		A.balance = 0;
		A.printInfo();
		
		System.out.println("存款"+((A.saveMoney(100))?"成功":"失敗"));
		System.out.println("存款"+((A.saveMoney(-100))?"成功":"失敗"));
		A.printInfo();
		
		System.out.println("提款"+((A.withdraw_money(200))?"成功":"失敗"));
		System.out.println("提款"+((A.withdraw_money(70))?"成功":"失敗"));
		A.printInfo();
	
	}

}
