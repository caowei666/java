package baseLIANXi;

/**
 * 	�ӿ���ֻ�ܶ�����󷽷���
 *	�ӿ��ж���ķ���û���������η���Ĭ��Ϊpublic abstract��
 *	�ӿ���ֻ�ܶ��峣����
 *	JDK1.8�������ԣ����Զ���һ��Ĭ�ϵķ��������Ա�����ʵ����̳У�
 *	�ӿڿ��Զ�̳�,�����ʵ�ֶ���ӿڣ�
 *	ʵ�ֽӿڱ���ʵ�ֽӿ����з�����
 *	������ʵ�ֽӿڿ��Բ�ʵ�ֽӿڵķ�����
 *	�ӿڲ����й��췽����
 *	�ӿڲ��ܱ�ʵ������
 */

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl mm = new Girl("����");
		mm.sleep();
		mm.eat();
		mm.run();
		mm.print();
	}

}

interface IEat{
	public abstract void eat(); //���Լ�дΪvoid eat();
	public static final int NUM = 10; //���Լ�дΪint NUM=10;
	public default void print() {
		System.out.println("eat");
	}
}
interface IRun{
	public abstract void run();
}
interface ISleep extends IEat,IRun{
	void sleep();
}

class Girl implements ISleep,IEat{
	private String name;
	public Girl(String name) {
		this.name = name;
	}
	public Girl() {}
	public void sleep() {
		System.out.println("�Ұ�˯��");
	}
	public void eat() {
		System.out.println("����"+name+"�Ұ�������");
	}
	public void run() {
		System.out.println("�������");
	}
}
