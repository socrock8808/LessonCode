package j0806;
/**
 * 介面練習：計算面積
 * */
public class P3 {

	public static void main(String[] args) {
		Circle cc=new Circle();
		Four ff=new Four();
		Tri tt=new Tri();
		System.out.println(cc.area(5));
		System.out.println(ff.area(5,6));
		System.out.println(tt.area(5,6));
	}

}
interface Area
{
	double Pi = Math.PI;
	double area(int ...x);
}
class Circle implements Area//圓面積
{
	double result=0;
	public double area(int ...x)
	{
		for(double num:x)
		{
			result = Math.pow(num, 2)*Pi;
		}
		return result;
	}
}
class Four implements Area//矩形面積
{
	double result=1;
	public double area(int ...x)
	{
		for(double num:x)
		{
			result *= num;
		}
		return result;
	}
}
class Tri implements Area//三角形面積
{
	double result=1;
	public double area(int ...x)
	{
		for(double num:x)
		{
			result *= num;
		}
		return result/2;
	}
}