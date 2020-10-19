package j0805;
/**
 * 抽象類別
 * */
public class P1600 {

	public static void main(String[] args) {
		ac aa=new ac();
		aa.acc();
	}
}
abstract class abs
{
	abstract void acc();
}
class ac extends abs
{
	void acc()
	{
		System.out.println("acccc");
	}
}
