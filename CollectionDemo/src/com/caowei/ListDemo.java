package com.caowei;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Collection�ӿڣ����ڴ洢��������ļ���
 *�������ӽӿڣ�
 *	1��List�ӿڣ�����ġ���������Ԫ��
 *		����ĳ��õ�ʵ���ࣺArrayList��Vector��LinkedList
 *		ʵ�ʿ��������ѡ��list�ľ���ʵ���أ�1����ȫ�����⣬2���Ƿ�Ƶ�����룬ɾ��������LinkedList��
 *			3���Ƿ�洢�������ArrayList��
 *	2��Set�ӿڣ�
 */

public class ListDemo {
	/**
	 * LinkedList
	 * 1��ʵ��ԭ��������˫������ṹʵ��
	 * 2���ʺϲ��룬ɾ�����������ܸ�
	 */
	private static void linkedList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("����ʦ");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	/**
	 * Vector
	 * 1�����ö�̬�������飬Ĭ�Ϲ��췽��������һ����СΪ10�Ķ�������
	 * 2��������㷨��������Ϊ0ʱ������Ϊԭ����С��2��������������0ʱ������Ϊԭ����С+����
	 * 3�����ʺ�ɾ����������
	 * 4��Ϊ�˷�ֹ���鶯̬������������࣬���鴴��vectorʱ��������ʼ����
	 * 5���̰߳�ȫ���ʺ��ڶ��̷߳���ʱʹ�ã��ڵ��߳�ʱЧ�ʽϵ�
	 */
	private static void vector() {
		Vector <String> v = new Vector<String>();
		v.add("����ʦ");
		v.add("����ʦ");
		v.add("����ʦ");
		v.add("����ʦ");
		for(int i =0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}
	/**
	 * ArrayList
	 * 1��ʵ��ԭ�����ö�̬�������飬Ĭ�Ϲ��췽��������һ��������
	 * 2����һ�����Ԫ�أ���������Ϊ10��֮��������㷨��Ժ�������С+ԭ�������һ��
	 * 3�����ʺ�ɾ����������
	 * 4��Ϊ�˷�ֹ���鶯̬������������࣬���鴴��ArrayListʱ��������ʼ����
	 * 5���̲߳���ȫ���ʺ��ڵ��̷߳���ʱʹ�ã�Ч�ʽϸ�
	 */
	private static void arrayList() {
		//ʹ�ü������洢�����ͬ���͵�Ԫ�أ���ô�ڴ���ʱ��Ƚ��鷳����ʵ��
		//�����в���������ʹ�ã�����Ӧ����һ��������洢��ͬ�����Ͷ���
		List<String> list = new ArrayList<>();
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("10");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.contains("����ʦ"));
		list.remove("����ʦ");
		System.out.println(list.size());
		String[] array = list.toArray(new String[] {});
		for(String s:array) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
//		arrayList();
//		vector();
		linkedList();
	}

}
