package baseLIANXi;

/**
 * �����ࣺ��abstract�ؼ������������Ϊ������
 * 	���������û�г��󷽷���
 *	�ǳ�����̳г��������ʵ�����еĳ��󷽷���
 *	��������Լ̳г����࣬���Բ�ʵ�ָ�����󷽷���
 *	����������з��������ԣ�
 *	�����಻�ܱ�ʵ������
 *	�����಻������Ϊfinal��
 *	����������й��췽����
 */

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man = new Man();
		man.move();
		man.eat();
		man.sleep();
		
		Woman woman = new Woman();
		woman.eat();
		woman.move();
		woman.sleep();
	}

}

abstract class Animal{
	public abstract void move();
}

abstract class Person extends Animal{
	public abstract void eat();
	public void sleep() {
		System.out.println("�˰�˯��");
	}
}

class Man extends Person{
	public void move() {
		System.out.println("�������ˣ��Ұ��ܲ�");
	}
	public void eat() {
		System.out.println("�������ˣ��Ұ�����");
	}
}
class Woman extends Person{
	public void move() {
		System.out.println("����Ů�ˣ��Ұ����");
	}
	public void eat() {
		System.out.println("����Ů�ˣ��Ұ����㽶");
	}
}