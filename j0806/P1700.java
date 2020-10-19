package j0806;
/**
 * interface 實作
 * */
public class P1700 {

	public static void main(String[] args) {
		inter ee=new Tee();
		Tee ee1=new Tee();
		ee.myMethod();
		ee1.dd();

	}

}
class Tee implements inter
{
	public void myMethod()
	{
		System.out.println(x+"Tee");
	}
	void dd()
	{
		System.out.println("new Tee");
	}
}
interface inter
{
	int x = 10;
	default void myMethod()
	{
		System.out.println(x+"inter");
	}
}