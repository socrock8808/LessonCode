package j0805;
/**
 * 抽象類別：多型練習
 * */
public class P1601 {

	public static void main(String[] args) {
		Nissan ns=new Nissan("TK88","麵包","white",500000,1);
		BMW bmw=new BMW("C300","禮車","black",5000000,2);
		Toyota ty=new Toyota("BB555","國民","彩色",700000,3);
		ns.demo();
		bmw.demo();
		ty.demo();
	}
}
abstract class Car
{
	String type;
	String look;
	String color;
	int price;
	int year;
	Car(String type,String look,String color,int price,int year)
	{
		this.type=type;
		this.look=look;
		this.color=color;
		this.price=price;
		this.year=year;
	}
	abstract void demo();
}
class Nissan extends Car
{
	Nissan(String type,String look,String color,int price,int year)
	{
		super(type,look,color,price,year);
	}
	@Override
	void demo()
	{
		System.out.println("Nissan車型: "+type+"外觀: "+look+"顏色: "+color+"價格: "+price+"年份: "+year);
	}
}
class BMW extends Car
{
	BMW(String type,String look,String color,int price,int year)
	{
		super(type,look,color,price,year);
	}
	@Override
	void demo()
	{
		System.out.println("BMW車型: "+type+"外觀: "+look+"顏色: "+color+"價格: "+price+"年份: "+year);
	}
}
class Toyota extends Car
{
	Toyota(String type,String look,String color,int price,int year)
	{
		super(type,look,color,price,year);
	}
	@Override
	void demo()
	{
		System.out.println("Toyota車型: "+type+"外觀: "+look+"顏色: "+color+"價格: "+price+"年份: "+year);
	}
}