package com.caowei.decorator;
/**
 * 
 * �����װ������
 *
 */
public class EggDecorator extends Decorator {

	public EggDecorator(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.cost()+3.0f;
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return super.description()+"+����";
	}
}
