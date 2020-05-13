package com.caowei.decorator;

/**
 * �����װ������
 *
 */
public class SugerDecorator extends Decorator {

	public SugerDecorator(Drink drink) {
		super(drink);
	}
	@Override
		public float cost() {
			// TODO Auto-generated method stub
			return super.cost()+1.0f;
		}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return super.description()+"+��";
	}
}
