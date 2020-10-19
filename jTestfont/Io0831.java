package jTestfont;
/**
 * 練習讀取存放帳號密碼的檔案
 * */
import java.io.*;

public class Io0831 {

	public static void main(String[] args) throws IOException {
		String name = "E:\\JAVA10902\\servlet\\10Ajax\\FileIO\\user.txt";
		File file = new File(name);
        BufferedReader input = new BufferedReader(
        							new FileReader(file));
        String str = input.readLine();
        String[] ss= str.split(",");
        input.close();
        System.out.println("帳號是:" + ss[0]);
        System.out.println("密碼是:" + ss[1]);
	}

}
