package J0701;
/**
 * java練習一，練習輸出
 * */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int bb = 8;
			//float f = 3.141592653589747932f; //float要加f 
			//double dd = 3.141592653589747932;  //double不用加d
			//String str = "文字";
			System.out.println("Hello world"); //換行輸出
			System.out.print("The nice boat\n"+bb*2);//\n為換行
			System.out.println("Good morning");
			System.out.printf("I love Java %d%n", bb);//標準輸出格式
			//System.out.format
			System.out.print("The end");//不換行輸出
	}
}