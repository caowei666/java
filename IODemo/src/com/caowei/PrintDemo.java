package com.caowei;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * 
 * ��ӡ�����ܷ���Ľ������
 * 
 * �ֽڴ�ӡ������ǿ�������
 * �ַ���ӡ����ͬ��
 *
 */

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bytePrint();
		CharPrint();
	}
	
	private static void bytePrint() {
		File file = new File("c:\\test\\t.txt");
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedOutputStream bos = new BufferedOutputStream(out);
		PrintStream ps = new PrintStream(bos);
		ps.print("С����ˮ������");
		ps.close();
		
	}
	private static void CharPrint() {
		File file = new File("c:\\test\\t.txt");
		Writer out = null;
		try {
			out = new FileWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bos = new BufferedWriter(out);
		PrintWriter ps = new PrintWriter(bos);
		ps.print("С����ˮ������123");
		ps.close();
	}

}
