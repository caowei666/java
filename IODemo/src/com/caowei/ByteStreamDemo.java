package com.caowei;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 *�ֽ����������
 *�����������OutputStream,���ļ��������ʹ������FileOutputStream
 *������������InputStream,���ļ���������ʹ������FileInputStream
 *
 */

public class ByteStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out();
		in();
	}
	private static void in() {
		//1��ȷ��Ŀ���ļ�
		File file = new File("C:\\\\test\\\\t.txt");
		try {
			//2����һ���ļ�����������
			InputStream in = new FileInputStream(file);
			byte[] bytes = new byte[1024*10]; //1024�ֽ�
			StringBuilder buf = new StringBuilder();
			int len = -1;//��ʾÿ�ζ�ȡ���ֽڳ���
			//��������뵽�����У������ض�ȡ���ֽ�������������-1ʱ��ʾ��ȡ������
			//����-1��ʾ�ļ��Ѿ�������
			while((len = in.read(bytes)) != -1) {
				//���ݶ�ȡ�����ֽ����飬��ת��Ϊ�ַ������ݣ���ӵ�StringBuilder��
				buf.append(new String(bytes));
			}
			//�ر�������
			in.close();
			System.out.println(buf);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void out() {
		//1��ȷ��Ŀ���ļ�
		//2������һ���ļ����������
		File file = new File("C:\\test\\t.txt");
		try {
			//Ĭ���Ǹ��ǵ�д�룬���ϵڶ�������true����ʾ׷������
			OutputStream out = new FileOutputStream(file,true);
			//3�������������,window�»���\r\n
			String info = "С����ˮ������\r\n";
			//��ȡ���з� == \r\n(windows��)
			//String line = System.getProperty("line.separator");
			//4��������д�뵽�ļ�
			out.write(info.getBytes());
			//5���ر���
			out.close();
			System.out.println("д����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
