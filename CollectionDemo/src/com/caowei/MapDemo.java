package com.caowei;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map�ӿڣ�
 *1����ֵ�Դ洢һ�����
 *2��Key�����ظ���Ψһ����Value�����ظ�
 *3�������ʵ���ࣺHashMap  TreeMap  Hashtable  LinkedHashMap
 *4��HashMap��HashTable������
 *5�����ѡ��ʹ���ĸ���
 */
public class MapDemo {
	/**
	 * ���ڶ������ĺ����ʵ��
	 */
	private static void treeMap() {
//		Map<String,String> map = new TreeMap<>();
//		map.put("one", "lily");
//		map.put("two","Tom");
//		map.put("three","Bin");
//		map.forEach((key,value)->System.out.println(key+"->"+value));
		Map<Dog,String> dogs = new TreeMap<>();
		dogs.put(new Dog(1,"zha",3),"dog1");
		dogs.put(new Dog(1,"wangwang",2), "dog2"); //�Ƚϵ�id���в������
		dogs.put(new Dog(3,"hsq",4), "dog3");
		dogs.forEach((key,value)->System.out.println(key+"->"+value));
		//Dog [id=1, name=zha, age=3]->dog2
		//Dog [id=3, name=hsq, age=4]->dog3
	}
	/**
	 * LinkedHashMap��HashMap�����࣬����HashMap���ܱ�֤˳���ò��䣬����ʹ��һ��˫��������ά��
	 * �������Ԫ�ص�˳��
	 */
	private static void linkedHashMap() {
		Map<String,String> table = new LinkedHashMap<>();
		table.put("one", "lily");
		table.put("two","Tom");
		table.put("three","Bin");
		table.forEach((key,value)->System.out.println(key+value));
	}
	/**
	 * JDK1.0��ʼ
	 * ���ڹ�ϣ��ʵ�֣�����+����
	 * Ĭ�������СΪ11������������0.75
	 * ���䷽ʽ��ԭ�����С<<1��*2��+1
	 * �̰߳�ȫ�ģ����ڶ��̷߳���
	 */
	private static void hashtable() {
		Map<String, String> table = new Hashtable<>();
		table.put("one", "lily");
		table.put("two","Tom");
		table.put("three","Bin");
		table.forEach((key,value)->System.out.println(key+value));
	}
	/**
	 * HashMap��ʵ��ԭ��
	 * 1�����ڹ�ϣ������+����+�����������������
	 * 2��Ĭ�ϼ�������0.75�������ʼ��С16
	 * 3���Ѷ���洢����ϣ���У���δ洢��
	 * ��key����ͨ��hash()��������hashֵ��Ȼ�������hashֵ�Ͷ����鳤��ȡ������16��
	 *��������key�����������д洢��λ�ã������λ���ж������ʱ��������ṹ�洢��
	 *JDK1.8�󣬵������ȴ���8ʱ������ת��Ϊ������ṹ��
	 *������Ŀ��ʱΪ�˸����ȡֵ���洢��������Խ�����ܱ���Խ����
	 * 4������ԭ������������������75%����ô��ʾ��������Ҫ���䣬������䣿
	 * �����㷨����ǰ��������<<1���൱���2��������һ����������������Ӱ�����ܣ���Ҫ
	 * ���¼���ÿ��ֵ��λ�ã�������������������
	 * 5���̲߳���ȫ���ʺ��ڵ��߳�ʹ��
	 */
	private static void hashMap() {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "tom");
		map.put(2, "jack");
		map.put(3, "Vince");
		map.put(4, "Bin");
		map.put(5, "Lisy");
		System.out.println("size:"+map.size());
		//mapȡֵ
		System.out.println(map.get(1));
		
		//map����
		//1������ֵ
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for(Entry e:entrySet) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		//2�������������õ�ֵ��
		Set<Integer> keys = map.keySet();
		for(Integer i:keys) {
			String value = map.get(i);
			System.out.println(i+"->"+value);
		}
		//3ֻ�ܱ���ֵ���ò�������
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		//foreach
		map.forEach((key,value)->System.out.println(key+"->"+value));
	}
	public static void main(String[] args) {
//		hashMap();
//		hashtable();
//		linkedHashMap();
		treeMap();
	}

}
