package com.caowei;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ��������
 *������޹صĲ���JAVA�Ļ�����������
 */

public class DataStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write();
		read();
	}
	private static void read() {
		File file = new File("c:\\test\\t.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(in);
			DataInputStream dis = new DataInputStream(bis);
			int num = dis.readInt();
			byte b = dis.readByte();
			String s = dis.readUTF();
			System.out.println(num+","+b+","+s);
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void write() {
		File file = new File("c:\\test\\t.txt");
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(out);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeInt(10);   //intռ��4���ֽ�
			dos.writeByte(1);   //byteռ��һ���ֽ�
			dos.writeUTF("��");
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
