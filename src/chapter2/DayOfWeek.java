package chapter2;

public enum DayOfWeek {
	Sun("日曜"), Mon("月曜"), Tue("火曜"), Wed("水曜"), Thu("木曜"), Fri("金曜"), Sat("土曜");
	private String weekday;
	private DayOfWeek(String weekday) {
		this.weekday = weekday;
	}
	public String getWeekDay(String day) {
		return this.weekday;
	}
}
