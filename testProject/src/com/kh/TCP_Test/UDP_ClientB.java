package com.kh.TCP_Test;
import java.io.*;
import java.net.*;

public class UDP_ClientB {
	public static void main(String[] args) {
		System.out.println("Client A");
		
		// 1 DataGramSocket 객체 생성
		DatagramSocket ds =null;
		try {
			ds = new DatagramSocket(10000);
		}catch(SocketException e) {
			e.printStackTrace();
		}
		
		
		byte[] receiveData = new byte[65508];
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		try {
			ds.receive(receivePacket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("수신 데이터 : " 
				+ new String(receivePacket.getData(), receivePacket.getOffset(), receivePacket.getLength()));
	}
}
