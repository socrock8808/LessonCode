package j0902;
/*讀取字典內容*/
/*資料形式
 * E1=中1
 * E2=中2
 * E3=中3...
 * */
import java.io.*;
/**
 * Map
 * 小型字典程式(資料透過外部檔案)
 * 註:Map的輸出格式為{E1=中1, E2=中2, ...}
 * map.toString().getBytes()換成byte資料即可輸出
 * */
import java.util.*;
public class Ex2406 {

	public static void main(String[] args) throws IOException {
		HashMap<String,String> map = new HashMap<String,String>();
		/*BufferedReader才有回傳String的方法*/
		BufferedReader br = new BufferedReader(new FileReader("dic.txt"));
		String tmp = null;
		/*將整行以=作為分隔分成key,value*/
		while( (tmp = br.readLine()) != null)
		{
			String[] str = tmp.split("=");
			map.put(str[0], str[1]);
		}
		/*字典*/
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
		br.close();
	}

}
