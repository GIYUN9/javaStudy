package com.kh.TCP_Test;

import java.net.*;
import java.io.*;

public class TCP_Client {
	public static void main(String[] args) {
		System.out.println("client start");
		
		try {
			Socket socket = new Socket(InetAddress.getByName("localhost"), 5000);
			System.out.println("서버접속완료");
			System.out.println("접속서버IP : " + socket.getInetAddress().getHostAddress());
			
			InputStream is = socket.getInputStream();
			BufferedInputStream isr = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(isr);
			// BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
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