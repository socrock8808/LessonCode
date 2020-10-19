package j0723;
/**
 * 方法練習，矩形的面積周長角線 
 * */
public class Rectangle {

	public static void main(String[] args) {
		int hei=5,wei=9;
		System.out.println("矩形的面積為: "+ area(hei,wei));
		System.out.println("矩形的周長為: "+ period(hei,wei) );
		System.out.println("矩形的對角線長為: "+ diag(hei,wei));

	}
	public static int area(int w,int h)//面積
	{
		return w*h;
	}
	public static int period(int w,int h)//周長
	{
		return 2*(w+h);
	}
	public static double diag(int w,int h)//對角線
	{
		return Math.sqrt(w*w+h*h);
	}

}
