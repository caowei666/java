package com.caowei;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Set�ӿڣ�
 * 1�������
 * 2���������ظ�Ԫ��
 * ʵ���ࣺHashSet��TreeSet��LinkedHashSet
 *���Ҫ����ѡ��TreeSet,�����������Ҳ���ñ�֤˳��ѡ��HashSet
 *��Ҫ����Ҫ��֤˳��ѡ��LinkedHashSet
 */

public class SetDemo {
	/**
	 * �����hashSet,������ӵ�˳�����
	 */
	private static void linkedHashSet() {
		LinkedHashSet<Cat> set = new LinkedHashSet<Cat>();
		Cat c1 = new Cat("miaomiaomiao",5,1);
		Cat c2 = new Cat("huahua",2,2);
		Cat c3 = new Cat("tom",5,3);
		Cat c4 = new Cat("miaomiaomiao",3,1);
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		for(Cat c:set) {
			System.out.println(c);
		}
	}
	/**
	 * ����ģ�����TreeMap(���������ݽṹ)��������Ҫ�Ƚϴ�С��ͨ������Ƚ�����ʵ��
	 * ����Ƚ���������ȥ���ظ�Ԫ�أ���������Զ����������û��ʵ�ֱȽ����ӿڣ����޷���ӵ�
	 * treeSet������
	 */
	private static void treeSet() {
		TreeSet<Cat> tree = new TreeSet<Cat>(new CatComparator());
		Cat c1 = new Cat("miaomiaomiao",5,1);
		Cat c2 = new Cat("huahua",2,2);
		Cat c3 = new Cat("tom",5,3);
		Cat c4 = new Cat("miaomiaomiao",3,1);
		tree.add(c1);
		tree.add(c2);
		tree.add(c3);
		tree.add(c4);
		System.out.println(tree.size());
		for(Cat c: tree) {
			System.out.println(c);
		}
	}
	/**
	 * HashSet
	 * 1��ʵ��ԭ�������ڹ�ϣ��HashMap��ʵ��
	 * 2���������ظ���������һ��nullԪ��
	 * 3������֤˳���ò���
	 * 4�����Ԫ��ʱ��Ԫ����ΪHashMap��key�洢��HashMap��valueʹ��һ��
	 * �̶���object����
	 * 5���ų��ظ�Ԫ��ʱͨ��equals���������Ƿ�Ϊͬһ��Ԫ��
	 * 6���ж����������Ƿ���ͬ�����ж����������hashCode�Ƿ���ͬ��
	 * ���������hashCode��ͬ����һ����ͬһ�����������ͬ��һ������ͬһ������
	 * �����ͬ��Ҫ����equals�жϣ�equals��ͬ����ͬһ�����󣬲�ͬ����ͬһ������
	 * 7���Զ������Ҫ��Ϊ����ֵ����ͬʱΪͬһ��������Ҫ��дhashCode������equals����
	 * 
	 * С�᣺
	 * ��1����ϣ��Ĵ洢�ṹ������+�����������ÿ��Ԫ�����������ʽ�洢
	 * ��2����ΰѶ���洢����ϣ���У��ȼ���hashCodeֵ���ٶ�����ĳ���������������������
	 * Ҫ�洢�������е�λ��
	 */
	private static void hashSet() {
		Set<String> set = new HashSet<String>();
		set.add("�ɷ�");
		set.add("����");
		set.add("����");
		set.add("�ع�");
		set.add("����");
		
		String[] names = set.toArray(new String[] {});
		for(String s:names) {
			System.out.println(s);
		}
		Cat c1 = new Cat("miaomiaomiao",5,1);
		Cat c2 = new Cat("huahua",2,2);
		Cat c3 = new Cat("tom",5,3);
		Cat c4 = new Cat("miaomiaomiao",5,1);
		Set<Cat> cats = new HashSet<Cat>();
		cats.add(c1);
		cats.add(c2);
		cats.add(c3);
		cats.add(c4);
		for(Cat c:cats) {
			System.out.println(c);
		}
		System.out.println(cats.size());
		System.out.println("c1="+c1.hashCode());
		System.out.println("c2="+c2.hashCode());
		System.out.println("c3="+c3.hashCode());
		System.out.println("c4="+c4.hashCode());
	}
	public static void main(String[] args) {
//		hashSet();
//		treeSet();
		linkedHashSet();
	}

}
