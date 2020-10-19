package j0826;
/**
 * FileInputStream
 * */
import java.io.*;
public class Ex2203 {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("E:\\JAVA10902\\java\\io\\pic1.png");
			BufferedInputStream buf = new BufferedInputStream(fi);
			System.out.println("檔案大小: "+ fi.available());
			fi.close();
			buf.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
