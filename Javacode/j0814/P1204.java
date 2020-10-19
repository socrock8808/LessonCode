package j0814;
/**
 * String類別練習
 * 字串搜尋
 * 計算某字串出現次數
 * */
public class P1204 {

	public static void main(String[] args) {
		String book = "神鵰俠侶是楊過與小龍女的故事，我喜歡小龍女在古墓生活的片段，小龍女清新脫俗美若天仙";
		String s = "小龍女"; //目標字串
		int end = book.lastIndexOf(s); //字串最後出現位置
		int count=0; //計算出現次數
		int tmp=0; //搜尋暫存區
		for( ; ; ){
			tmp = book.indexOf(s, tmp);
			count++;
			if( tmp == end){
				break;
			}
			tmp++;
		}
		System.out.println("目標字串出現過"+count+"次");	
	}
}
