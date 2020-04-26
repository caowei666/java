package com.caowei.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1��Throwable���쳣�Ļ��࣬��ΪError��Exception,�ڱ�������ǹ�עException
 * 2��Exception��Ϊ�������쳣���ܼ죩���������쳣�����ܼ죩 3���쳣�ᵼ�³����жϣ��޷�����ִ��
 * 4���ڿ����У�������Ҫ�ѿ��ܳ����쳣�������try{}catch(){}����
 */

public class ExecptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		div(10,2);
//		div(10,0);
//		try {
//			div2(20,0);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		input();
	}

	private static void div(int num1, int num2) {
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[4]);
			arr = null;
			System.out.println(arr.length);
			int result = num1 / num2;
			System.out.println("result=" + result);
		} catch (ArithmeticException e) { // ��ѧ�����쳣
			// TODO: handle exception
			System.out.println("��������Ϊ��" + e);
		} catch (ArrayIndexOutOfBoundsException e) { // ����Խ���쳣
			System.out.println("�����±�Խ����" + e);
		} catch (NullPointerException e) { // ��ָ���쳣
			System.out.println("��ָ���쳣" + e);
		} catch (Exception e) {
			System.out.println("������");
		} finally {
			System.out.println("����ִ�����");
		}
		System.out.println("����");
	}

	private static int method() {
		int a = 10;
		int b = 5;
		try {
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			int c = a / b;
			System.out.println("a/b=" + c);
			return c; // returnǰ���ȴ�ӡfinally��Ϣ
		} catch (Exception e) {
			e.printStackTrace(); // ��ӡջ��Ϣ �������ʱʹ��
		} finally {
			System.out.println("finally");
		}
		return -1;
	}

	// throws��throwһ��ʹ�� throws������Ը�����쳣�ö��ŷָ�
	private static int div2(int a, int b) throws ArithmeticException {
		try {
			int c = a / b;
			return c;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("��������Ϊ��"); // ����Ҫдreturn
		} finally {
			System.out.println("���н���");
		}
	}

	private static void input() {
		// ctrl+shift+o���ٵ���
		Scanner input = new Scanner(System.in);
		try {
			int num = input.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			System.out.println("���벻ƥ��");
		}

	}
}
