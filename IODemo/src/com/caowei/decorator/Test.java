package com.caowei.decorator;

public class Test {

	public static void main(String[] args) {
		Drink d = new SoyaBeanMilk();
		SugerDecorator suger = new SugerDecorator(d);
		EggDecorator egg = new EggDecorator(suger);
		BlackBeanDecorator blackBean = new BlackBeanDecorator(egg);
		System.out.println("���Ķ����ǣ�"+blackBean.description());
		System.out.println("һ�����ˣ�"+blackBean.cost());
	}

}
