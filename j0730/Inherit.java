package j0730;
/**
 * 繼承練習
 * */
public class Inherit {

	public static void main(String[] args) {
		
		Child ch1 = new Child();
		Child ch2 = new Child();
		//ch1.barking();
		//ch1.sleep();
		System.out.println(ch1.equals(ch2));
	}

}
class GrandFa
{
	private String name;
	GrandFa()
	{
		System.out.println("GrandPa's Constructor");
	}
	GrandFa(String name)
	{
		this.name=name;
		System.out.println("GrandFa's Constructor with name");
	}
	void barking()
	{
		System.out.println(name+"Oof!!");
	}
}

class Father extends GrandFa
{
	Father()
	{
		System.out.println("Father's Constructor");	
	}
	public Father(String name)
	{
		super(name);
		System.out.println("Father's Constructor with name");
	}
	void sleep()
	{
		System.out.println("Sleepy!!");
	}
}

class Child extends Father
{
	public Child()
	{
		System.out.println("Child's Constructor");
	}
	Child(String name)
	{
		super(name);
		System.out.println("Child's Constructor with name");
	}
}