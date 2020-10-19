package j0814;
/**
 * date練習，猜數字遊戲
 * */
import java.time.*;
import java.util.Scanner;
public class P1101 {

	public static void main(String[] args) {
		Instant from,to;
		final int pwd = (int)(Math.random()*99);
		int num,start=0,end=99;
		Scanner typ = new Scanner(System.in);
		from = Instant.now();
		Duration dura;
		for ( ; ; ) 
		{
			try {
				System.out.print("請猜數字，範圍是" + start + "~" + end + ":");
				num = typ.nextInt();
				to = Instant.now();
				dura = Duration.between(from, to);
				if(dura.toMinutes() >=1){
					System.out.println("遊戲超時!，您輸了!"); //限時1分鐘
					break;
				}
				if (num < start || num > end) {
					throw new GuessNumException(); //若超出範圍丟出例外
				}
				if (num == pwd) {
					System.out.println("猜對了!");
					to = Instant.now();
					break;
				} else if (num > pwd) {
					end = num;
					System.out.println("猜小一點");
				} else {
					start = num;
					System.out.println("猜大一點");
				}
			} catch (GuessNumException e) {
				System.out.println("範圍錯誤!");
			}
		}
		dura = Duration.between(from, to);
		System.out.println("本次遊戲所花時間:"+dura);
		typ.close();
	}

}
class GuessNumException extends Exception{
	private static final long serialVersionUID = 1L;
}
