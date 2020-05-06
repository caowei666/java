package com.caowei;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * �����Ŀ�ģ�
 * �����д���ļ�����ʱ��Ƶ���Ĳ����ļ��������������½�
 * BufferedOutputStream �ڲ�Ĭ�ϵĻ����С��8kB��ÿ��д��ʱ�洢�Ļ����byte�����У�
 * �����黺����ʱ���������д���ļ������һ����±����
 *
 *
 *�ַ�����
 *1�������ַ�����������ǿ��ȡ���ܣ�readLine����)
 *2������Ч�Ķ�ȡ����
 */

public class BufferStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byteWriter();
//		byteReader();
		charReader();
//		charWriter();
	}
	private static void charWriter() {
		File file = new File("c:\\test\\t.txt");
		try {
			Writer writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write("789");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void charReader() {
		File file = new File("c:\\test\\t.txt");
		try {
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			char[] cs = new char[1024];
			int len = -1;
			while((len = br.read())!=-1) {
				System.out.println(new String(cs,0,len));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void byteReader() {
		File file = new File("c:\\test\\t.txt");
		try {
			InputStream in = new FileInputStream(file);
			//����һ���ֽڻ�����
			BufferedInputStream bis = new BufferedInputStream(in);
			byte[] bytes = new byte[1024];
			int len = -1;
			while((len = bis.read(bytes)) != -1) {
				System.out.println(new String(bytes,0,len));
			}
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void byteWriter() {
		File file = new File("c:\\test\\t.txt");
		try {
			OutputStream out = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(out);
			String info = "��������";
			bos.write(info.getBytes());
			bos.close(); //�Զ��ر�out�����ֶ���
//			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
