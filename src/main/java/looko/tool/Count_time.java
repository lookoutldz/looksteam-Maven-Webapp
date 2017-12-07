package looko.tool;

public class Count_time {
	
	public static String countTimeBetween(int time_before, int time_after)
	{
		int between = time_after - time_before;
		return countAsAccurateDay(between);
	}
	
	public static String countAsAccurateDay(int time)
	{
		int days = time / 3600 / 24;
		int hours = time / 3600 % 24;
		int minutes = time / 60 % 60;
		int seconds = time % 60;
		
		return MyTimeFormatter(days, hours, minutes, seconds);
	}
	
	private static String MyTimeFormatter(int days, int hours, int minutes, int seconds)
	{
		String d = "days ";
		String h = "hours ";
		String m = "minutes ";
		String s = "seconds ";
		if(days <= 1)
			d = "day ";
		if(hours <= 1)
			h = "hour ";
		if(minutes <= 1)
			m = "minute ";
		if(seconds <= 1)
			s = "second ";
		return days+ d + hours + h + minutes + m + seconds + s;
	}
}
