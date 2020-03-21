package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		
		String dateType = "yyyy-MM-dd HH:mm:ss a";
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateType);
		
		System.out.println(sdf.format(date));
		
		//利用生日获取当前的年龄
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		
		String brithday = "1996年4月26日";
		
		try {
			Date d = sdf2.parse(brithday);
			
			long mytime = d.getTime();
			
			long currentTime = new Date().getTime();
			
			System.out.println((currentTime - mytime) / 1000 / 60 / 60 / 24 / 365);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//获取年份、月份等
		Calendar cal = Calendar.getInstance();
		
		int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
 
        System.out.println("当期时间: " + cal.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);
		
		//时间戳
        simpledate();
        
	}

	public static void simpledate() {
		
		Long currentTime = System.currentTimeMillis();
		
		System.out.println(currentTime);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
//		String s1 = sdf1.format(new Date(Long.parseLong(String.valueOf(currentTime))));
		
		String s1 = sdf1.format(currentTime);
		
		System.out.println(s1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
		
		String s2 = sdf2.format(new Date(Long.parseLong(String.valueOf(currentTime))));
		
		System.out.println(s2);
		
	}

}
