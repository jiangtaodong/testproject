package socketdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	
	public static void main(String[] args) {
		
		Socket sc = null;
		
		try {
			sc = new Socket("localhost",10086);
			
			System.out.println("客户端启动...");
			
			DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
			
			dos.writeUTF("Hello from " + sc.getLocalSocketAddress());
			
			DataInputStream dis = new DataInputStream(sc.getInputStream());
			
			System.out.println(dis.readUTF());
			
			dis.close();
			dos.close();
			sc.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
