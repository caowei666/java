package com.caowei;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String�����ָ�ֵ��ʽ
		//1ֱ�Ӹ���
		String s1 = "�߷�";
		//2ʹ��new�ؼ���:�÷�ʽ�ᴴ����������һ������ڳ�������һ���ڶ���
		
		String s2 = new String("�߷�");
		
		String s3 = "�߷�";
		System.out.println(s1==s3);
		
		//����ʾ����4�����������ֱ�Ӹ�ֵ	�ַ�������ʱ�����Ǳ����ں�������
		//����ڱ����ڿ��Ա�ȷ������ô��ʹ�����еĶ��󣬷���ᴴ���¶���
		String a = "a";
		String a1 = a+1;
		String a2 = "a1";
		System.out.println(a1 == a2); //false
		
		final String b = "b";	//���ڳ������У������ڿ���ȷ��
		String b1 = b+"1";
		String b2 = "b1";
		System.out.println(b1==b2);//true
		
		String c= getString();  //�����������ڲ���ȷ��ֵ
		String c1 = c+1;
		String c2 = "c1";
		System.out.println(c1==c2);//false
		
		final String d = getStringd();//�����������ڲ���ȷ��ֵ
		String d1 = d+1;
		String d2 = "d1";
		System.out.println(d1==d2);//false
	}
	
	private static String getString() {
		return "c";
	}
	private static String getStringd() {
		return "d";
	}

}
