package filetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTest {

	public static void main(String[] args) {

//		test();
		
		test2();
		
		test3();
		
		test4();
		
	}

	public static void test() {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\test\\runoob.txt"));
			
			bw.write("菜鸟教程");
			
			bw.flush();
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test2() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("f:\\test\\runoob.txt"));
			
			String str;
			
			while((str = br.readLine()) != null ) {
				
				System.out.println(str);
				
			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test3() {

		try {
			
		File f = new File("f:\\test\\runoob.txt");
		
		InputStream is = new FileInputStream(f);
		
		OutputStream os = new FileOutputStream(new File("f:\\test\\t1.txt"),true);
		
		byte[] b = new byte[1024];
		
		int i;
		
		while((i = is.read(b)) > 0) {
			
			os.write(b, 0, i);
			
		}
		
		BufferedReader br = new BufferedReader(new FileReader("f:\\test\\t1.txt"));
		
		String s;
		
		while((s = br.readLine()) != null) {
			
			System.out.println(s);
			
		}
		
		br.close();
		
		os.close();
		
		is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test4() {

		File file = null;
        File dir = new File("f:\\test");
        try {
			file = File.createTempFile
			("JavaTemp", ".javatemp", dir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(file.getPath());
        
        System.out.println(" -------------------- ");
        
        File ffilter = new File("f:\\test");
        
        FilenameFilter ff = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.startsWith("t");
			}
		};
		
		String[] dirs = ffilter.list(ff);
		
		for(int i = 0; i < dirs.length; i++) {
			
			String filname = dirs[i];
			
			System.out.println(filname);
			
		}
		
		System.out.println(" -------------------- ");
		
		File[] roots = File.listRoots();
        System.out.println("系统所有根目录：");
        for (int i=0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
        
        System.out.println(" -------------------- ");
        
        String curname = System.getProperty("user.dir");
        
        System.out.println(curname);
		
	}

}
