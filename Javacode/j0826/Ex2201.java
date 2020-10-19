package j0826;
/**
 * FileInputStream
 * 圖片複製練習(路徑、檔名自行輸入)
 * */
import java.io.*;
public class Ex2201 {

	public static void main(String[] args) throws IOException{
		/*更換輸入類別*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入複製來源路徑: ");
		String typ = br.readLine();	
		/*讀取檔案*/
		//來源 E:\\JAVA10902\\java\\io\\pic1.png
		FileInputStream src = new FileInputStream(typ);
		System.out.println("檔案大小: "+ src.available());
		/*依檔案大小建立byte陣列*/
		byte[] pic = new byte[src.available()];
		/*將資料寫入*/
		src.read(pic);
		/*取出路徑(刪除檔案名稱)*/
		int index = typ.lastIndexOf("\\");
		typ = typ.substring(0, index+1);
		//目的 pic2.png
		System.out.print("請輸入目的檔案名稱(xx.png): ");
		String typ2 = br.readLine();
		typ = typ.concat(typ2);
		FileOutputStream dst = new FileOutputStream(typ);
		/*輸出檔案*/
		dst.write(pic);
		src.close();
		dst.close();
		System.out.println("複製完成");
	}

}
