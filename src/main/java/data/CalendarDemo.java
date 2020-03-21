package data;

import java.util.Calendar;

public class CalendarDemo {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2009, 6 - 1, 12);
		System.out.println(c.getTime());
		
		Calendar c1 = Calendar.getInstance();
		// 获得年份
		int year = c1.get(Calendar.YEAR);
		// 获得月份
		int month = c1.get(Calendar.MONTH) + 1;
		// 获得日期
		int date = c1.get(Calendar.DATE);
		// 获得小时
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		// 获得分钟
		int minute = c1.get(Calendar.MINUTE);
		// 获得秒
		int second = c1.get(Calendar.SECOND);
		// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
		int day = c1.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + " ----- " + month + " ----- " + date + " ----- " + hour + " ----- " + minute + " ----- " + second + " ----- " + day);
		
	}

}
