package com.caowei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jack");
		list.add("tom");
		list.add("lily");
		//1��˳���������Ҫ���list��
//		Collections.reverse(list);
//		Collections.shuffle(list);  //����˳��
//		Collections.sort(list);
//		Collections.swap(list, 0, 1);  //�к�
//		Collections.rotate(list, 1);  //ÿ�����Ҵ�һ�������һ����Ϊ��һ��
		//2�����Һ��滻(��Ҫ���collection�ӿ�)
//		int i = Collections.binarySearch(list, "jack");
//		String i = Collections.max(list);
//		String i = Collections.min(list);
//		Collections.fill(list, "bin");  //���е�Ԫ���滻Ϊ"bin"
//		int i = Collections.frequency(list, "lily");//"lily"���ֵĴ���
//		Collections.replaceAll(list, "lily", "ww");
		
		//�̰߳�ȫ
//		List<String> synclist = Collections.synchronizedList(new ArrayList<String>());
		
//		List<String> slist = Collections.emptyList(); //����һ���������Ԫ�ص�list
//		slist.add("bin");
//		System.out.println(slist);
		
		List<String> li = query();
		System.out.println(li.size());  //����nullʱ��ӡsize���� ����emptyList(),��ӡ���Ϊ0
		
//		Collections.disjoint(c1, c2) //�������ָ��������û����ͬԪ���򷵻�true
//		Collections.addAll(c, elements) //������Ԫ����ӵ�ָ������
	}
	
	public static List<String> query(){
		List<String> list = null;
		
		
//		return list;
		return Collections.emptyList();
	}

}
