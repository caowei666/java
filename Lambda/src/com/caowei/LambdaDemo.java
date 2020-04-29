package com.caowei;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IEat ieat = new IEatImpl();
//		ieat.eat();
		//�ӿ�ʽ�����ڲ���
//		IEat ieat2 = new IEat() {
//			public void eat() {
//				System.out.println("eat banana");
//			}
//		};
//		ieat2.eat();
		//lambda���ʽд��
		//�ô�1��������.2�����ᵥ������class�ļ�
//		IEat ieat3 = ()->{
//			System.out.println("eat orange");
//		};
//		IEat ieat3 = () -> System.out.println("eat orange");
//		ieat3.eat();
		
		//������ʱʹ��,�������Ϳ���ʡ��
//		IEat ieat3 = (thing,name)->System.out.println("eat..."+thing+".."+name);
//		ieat3.eat("people","���");
		
		//������ֵ�ķ���
//		IEat ieat = (thing,name)->{
//			System.out.println(name+" eat"+thing);
//			return 10;
//		};
//		ieat.eat("people", "���");
		
		//������ֵ�ķ�����ֻ��һ��ʵ�ִ���
		IEat ieat3 = (thing,name)->10; //�Զ�return
		int i = ieat3.eat("people", "���");
		System.out.println(i);
		
		Student[] student = {new Student("����",18),new Student("�Ŷ�",10),new Student("��һ",20)};
//		Arrays.sort(student,new Comparator<Student>() {
//			public int compare(Student o1,Student o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
//		Comparator<Student> c = (o1,o2)->o1.getAge()-o2.getAge();
		Arrays.sort(student,(o1,o2)->o1.getAge()-o2.getAge());
		System.out.println(Arrays.toString(student));
		IEat.method();
		
	}

}


//ֻ��һ�����󷽷��Ľӿ�
//interface IEat{
//	public int eat(String thing,String name);
//}
interface IEat{
	public int eat(final String thing,final String name);
	public default void print() {    //��Ĭ�Ϸ���û��ϵ
		System.out.println("print test");
	}
	public static void  method() {   //��̬����Ҳ����Ӱ��
		System.out.println("static method");
	}
}
//class IEatImpl implements IEat{
//	public void eat(String thing) {
//		System.out.println("eat--"+thing);
//	}
//}
