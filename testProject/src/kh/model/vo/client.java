package kh.model.vo;
import java.net.*;
import java.io.*;

public class client {
	
	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
			
		Socket socket = new Socket(serverIP, port);
		InputStream is = socket.getInputStream();
		BufferedInputStream isr = new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(isr);
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("안녕하세요.");
		dos.flush();
		String str = dis.readUTF();
		System.out.println(str);
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
