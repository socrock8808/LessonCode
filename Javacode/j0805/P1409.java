package j0805;
/**
 * 多型練習
 * */
public class P1409 {

	public static void main(String[] args) {
		Animal a1 =new Animal();
		a1.eat();
		a1 =new Cat();
		a1.eat();
		a1=new BabyCat();
		a1.eat();

	}

}
class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Cat extends Animal
{
	@Override
	void eat()
	{
		System.out.println("eating fish");	
	}
}
class BabyCat extends Cat
{
	@Override
	void eat()
	{
		System.out.println("eating milk");	
	}
}