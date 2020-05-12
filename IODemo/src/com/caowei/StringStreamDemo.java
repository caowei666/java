package com.caowei;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * 
 * �ַ�����:��һ���ַ���Ϊ����Դ��������һ���ַ���
 * ���ã���web�����У������ڷ������ϻ�ȡ���ݣ����ݵķ��ظ�ʽͨ����һ���ַ�����XML,JSON��
 * ������Ҫ������ַ��������һ���ַ�����Ȼ������һ�������������ݽ���������������
 * StringWriter:�ַ���д����
 */

public class StringStreamDemo {

	public static void main(String[] args) {
		stringReader();
	}
	private static void stringReader() {
		String info = "good good study day dya up";
		StringReader sr = new StringReader(info);
		//�������
		StreamTokenizer st = new StreamTokenizer(sr);
		int count = 0;
		while(st.ttype != StreamTokenizer.TT_EOF) {
			try {
				if(st.nextToken() == StreamTokenizer.TT_WORD) {
					count++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sr.close();
		System.out.println("count="+count);
	}
}
