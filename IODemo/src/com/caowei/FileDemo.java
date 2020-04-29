package com.caowei;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File���ʾһ���ļ���Ŀ¼
		//C:\\test\\t.txt �� C:/test/t.txt
		File f1 = new File("C:\\test\\t1.txt");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
				System.out.println("�ļ������ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//f1.isFile()
		System.out.println("�Ƿ�Ϊ�ļ���"+f1.isDirectory());
		f1.delete();
		
		File f2 = new File("c:\\test\\my");
		if(!f1.exists()) {
			try {
				f2.createNewFile();
				System.out.println("�ļ��д����ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		String[] names = f2.list();
		System.out.println(Arrays.toString(f2.list()));
		boolean b = f2.delete();   //�����ļ����ļ��в���ɾ��
		System.out.println(b);
		
		File[] fs = f2.listFiles(); //�г���ǰĿ¼�µ������ļ�����file���󷵻�
		for(File f:fs) {
			System.out.println("length"+f.length());
			System.out.println("name"+f.getName());
			System.out.println("���·��"+f.getPath());
			System.out.println("����·��"+f.getAbsolutePath());
			System.out.println("�Ƿ�Ϊ�����ļ�"+f.isHidden());
			System.out.println("�Ƿ�ɶ��ļ�"+f.canRead());
			Date date = new Date(f.lastModified());
			DateFormat df = new SimpleDateFormat("HH:mm:ss");
			System.out.println("�ļ�����޸ĵ�ʱ��"+df.format(date));
		}
		File f3 = new File("temp.txt");
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.getPath());
		
		//�����ļ���
		File f4 = new File("c:\\test\\dabin1");
		f4.mkdir();
		//���������ƶ��ļ�
//		f4.renameTo(new File("c:\\\\test\\\\dabin1"));
		f4.renameTo(new File("c:\\dabin1"));
		
		File f5 = new File("c:\\test\\my");
//		File[] files1 = f5.listFiles(new FileFilter() {
//
//			@Override
//			public boolean accept(File pathname) {
//				// TODO Auto-generated method stub
//				return pathname.getName().endsWith(".txt");
//			}
//			
//		});
		File[] files1 = f5.listFiles((pathname)->pathname.getName().endsWith(".txt"));
		for(File f:files1) {
			System.out.println(f.getName());
		}
		System.out.println("------------");
	}

}
