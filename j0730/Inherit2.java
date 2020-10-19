package j0730;
/**
 * 繼承練習
 * 嘗試Override
 * */
public class Inherit2 {

	public static void main(String[] args) {
		//宣告父類別變數，建立子類別物件
		Fath aa = new Sun();
		aa.show(); //能使用Override的子類別方法
		//aa.barking; //不能用子類別新增的方法

	}

}
class Fath
{
	void show()
	{
		System.out.println("Father show");
	}
}
class Sun extends Fath
{

	@Override
	void show() {
		System.out.println("Sun show");
	}
	void barking()
	{
		System.out.println("Sun barking");
	}
		
}