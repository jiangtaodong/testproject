package data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
	
	public static void main(String[] args) {
		
		Date data = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy-MM-dd HH:mm:ss-SS-E-D--k--z");
		
//		long datal = data.getTime();
		
		System.out.println(sdf.format(data));
		System.out.println("-----------------------------------------------");
		System.out.printf("%tR",data);
		
	}

}
