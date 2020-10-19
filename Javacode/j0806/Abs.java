package j0806;
/**
 * 介面練習
 * 求絕對值
 * */
public class Abs {

	public static void main(String[] args) {
		System.out.println(abss.absss(-974.14654));
	}
}
interface abss
{
	static double absss(double a)
	{
		if(a>=0)
		{
			return a;
		}
		else
		{
			return -a;
		}
	}
}
