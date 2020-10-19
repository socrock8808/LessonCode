package j0902;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Map
 * 小型字典程式(繁->簡)
 * */
public class Ex2404 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		for(int i=1;i<11;i++)
			map.put("繁體"+i, "簡體"+i);
		boolean flag = true;
		Scanner typ = new Scanner(System.in);
		while(flag)
		{
			System.out.println("字典程式，請輸入查詢字。輸入q結束");
			String str = typ.next();
			if(str.equals("q"))
			{
				flag = false;
				break;
			}
			if(map.containsKey(str))
			{
				System.out.println(map.get(str));
			}
			else
			{
				System.out.println("查無此字");
			}
		}
		System.out.println("程式結束");
		typ.close();
	}

}
