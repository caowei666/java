package baseLIANXi;
/**
 * 
 * �ڲ����Ϊ��Ա�ڲ��� �������ڲ��ࡢ��̬�ڲ��ࡢ�����ڲ���
 * 
 * ��Ա�ڲ��࣬��һ�����ж������
 * 
 * �����ڲ��࣬��һ����ķ����ڶ���һ����
 * 	�����ڲ���ֻ�ܶ�����ڲ���ķ�����ʵ�������������ڴ˷��������ʵ������
 * 	�����ڲ���ֻ��ʹ����final���εı�����
 * 
 * ��̬�ڲ��࣬�����ڲ��ж���һ����̬���ε���
 * 		��̬�ĺ������ڲ��������������̬��Աһ����û���ⲿ�����ʱҲ�ܹ�����������̬Ƕ������ܷ����ⲿ��ľ�̬��Ա�ͷ���
 *
 *�����ڲ��࣬
 *	�����й��췽����ֻ����һ��ʵ����
 *	���ܶ����κξ�̬��Ա����̬������
 *	����ʽpublic protected private static;
 *	һ������new�ĺ��棬��������ʵ��һ���ӿڻ�̳�һ���ࣻ
 *	�����ڲ���Ϊ�ֲ��ģ����Ծֲ��ڲ�����������ƶ�������Ч
 */
public class InnerClass {
public static void main(String[] args) {
	outer outer = new outer();
//	outer.inner inner = outer.new inner();
//	inner.print();
	outer.innerPrint();
	outer.show(100);
	outer.print1();
	outer.print2();
	outer.inner3 inner3 = new outer.inner3();
	inner3.print();
	outer.print3(new Eat() {

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("����ʽ�����ڲ���");
		}
		
	});
}
}

class outer{
	public void innerPrint() {
		inner inner = new inner();
		inner.print();
	}
	//��Ա�ڲ���
	private class inner{
		public  void print() {
			System.out.println("��Ա�ڲ���");
		}
	}
	//�����ڲ���
	public void show(int i) {
//		final int x = 10;   //�����ڲ���ֻ��ʹ����final���εı���
		i++;
		System.out.println(i);
		int y = 10;
		class inner2{
			public void print() {
				System.out.println("�����ڲ���"+y);
			}
		}
		inner2 inner2 = new inner2();
		inner2.print();
	}
	//��̬�ڲ���   ����ʹ�ã����ᵼ���ڴ�й©��
	static class inner3{
		public void print() {
			System.out.println("��̬�ڲ���");
		}
	}
	//�����ڲ���
	//�̳�ʽ	
	public void print1() {
		Cat cat = new Cat() {
			public void eat() {
				System.out.println("�̳�ʽ�����ڲ���");
			}
		};
		cat.eat();
	}
	//�ӿ�ʽ
	public void print2() {
		Eat eat = new Eat() {
			public void eat() {
				System.out.println("�ӿ�ʽ�����ڲ���");
			}
		};
		eat.eat();
	}
	//����ʽ
	public void print3(Eat eat) {
		eat.eat();
	}
}
interface Eat{
	public void eat();
}
abstract class Cat{
	abstract public void eat();
	public void name() {
		System.out.println(123);
	}
}
/**
 * �����ڲ�����ʾֲ�����Ϊʲô������final ,Ϊʲô��
 * 		���������������ʱ�򣬾ֲ��������û����final���Σ������������ںͷ�������������һ����
 * 	������������ʱ����ջ��������������ջ������ֲ�����Ҳ����ʧ�ˣ������ʵ����������ҪGC����
 * 	����������ʧ��������ֲ���������Ȼ�Ѿ��������ˣ������final���λ�������ص�ʱ����볣��
 * �أ���ʹ������ջ�������صĳ������ڣ�Ҳ�Ϳ��Լ���ʹ�á���JDL1.8ȡ�����ڷ����ڲ����б�����ʾ
 * ��ʹ��final���Σ�������Ĭ�ϻ�Ϊ�����������final��
 */ 

/**
 * �ڲ��������:ÿ���ڲ��඼�ܶ����ļ̳���һ�����ӿڵģ�ʵ�֣����������ⲿ���Ƿ��Ѿ��̳���ĳ�����ӿڵģ�
 * ʵ�֣������ڲ��඼û��Ӱ�죬���û���ڲ����ṩ�Ŀ��Լ̳ж������Ļ��������������һЩ�����
 * �������ͺ��ѽ����������Ƕȿ����ڲ���ʹ�ö��ؼ̳еĽ����������������ӿڽ���˲�������
 * ���ڲ�����Ч��ʵ���ˡ����ؼ̳С���
 */
