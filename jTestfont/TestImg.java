package jTestfont;
/**
 * 匯入圖片檔，轉碼base64
 * */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class TestImg {

	public static void main(String[] args) throws IOException{
		Base64.Encoder encode = Base64.getEncoder();
		String path = "C:\\Users\\C404\\Desktop\\s.png";
		/*讀取檔案*/
		FileInputStream src = new FileInputStream(path);
		/*依檔案大小建立byte陣列*/
		byte[] pic = new byte[src.available()];
		/*將資料寫入*/
		src.read(pic);
		String b = encode.encodeToString(pic);
		src.close();
		System.out.print(b);
	}

}
