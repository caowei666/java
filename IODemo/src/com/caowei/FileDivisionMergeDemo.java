package com.caowei;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDivisionMergeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * �ļ��ָ�
	 * File:Ҫ�ָ���ļ���cutSize:ÿ���ļ���С
	 */
	private static void divsion(File targetFile,long cutSize) {
		if(targetFile == null)return;
		int num = targetFile.length()%cutSize == 0?
				(int)(targetFile.length()/cutSize):(int)(targetFile.length()/cutSize+1);
		//����һ���ļ�������
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(targetFile));
			BufferedOutputStream out = null;
			byte[] bytes = null;   //ÿ�ζ�ȡ���ֽ���
			int len = -1;
			int count = 0;  //ÿ���ļ�Ҫ���Ĵ���
			for(int i=0;i<num;i++) {
				out = new BufferedOutputStream(new FileOutputStream(new File("c:\\test\\"+(i+1)+"temp"+targetFile.getName())));
				if(cutSize <= 1024) {
					bytes = new byte[(int)cutSize];
					count = 1;
				}else {
					bytes = new byte[1024];
					count = (int)cutSize/1024;
				}
				while(count>0 && (len=in.read(bytes))!=-1) {
					out.write(bytes,0,len);
					out.flush();
					count--;
				}
				if(cutSize%1024!=0) {
					bytes = new byte[(int)cutSize%1024];
					len = in.read(bytes);
					out.write(bytes,0,len);
					out.flush();
					out.close();
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * �ļ��ϲ�
	 */
	public static void merge() {
		
	}

}
