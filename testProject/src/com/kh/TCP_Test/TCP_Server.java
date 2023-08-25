package com.kh.TCP_Test;

import java.io.*;
import java.net.*;


public class TCP_Server {
	public static void main(String[] args) {
		System.out.println("server start");
		
		String serverIP = null;
		// port는 1024번까지는 이미 사용되는 포트
		int port = 5000;
		
		ServerSocket serverSocket = null;
		
		try {
			// serverSocket 객체 생성 => port를 정해줘야한다.
			serverSocket = new ServerSocket(port);
			// 생성된 serverSocket 객체에서 서버의 InetAddress(ip정보를 가진 객체)
			// 가지고 온 뒤 IP를 확인한다.
			serverIP = serverSocket.getInetAddress().getHostAddress();
			
			//accept메서드는 클라이언트의 요청을 기다렸다가
			//요청이 도착하면 해당 소켓정보를 반환해준다.
			System.out.println("요청대기중...");
			Socket clientSocket = serverSocket.accept();
			// 생성된 clientIp 객체에서 서버의 InetAddress(ip정보를 가진 객체)
			// 가지고 온 뒤 IP를 확인한다.
			String clientIp = clientSocket.getInetAddress().getHostAddress();
			System.out.println("client접속 확인 : " + clientIp);
			
			InputStream is = clientSocket.getInputStream();
			BufferedInputStream isr = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(isr);
			// BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			OutputStream os = clientSocket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);
			
			String str = dis.readUTF();
			System.out.println(str);
			dos.writeUTF("반갑습니다.");
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
