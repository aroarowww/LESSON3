package chapter2;

import java.util.Scanner;
import chapter2.DayOfWeek;

public class Main {
	public static void main(String[] args) {
		System.out.print("曜日を入力して下さい：");
		String input = new Scanner(System.in).nextLine();
		DayOfWeek week = DayOfWeek.valueOf(input);
		// 以下に処理を記述
//		キーボードからの入力で曜日名を受け取り、該当するenumインスタンスを取得して、
//		曜日の日本語名を出力してください。
		switch (week) {
		case Sun: {
			System.out.println(DayOfWeek.getWeekDay("sun") + "日です。");
			break;
		}
		case Mon: {
			System.out.println(DayOfWeek.getWeekDay("mon") + "日です。");
			break;
		}
		}
	}
}