package j0821;
/**
 * Synchronized問題
 * race condition
 * 設計一個共用帳號，共存提款(期初金額1000)
 * 有3位使用者，對此帳號存取不同金額
 * 試用同步方法 處理此帳戶餘額
 * */
public class P21001 {

	public static void main(String[] args) {
		SynEx T1 = new SynEx("User1");
		SynEx T2 = new SynEx("User2");
		SynEx T3 = new SynEx("User3");
	}

}
class SynEx extends Thread{
	/*共同帳戶*/
	static int account = 1000;
	/*Thread使用者名稱*/
	String name;
	/*建立物件執行Thread*/
	SynEx(String name){
		this.name = name;
		Thread t = new Thread(this,name);
		t.start();
	}
	/*各存或提共10次*/
	public void run(){
		for(int i=0;i<10;i++)
		{
			/*進行交易後休息0.5秒*/
			deal(this.name);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e){}
		}
		System.out.println(this.name+"程式結束");
	}
	/*交易方法*/
	synchronized static void deal(String name){
		/*隨機選擇1~700整數*/
		int n = (int) (Math.random() * 700) + 1;
		/*選擇提款0或存款1*/
		int m = (int) (Math.rint(Math.random()));
		System.out.println(name+"交易前餘額:"+account);
		/*存款*/
		if (m > 0) 
		{
			account += n;
			try
			{
				System.out.println("存款" + n + "元" + "\n交易進行中...");
				sleep(300);
			}
			catch(InterruptedException e){}
			System.out.println("目前餘額:" + account);
		}
		/*提款*/
		else
		{
			account -= n;
			System.out.println("提款" + n + "元" + "\n交易進行中...");
			try 
			{
				sleep(300);
			} catch (InterruptedException e) {}
			/*確認提款是否超過帳戶餘額*/
			if (account < 0)
			{
				account +=n;
				System.out.println("目前餘額不足，交易失敗。");
			}
			System.out.println("目前餘額:" + account);
		}
	}
}