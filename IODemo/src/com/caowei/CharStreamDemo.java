package com.caowei;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * �ַ�����
 * �ַ��������Writer,���ļ��Ĳ���ʹ�����ࣺFileWirter
 * �ַ���������Reader,���ļ��Ĳ���ʹ�����ࣺFileReader
 * ÿ�β����ĵ�λ��һ���ַ�
 * �ļ��ַ����������Դ����棬Ĭ�ϴ�С��1024�ֽڣ��ڻ���������ֶ�ˢ��
 * ��ر���ʱ�������д���ļ�
 *
 */
public class CharStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		out();
		in();
	}
	private static void in() {
		File file = new File("c:\\test\\t.txt");
		try {
			Reader in = new FileReader(file);
			char[] cs = new char[1];
			int len = -1;
			StringBuilder buf = new StringBuilder();
			while((len = in.read(cs))!=-1) {
				buf.append(new String(cs,0,len));
			}
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
		File file = new File("c:\\test\\t.txt");
		try {
			Writer out = new FileWriter(file,true);
			out.write("С����ˮ������");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
