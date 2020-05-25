package com.caowei;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ӿڣ�
 *1����ֵ�Դ洢һ�����
 *2��Key�����ظ���Ψһ����Value�����ظ�
 *3�������ʵ���ࣺHashMap  TreeMap  Hashtable  LinkedHashMap
 *4��JDK1.8��ʼ�������ȳ���8ʱ�������Ϊ������
 *��key����ͨ��hash()��������hashֵ��Ȼ�������hashֵ�Ͷ����鳤��ȡ������16��
 *��������key�����������д洢��λ�ã������λ���ж������ʱ��������ṹ�洢��
 *JDK1.8�󣬵������ȴ���8ʱ������ת��Ϊ������ṹ��
 *������Ŀ��ʱΪ�˸����ȡֵ���洢��������Խ�����ܱ���Խ����
 */
public class MapDemo {
	/**
	 * HashMap��ʵ��ԭ��
	 * 1�����ڹ�ϣ������+����+�����������������
	 * 2��Ĭ�ϼ�������0.75�������ʼ��С16
	 * 3���Ѷ���洢����ϣ����
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
		hashMap();
	}

}
