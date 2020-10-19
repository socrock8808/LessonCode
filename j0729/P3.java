package j0729;
/**
 * 類別練習：建構子、方法
 * */
public class P3 {

	public static void main(String[] args) {
		Car bus = new Car(6,2000);
		Car truck = new Car(8,6000);
		System.out.println("buswheel="+bus.showwheel());
		System.out.println("busengine="+bus.showengine());
		System.out.println("truckwheel="+truck.showwheel());
		System.out.println("truckengine="+truck.showengine());
	}

}
class Car
{
	private int wheel;
	private int engine;
	Car(int n,int m)
	{
		this.wheel = n;
		this.engine = m;
	}
	Car()
	{
		this.wheel =10;
		this.engine =1600;
	}
	public int showwheel()         
	{
		return this.wheel;
	}
	public int showengine()
	{
		return this.engine;
	}
}