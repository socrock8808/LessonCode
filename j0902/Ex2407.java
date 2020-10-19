package j0902;
/*
 * Collections.shuffle()亂序
 * */
import java.util.*;
public class Ex2407 {

	public static void main(String[] args) {
		ArrayList<String> poke = new ArrayList<String>();
		poke.add("1");poke.add("2");poke.add("3");poke.add("4");poke.add("5");
		poke.add("6");poke.add("7");poke.add("8");poke.add("9");poke.add("10");
		poke.add("J");poke.add("Q");poke.add("K");
		System.out.println("原本的內容");
		System.out.println(poke);
		for(int i=0;i<10;i++)
		{
			Collections.shuffle(poke);
			System.out.println("第"+(i+1)+"次亂序 "+poke);	
		}

	}

}
