package com.caowei;

public class StringBufferrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "b";
		String c = a+b+1;   //�����5������ �������б���
		System.out.println(c);
		
		String d = "a"+1+2+3+4+"b"; //����һ������ �����ڶ��ǳ���
		//�������û���������⣨�����ڽ����Ż���
		//StringBufferĿ��ʱ������ַ������ʱ��������������
		//StringBuffer���ڲ�ʵ�ֲ����ַ����飬Ĭ�����鳤��Ϊ16�����������С
		//����̬������㷨��str*2+2;
		//������Ԥ֪���ݳ���ʱ������ʹ�ô���ʼ�������Ĺ��췽���������⶯̬����Ĵ���
		//�Ӷ����Ч��
		//���̰߳�ȫ�ģ���Ӱ������
		StringBuffer sb = new StringBuffer(100);
		sb.append(a).append(b).append(1);
		System.out.println(sb.toString());
		
	}

}
