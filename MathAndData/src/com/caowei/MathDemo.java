package com.caowei;
import static java.lang.Math.floor; //��̬����

import java.util.Random;
public class MathDemo {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-1010));
		System.out.println(Math.random()*100); //0<= r < 1
		System.out.println(Math.round(3.9));  //��������
		System.out.println(Math.round(Math.sqrt(2)*1000)/1000.0);//��ƽ������������λС��
		//ʹ�þ�̬����
		System.out.println(floor(1.23455)); //��ӽ��������������
		
		Random r = new Random();
		System.out.println(r.nextLong());
		System.out.println(r.nextInt(5));
	}

}
