package j0805;
/**
 * 多型練習
 * */
public class P1401 {

	public static void main(String[] args) {
		EE ee=new EE("台大","好棒棒");
		ME me=new ME("大業","成大葉");
		ee.demo();
		me.demo();
		
	}

}
class School
{
	protected String title;
	protected String name;
	School(String title,String name)
	{
		this.title=title;
		this.name=name;
	}
	void demo()
	{
		System.out.println("學校名稱: "+this.title+"\t學生姓名"+this.name);
	}
}
class ME extends School
{
	String department="機電";
	ME(String title,String name)
	{
		super(title,name);
	}
	@Override
	void demo()
	{
		System.out.println("學校名稱: "+this.title+"\t學生姓名"+this.name+"\t科系: "+this.department);
	}
}
class EE extends School
{
	String department="電機";
	EE(String title,String name)
	{
		super(title,name);
	}
	@Override
	void demo()
	{
		System.out.println("學校名稱: "+this.title+"\t學生姓名"+this.name+"\t科系: "+this.department);
	}
}