package j0715;
/**
 * 類別練習
 * */
class Dog
{
	String name;
	String color;
	int age;
	void barking()
	{
		System.out.println("wolf");
	}
	void eating()
	{
		System.out.println("My dog's eating !");
	}
}
public class Test {

	public static void main(String[] args) {
		Dog mydog = new Dog();
		Dog Tomdog = new Dog();
		mydog.name = "nigger"; //String 要加雙引號
		Tomdog.name = "Tomcruse";
		mydog.color = "black";
		mydog.age = 5;
		System.out.println("My dog's name is :"+mydog.name);
		System.out.println("Tom's dog's name is :"+Tomdog.name);
		System.out.println("My dog's color is :"+mydog.color);
		System.out.println("My dog's age is :"+mydog.age);
		mydog.barking();
		mydog.eating();
	}

}
