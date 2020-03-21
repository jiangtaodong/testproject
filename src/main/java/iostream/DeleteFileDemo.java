package iostream;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		File folder = new File("F:\\test");
		
		deletefolder(folder);

	}

	public static void deletefolder(File folder) {
		
		File[] files1 = folder.listFiles();
		
		for(File f1:files1) {
			
			if(f1.isDirectory()) {
				
				System.out.println("*****isDirectory***** 路径为：" + f1 + " --------------- " + f1.getPath());
				
				if(f1.listFiles().length >0) {
					
					next(new File(f1.getPath()));
					
				}
				
			}else if(f1.isFile()) {
				
				System.out.println("*****isFile***** 路径为：" + f1);
				
			}
			
		}
		
	}
	
	public static void next(File nextFile) {
		
		File[] files2 = nextFile.listFiles();
		
		for(File f2:files2) {
			
			if(f2.isDirectory()) {
				
				System.out.println("*****isDirectory***** 路径为：" + f2 + " --------------- " + f2.getPath());
				
				if(f2.listFiles().length > 0) {
					
					deletefolder(new File(f2.getPath()));
					
				}
				
			}else if(f2.isFile()) {
				
				System.out.println("*****isFile***** 路径为：" + f2);
				
			}
			
		}
		
	}

}
