package j0715;
/**
 * 例題8-1
 * 類別使用練習
 * */
public class E801{

	public static void main(String[] args) {
		Dog mydog = new Dog();
		mydog.name = "nigger"; //String 要加雙引號
		mydog.color = "black";
		mydog.age = 5;
		System.out.println("My dog's name is :"+mydog.name);
		System.out.println("My dog's color is :"+mydog.color);
		System.out.println("My dog's age is :"+mydog.age);
		mydog.barking();
		mydog.eating();
	}

}