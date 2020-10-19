package j0806;
/**
 * 介面練習：實作介面
 * */
public class P1 {

	public static void main(String[] args) {
		int x=10,y=5;
		CCalculator cc=new CCalculator();
		cc.add(x, y);
		cc.output();
		cc.sub(x, y);
		cc.output();
		cc.mul(x, y);
		cc.output();
		cc.div(x, y);
		cc.output();
	}

}
class CCalculator implements IBasicCompute
{
	double result;
	public void add(int x,int y)
	{
		result= x+y;
	}
	public void sub(int x,int y)
	{
		result= x-y;
	}
	public void mul(int x,int y)
	{
		result= x*y;
	}
	public void div(int x,int y)
	{
		result= (double)x/y;
	}
	void output()
	{
		System.out.println(result);
	}
}
interface IBasicCompute
{
	void add(int x,int y);
	void sub(int x,int y);
	void mul(int x,int y);
	void div(int x,int y);
}