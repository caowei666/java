package com.caowei.ex;

public class AssertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = add(10,10);
		assert result == 10:"�������ȷ";
	}
	private static int add(int a,int b) {
		return a+b;
	}

}
