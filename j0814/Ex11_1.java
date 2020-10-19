package j0814;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 * Date練習
 * 薪資系統
 * 某人2020-04-01 08:00 開始上班 17:00下班
 * LocalDateTime.of(2020,4,1,8,0)
 * LocalDateTime.of(2020,4,1,17,0)
 * 至2020-07-29 13:00 離職
 * LocalDateTime.of(2020,7,29,13,0)
 * 1.每小時工資250元
 * 2.未做滿90天，薪資打8折
 * 3.中午休息1小時，工資不計
 * 請問此人可以領多少?
 * */
public class Ex11_1 {

	public static void main(String[] args) {
		final long dayPay = 250;//時薪
		final long dayHour = 17-8-1; //每天完整工時
		LocalDateTime from;
		LocalDateTime to;
		try {
			Scanner typ = new Scanner(System.in);
			System.out.print("請輸入您上班的時間(例2020-04-01-08:00):");
			String start1 = typ.next();
			if(start1.length() != 16) //確認格式
				throw new StringException();
			System.out.print("請輸入您離職的時間(例2020-07-29-13:00):");
			String start2 = typ.next();
			if(start2.length() != 16) //確認格式
				throw new StringException();
						from = LocalDateTime.of(Integer.parseInt(start1.subSequence(0,4).toString()),//年
												Integer.parseInt(start1.subSequence(5,7).toString()),//月
												Integer.parseInt(start1.subSequence(8,10).toString()),//日
												Integer.parseInt(start1.subSequence(11,13).toString()),//時
												Integer.parseInt(start1.subSequence(14,16).toString()));
			
						  to = LocalDateTime.of(Integer.parseInt(start2.subSequence(0,4).toString()),//年
												Integer.parseInt(start2.subSequence(5,7).toString()),//月
												Integer.parseInt(start2.subSequence(8,10).toString()),//日
												Integer.parseInt(start2.subSequence(11,13).toString()),//時
												Integer.parseInt(start2.subSequence(14,16).toString()));
			Duration dura = Duration.between(from, to);
			long day = dura.toDays(); //期間天數
			long lastDayHour = to.getHour()-8; //最後一天的工時
			if(to.getHour() < 17) //非完整的一天
			{
				day -= 1;
				if(to.getHour() > 12)
				{
					lastDayHour -= 1;
				}
			}
			else
				lastDayHour=0; //完整的一天
			long pay = (day*dayHour+lastDayHour)*dayPay;
			if(day < 90) //未滿90天打8折
				pay *= 0.8;
			System.out.println("總共可領:"+pay+"元");
			typ.close();
		} catch (StringException e) {
			System.out.println("輸入格式錯誤");
		}
	}
}
class StringException extends Exception{
	private static final long serialVersionUID = 1L;
}
