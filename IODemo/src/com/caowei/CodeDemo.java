package com.caowei;

import java.io.UnsupportedEncodingException;

public class CodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "С����ˮ������"; //Ĭ�ϱ���GB2312
		String newInfo;
		try {
			newInfo = new String(info.getBytes("gb2312"),"iso8859-1");//תΪ8859-1
			System.out.println(newInfo);
			String newInfo2 = new String(newInfo.getBytes("iso8859-1"),"gb2312");
			System.out.println(newInfo2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
