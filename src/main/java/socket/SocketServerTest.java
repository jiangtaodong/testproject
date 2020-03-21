package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerTest {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(10086);
			
			Socket skt = ss.accept();
			
			System.out.println("服务端启动");
			
			System.out.println("客户端:"+skt.getInetAddress().getLocalHost()+"已连接到服务器");
			
			BufferedReader bis = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			
			System.out.println(bis.readLine() + " ------------ ");
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()));
			
			bw.write("我是服务端..............");
			
			bw.flush();
			
			bw.close();
			
//			bw.close();
//			
//			bis.close();
//			
//			skt.close();
//			
//			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
