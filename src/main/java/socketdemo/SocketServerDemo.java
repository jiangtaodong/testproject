package socketdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo {

	public static void main(String[] args) {
			
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(10086);
			
			Socket serverInfo = ss.accept();
			
			System.out.println("服务端启动...");
			
			DataInputStream dis = new DataInputStream(serverInfo.getInputStream());
			
			System.out.println(dis.readUTF());
			
			DataOutputStream dos = new DataOutputStream(serverInfo.getOutputStream());
			
			dos.writeUTF("我是服务端......");
			
			dos.close();
			
			dis.close();
			
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
