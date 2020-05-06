package com.caowei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * 
 * �ֽ��ַ�ת����
 * OutputStreamWriter:���Խ�������ַ�ת��Ϊ�ӽ����������ʽ
 * InputStreamReader:��������ֽ���ת��Ϊ�ַ�������ʽ
 *
 */

public class ChangeStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		InputStream in = new FileInputStream("c:\\test\\t.txt");
//		read(in);
		OutputStream out = new FileOutputStream("c:\\test\\t.txt");
		write(out);
	}
	private static void write(OutputStream out) {
		Writer writer = new OutputStreamWriter(out,Charset.defaultCharset());
		try {
			writer.write("��������");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void read(InputStream in) {
		Reader reader = new InputStreamReader(in);
		char[] cs = new char[1024];
		int len = -1;
		try {
			while((len = reader.read(cs)) != -1) {
				System.out.println(new String(cs,0,len));
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
