package com.caowei.ex;
/**
 * 
 * �Զ����쳣��ͨ����ͨ���̳�һ���쳣����ʵ��
 * 		1��Throwable
 * 		2��Exception
 * 		3��RuntimeException
 *�Զ����쳣��ʵ������д����Ĺ��췽��
 *�쳣��������û��ʵ�ʹ��ܣ�ֻ��һ��������ı�ʶ
 */

public class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}
