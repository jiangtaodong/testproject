package ip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class GetIp {

	public static void main(String[] args) {

//		test1();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
//		test2();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");

//		test3();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
//		test4();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
//		test5();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
//		test6();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
		
//		test7();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
//		test8();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
		test9();
		
		System.out.println(" ------------------------------------------------------------------------------------------ ");
		
		test10();
	}

	private static void test10() {
		int[] num7 = {1, 3, 5, 2, 8, 9, 5, 0};
		int x7 = num7[0];
		for (int i = 0; i <= num7.length-1; i++)
		{
		    if(num7[i] < x7)
		    {
		        x7 = num7[i];
		    }
		}
		System.out.println(x7); 
		
	}

	public static void test1() {

		Socket skt;
		
		String host = "localhost";
		
		for(int i = 0; i < 1024; i++) {
			
			System.out.println("查看 "+ i);
			
			try {
				skt = new Socket(host, i);
				
				System.out.println("端口 " + i + " 已被使用");
			} catch (UnknownHostException e) {
				System.out.println("Exception occured"+ e);
	            break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
	
	public static void test2() {

		InetAddress iAddress;
		
		try {
			iAddress = InetAddress.getByName("www.baidu.com");
			
			System.out.println(iAddress.getHostName() + "=" + iAddress.getHostAddress());
	        System.exit(0);
	        
		} catch (UnknownHostException e) {
			System.exit(2);
		}
		
	}
	
	public static void test3() {

		// 检测本地 80 端口
        log(isSocketAliveUitlitybyCrunchify("localhost", 80));
 
        // 检测本地 8080 端口
        log(isSocketAliveUitlitybyCrunchify("localhost", 8080));
 
        // 检测本地 8081 端口
        log(isSocketAliveUitlitybyCrunchify("localhost", 8081));
 
        // 检测 runoob.com 的 80 端口
        log(isSocketAliveUitlitybyCrunchify("runoob.com", 80));
 
         // 检测 runoob.com 的 443 端口
        log(isSocketAliveUitlitybyCrunchify("runoob.com", 443));
 
        // 检测 runoob.com 的 81 端口
        log(isSocketAliveUitlitybyCrunchify("runoob.com", 81));
		
	}

	/**
     * 判断主机端口
     * 
     * @param hostName
     * @param port
     * @return boolean - true/false
     */
    public static boolean isSocketAliveUitlitybyCrunchify(String hostName, int port) {
        boolean isAlive = false;
 
        // 创建一个套接字
        SocketAddress socketAddress = new InetSocketAddress(hostName, port);
        Socket socket = new Socket();
 
        // 超时设置，单位毫秒
        int timeout = 2000;
 
        log("hostName: " + hostName + ", port: " + port);
        try {
            socket.connect(socketAddress, timeout);
            socket.close();
            isAlive = true;
 
        } catch (SocketTimeoutException exception) {
            System.out.println("SocketTimeoutException " + hostName + ":" + port + ". " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println(
                    "IOException - Unable to connect to " + hostName + ":" + port + ". " + exception.getMessage());
        }
        return isAlive;
    }
 
    private static void log(String string) {
        System.out.println(string);
    }
 
    private static void log(boolean isAlive) {
        System.out.println("是否真正在使用: " + isAlive + "\n");
    }
    
    public static void test4() {

    	InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			System.out.println("Local HostAddress: " + addr.getHostAddress());
	        String hostname = addr.getHostName();
	        System.out.println("Local host name: "+hostname);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    public static void test5() {

    	int size;
    	
    	try {
			URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
			
			URLConnection uc = url.openConnection();
			
			size = uc.getContentLength();
				
			if(size < 0) {
				
				 System.out.println("无法获取文件大小。");
				
			}else {
				
				System.out.println("文件大小为：" + size + " bytes");
				
			}
			
			uc.getInputStream().close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    public static void test6() {

    	try {
			URL url = new URL("http://www.runoob.com");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\test\\data.html"));
			
			String str;
			
			while((str = br.readLine()) != null) {
				
				System.out.println(str);
				bw.write(str);
				bw.newLine();
				
			}
			
			bw.close();
			
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    public static void test7() {

    	URL url;
		try {
			url = new URL("http://www.runoob.com");
			 HttpURLConnection httpCon = 
				        (HttpURLConnection) url.openConnection();
				        long date = httpCon.getDate();
				        if (date == 0)
				        System.out.println("无法获取信息。");
				        else
				        System.out.println("Date: " + new Date(date));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    public static void test8() {

    	try {
			URL url = new URL("http://www.runoob.com");
			
			URLConnection urlc = url.openConnection();
			
			Map map = urlc.getHeaderFields();
			
			Set<String> keys = map.keySet();
			
			for(String key : keys) {
				
				String val = urlc.getHeaderField(key);
				
				System.out.println(key + " ------ " + val);
				
			}
			
			urlc.getInputStream().close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   	}
    
    public static void test9() {
    	
    	try {
			URL url = new URL("http://www.runoob.com");
			
			System.out.println("URL 是 " + url.toString());
		      System.out.println("协议是 " + url.getProtocol());
		      System.out.println("文件名是 " + url.getFile());
		      System.out.println("主机是 " + url.getHost());
		      System.out.println("路径是 " + url.getPath());
		      System.out.println("端口号是 " + url.getPort());
		      System.out.println("默认端口号是 " 
		      + url.getDefaultPort());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   	}
    
}
