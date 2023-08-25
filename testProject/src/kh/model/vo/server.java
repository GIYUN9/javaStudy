package kh.model.vo;
import java.io.*;
import java.net.*;

public class server {
	
	public static void main(String[] args) {
	int port = 3000;
	
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
				InputStream is = client.getInputStream();
				BufferedInputStream isr = new BufferedInputStream(is);
				DataInputStream dis = new DataInputStream(isr);
				
				
				OutputStream os = client.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				DataOutputStream dos = new DataOutputStream(bos);
				
				String str = dis.readUTF();
				System.out.println(str);
				dos.writeUTF("반갑습니다.");
				dos.flush();
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
