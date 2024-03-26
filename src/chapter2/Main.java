package chapter2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("曜日を入力して下さい：");
		String input = new Scanner(System.in).nextLine();
		DayOfWeek week = DayOfWeek.valueOf(input);
		//input.close();

		// 以下に処理を記述
//		キーボードからの入力で曜日名を受け取り、該当する/インスタンスを取得して、
//		曜日の日本語名を出力してください。
		switch (week) {
		case Sun: 
			System.out.println(week.getWeekDay("sun") + "日です。");//enu.mはインスタンスなしで使えない、
																	//そのためここでDayOfWeek.getWeekDay("sun")はエラーが出る
			break;
		
		case Mon: 
			System.out.println(week.getWeekDay("mon") + "日です。");
			break;
		
		case Tue: 
			System.out.println(week.getWeekDay("sun") + "日です。");
			break;
		
		case Wed: 
			System.out.println(week.getWeekDay("mon") + "日です。");
			break;
		
		case Thu: 
			System.out.println(week.getWeekDay("sun") + "日です。");
			break;
		
		case Fri: 
			System.out.println(week.getWeekDay("mon") + "日です。");
			break;
		
		case Sat: 
			System.out.println(week.getWeekDay("sun") + "日です。");
			break;
		}
	}
}