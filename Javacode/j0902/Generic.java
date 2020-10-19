package j0902;
/**
 * 泛型練習
 * */
public class Generic {

	public static void main(String[] args) {
		Cal<Integer> cc = new Cal<Integer>(13,2);
		Show<String> ss = new Show<String>();
		System.out.print(ss.show("dsd", "dsd"));
	}

}
class Cal <T extends Number>{
	public Cal(T n1,T n2){
		System.out.println(add(n1,n2));
	}
	public Double add(T n1,T n2)
	{
		return n1.doubleValue()+n2.doubleValue();
	}
}
class Show<T>{
	public T show(T n1,T n2){
		return (T)(n1 +","+n2);
	}
}