package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketClientTest {

	public static void main(String[] args) {

		try {
			Socket client = new Socket("127.0.0.1", 10086);
			
			System.out.println("客户端启动");
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			bw.write("我是客户端..............");
			bw.flush();
			
			bw.close();
			
			BufferedReader bis = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			System.out.println(bis.readLine());
			
//			bis.close();
//			
//			bw.close();
//			
//			client.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
