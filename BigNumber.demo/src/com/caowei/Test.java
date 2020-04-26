package com.caowei;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����������
		String val1 = "3137841349842419847";
		String val2 = "29187641481397417638";
		BigInteger b1 = new BigInteger(val1);
		BigInteger b2 = new BigInteger(val2);
		System.out.println(b1.add(b2)); //+
		System.out.println(b1.subtract(b2));  //-
		System.out.println(b1.multiply(b2)); //*
		System.out.println(b1.divide(b2)); // /
		System.out.println(b1.remainder(b2)); // %
		System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));  //ͬʱ����ȡ����
		
		//��С������
		String val3 = "1323.1241335784979479818";
		String val4 = "324.31286941846813432";
		BigDecimal b3 = new BigDecimal(val3);
		BigDecimal b4 = new BigDecimal(val4);
		System.out.println(b3.add(b4)); //+
		System.out.println(b3.subtract(b4));  //-
		System.out.println(b3.multiply(b4)); //*
		//System.out.println(b3.divide(b4)); // /���ڳ������ı���ArithmeticException��
		
		
		//���ݸ�ʽ��
		double pi = 3.1415927;
		System.out.println(new DecimalFormat("0").format(pi));
		System.out.println(new DecimalFormat("0.00").format(pi));
		System.out.println(new DecimalFormat("00.000").format(pi));
		//ȥ����֤�鲿��
		System.out.println(new DecimalFormat("#").format(pi));
		//�԰ٷֱ����Ƽ�������ȡ��λС�������314.16%
		System.out.println(new DecimalFormat("#.##%").format(pi));
	}

}
