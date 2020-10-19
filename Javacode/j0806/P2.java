package j0806;
/**
 * 介面練習：BMI工具
 * */
public class P2 {

	public static void main(String[] args) {
		Mymatha mm = new Mymatha();
		mm.output(1.73, 58);
	}
}
class Mymatha implements Bmi
{
	void output(double x,double y)
	{
		System.out.printf("%4.2f",Bmi.bmi(x,y));
	}
}
interface Bmi
{
	static double bmi(double h,double w)
	{
		return w/Math.pow(h, 2);
	}
}