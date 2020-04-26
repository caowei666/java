package com.caowei;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SyStemRunTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���1");
		System.err.println("���2");
		int[] num1 = {1,2,3,4,5,6,7};
		int[] num2 = new int[num1.length];
		//���鸴��:������Դ���飬Դ������ʼλ�ã�Ŀ�����飬Ŀ��������ʼλ�ã�Ŀ�����鳤�ȣ�
		System.arraycopy(num1, 0, num2, 0, num1.length);
		System.out.println(Arrays.toString(num2));
		//���ص�ǰ�����ʱ��
		System.out.println(System.currentTimeMillis());
		Date nowDate = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		String now = df.format(nowDate);
		System.out.println(now);
		//�˳������:0���������˳�����0�����쳣�˳���ʹ�ø�
		//����������ͼ���������ʵ�ֳ�����˳����ܵ�/
//		System.exit(0);
		
		//��ȡ����
		//java�汾
		System.out.println(System.getProperty("java.version"));
		//java��װĿ¼
		System.out.println(System.getProperty("java.home"));
		//����ϵͳ����
		System.out.println(System.getProperty("os.name"));
		//����ϵͳ�İ汾
		System.out.println(System.getProperty("os.version"));
		//�û����˻�����
		System.out.println(System.getProperty("user.name"));
		//�û�����Ŀ¼
		System.out.println(System.getProperty("user.home"));
		//�û��ĵ�ǰ����Ŀ¼
		System.out.println(System.getProperty("user.dir"));
		
		Runtime rt = Runtime.getRuntime();
		//����������
		System.out.println("������������"+rt.availableProcessors());
		//JVM���ڴ�����λbyte
		System.out.println("JVM���ڴ�����"+rt.totalMemory());
		//JVM�����ڴ���
		System.out.println("JVM�����ڴ�����"+rt.freeMemory());
		//JVM���������ڴ���
		System.out.println("JVM���������ڴ�����"+rt.maxMemory());
		//�����Ľ���ִ���ַ�������
		try {
			rt.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
