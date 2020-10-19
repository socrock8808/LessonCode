package j0826;
/**
 * input/output
 * Buffered
 * 合併檔案，並輸出
 * */
import java.io.*;
public class Ex2205 {

	public static void main(String[] args) throws IOException{
		FileReader rd1 = new FileReader("E:\\JAVA10902\\java\\io\\A.txt");
		FileReader rd2 = new FileReader("E:\\JAVA10902\\java\\io\\B.txt");
		FileReader rd3 = new FileReader("E:\\JAVA10902\\java\\io\\C.txt");
		FileWriter fr = new FileWriter("E:\\JAVA10902\\java\\io\\combine.txt",true);
		int i;
		while( (i = rd1.read()) != -1)
		{	
			char ch = (char)i;
			fr.write(ch);
		}
		fr.write('\n');
		while( (i = rd2.read()) != -1)
		{	
			char ch = (char)i;
			fr.write(ch);
		}
		fr.write('\n');
		while( (i = rd3.read()) != -1)
		{	
			char ch = (char)i;
			fr.write(ch);
		}
		rd1.close();
		rd2.close();
		rd3.close();
		fr.close();
	}

}
