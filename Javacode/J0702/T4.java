package J0702;

/**
 * char型態練習
 * */
public class T4 
{
	public static void main(String[] args)
	{
		char ch1 ='A';
		char ch2 = 65;
		char ch3 = '\u0041'; // 0x0041
		char ch4 = 0x0041;
		char ch5 = 0101;
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		System.out.println("ch4 = " + ch4);
		System.out.println("ch5 = " + ch5);
		System.out.println("A的ACSII碼為 "+(int)ch1);//ACSII
	}
}
