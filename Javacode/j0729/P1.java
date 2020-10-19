package j0729;
/**
 * 類別練習
 * */
public class P1 {

	public static void main(String[] args) {
		Ctest cc = new Ctest();
		cc.num = 25;
		if(cc.show() ==1)
		{
			System.out.println(cc.num+"為奇數");
		}
		else
		{
			System.out.println(cc.num+"為偶數");
		}
	}

}
class Ctest
{
	int num;
	int show()
	{
		return num%2;
	}
}


