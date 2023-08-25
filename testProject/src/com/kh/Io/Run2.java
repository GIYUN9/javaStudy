package com.kh.Io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Run2 {
	
	public static void main(String[] args) {
		try (FileWriter bw = new FileWriter("test.txt", true)) {
			bw.write("안녕하세요");
			bw.write("반갑습니다");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
