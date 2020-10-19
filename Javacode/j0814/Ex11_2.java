package j0814;

import java.time.LocalDate;
import java.time.Period;

/**
 * Date練習
 * 薪資系統
 * 某客運司機
 * 1.每天工作不可超過11小時，月休8天
 * 2.超過11小時，每小時加薪200元
 * 3.司機從2020-07-01至07-31，共駕駛266小時
 * 4.若底薪4萬元，司機可領多少
 * */
public class Ex11_2 {

	public static void main(String[] args) {
		LocalDate from = LocalDate.of(2020,7,1);
		LocalDate to = LocalDate.of(2020,7,31);
		Period per = Period.between(from, to);
		final long totalHour = 266; //該月總工時
		final long addPay = 200; //加班費
		final long monthPay = 40000; //月薪4萬
		final long dayHour = 11; //每天工時11小時
		//----薪資=(總工時-(該月總天數-月休天數)*每天工時)*加班費+月底新----
		long pay = (totalHour-(per.getDays()-8)*dayHour)*addPay+monthPay;
		System.out.println("共可領:"+pay+"元");
	}
}
