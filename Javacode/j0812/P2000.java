package j0812;
/**
 * 例外練習：拋出例外、製作方法
 * */
public class P2000 {

	public static void main(String[] args) {
		try {
			Salary ss = new Salary("Larry",30000);
			Salary s1 = new Salary("Samon",3000);
			ss.check();
			s1.check();
		} catch (SalaryExp e) {
			e.tooString();
		}

	}

}
class SalaryExp extends Exception
{
	void tooString()
	{
		System.out.println("薪資錯誤");
	}
}
class Salary{
	private String name;
	private long money;
	Salary(String name,long money)
	{
		this.name = name;
		this.money = money;
	}
	void check() throws SalaryExp
	{
		if(this.money>=25000 && this.money<=50000)
		{
			System.out.println("名字:"+this.name+" 薪資:"+this.money);
		}
		else
		{
			System.out.print(this.name);
			throw new SalaryExp();
		}
	}
}