package com.caowei.ex;

/**
 * Exception��RuntimeException
 * Exception:�ܼ��쳣���ڱ����ڼ�飬�ڵ����׳�����쳣�ķ���ʱ��������ʾ��ʹ��try{}catch(){}
 * RuntimeException:���ܼ��쳣���������ڼ�飬�ڵ����׳�����쳣�ķ���ʱ��������ʾ��ʹ��try{}catch(){}
 * ��ʹ���Զ����쳣ʱ������ҵ��Ҫ��������ʹ���ĸ���Ϊ�̳еĸ���
 */
import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���");
		String name = input.nextLine();
		System.out.println("����������");
		String pass = input.nextLine();
		UserSerivce us = new UserSerivce();
		try {
			User user = us.login(name, pass);
			System.out.println("��¼�ɹ�");
			System.out.println(user.toString());
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		}
	}

}
