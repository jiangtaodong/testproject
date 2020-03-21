package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IoStreamTest {

	public static void main(String[] args) {
		
		File file = new File("F:\\newfile.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileOutputStream fos = null;
		
		OutputStreamWriter osw = null;
		
		boolean state = true;
		
		try {
			
			fos = new FileOutputStream(file);
			
			osw = new OutputStreamWriter(fos);
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
			
			do {
				
				System.out.println("请输入：");
				System.out.println("输入“q”退出！");
				
				String str = br.readLine();
				
				if(str.equals("q")) {
					
					state = false;
					
					System.out.println("***************try*********************");
					
//					int a;
//					a = 'h';
//					
//					System.out.write(a);
					
					osw.append(sdf.format(date) + "：");
					osw.append("\n");
					osw.append("     " + "退出成功！");
					osw.append("\n");
					osw.flush();
					
					System.out.println("退出成功！");
					
					osw.close();
					
					fos.close();
					
					br.close();
					
					return;
					
				}
				
				System.out.println("************************************");
				
				System.out.println(str);
				
				osw.append(sdf.format(date) + "：");
				osw.append("\n");
				osw.append("     " + str);
				osw.append("\n");
				osw.flush();
				
				System.out.println("************************************");
				
			}while(state);
			
//			int a = 0;
//			int b = 5;
//			int c = b / a;
//			
//			System.out.println(c);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("*****************catch*******************");
			
			e.printStackTrace();
			
			return;
			
		} finally {
			
			System.out.println("***************finally*********************");
			
			return;
			
		}
		
	}
	
}
