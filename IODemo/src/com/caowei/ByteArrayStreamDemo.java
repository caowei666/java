package com.caowei;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
/**
 * �ֽ������������ڴ��д����ַ���
 * �����ڴ�������ڲ�ά����һ���ֽ� ���飬���ǿ����������Ķ�ȡ�����������ַ���
 * ����Ҫ�ر�
 */

public class ByteArrayStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byteArray();
	}
	private static void byteArray() {
		String s = "123fagrreg$#!@%$&^&GSSGTH";
		ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int curr = -1; //ÿ�ζ�ȡ���ֽ�
		while((curr=bais.read())!=-1) {
			if((curr>=65 && curr <= 90) || (curr>=97 &&curr <=122)) {
				baos.write(curr);
			}
		}
		//��ʱ����رգ�ԭ��ʱ�ֽ��������ǻ����ڴ�Ĳ�����
		System.out.println(baos.toString());
		System.out.println(baos.toString().length());
	}
}
