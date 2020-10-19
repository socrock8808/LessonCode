package j0826;
/**
 * input/output
 * Buffered
 * 注意編碼問題
 * */
import java.io.*;
public class P2200 {

	public static void main(String[] args) throws IOException{
		String str = "E:\\JAVA10902\\java\\io\\combine.txt";
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read()) != -1)
			System.out.print((char)i);
		fr.close();
		br.close();
		

	}

}
