package com.caowei;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Stream�ӿڣ����Ǵ洢�ṹ������Դ��Դ������һ�����ϣ�Ϊ�˺���ʽ��̣�
 *����ִ�У�����ֻ�ܱ�����һ��
 *
 *�������͵Ĳ���������1���м����������һ��Stream����2����������(ִ�м������)
 */
public class StreamDemo {
	public static void main(String[] args) {
		//foreach����
		Stream<String> stream = Stream.of("good","good","study","day","day","up");
		//stream.forEach((str)->System.out.println(str)); //ֱ�Ӵ�ӡ������������
		//stream.forEach(System.out::println);
		
		//filter
		//stream.filter((s)->s.length()>3).forEach(System.out::println);  //�����µ������м������
		
		//distinctȥ���ظ�Ԫ�أ��м������
		//stream.distinct().forEach(System.out::println);
		
		//map
		//stream.map(s->s.toUpperCase()).forEach(System.out::println);
		
		//flatMap
		//Stream<List<Integer>> ss = Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5));
		//ss.flatMap(l->l.stream()).forEach(System.out::println);
		
		//reduce
		//Optional<String> opt = stream.reduce((s1,s2)->s1.length()>=s2.length()?s1:s2);
		//System.out.println(opt.get());
		
		//collect
		List<String> list = stream.collect(Collectors.toList());
		list.forEach(s->System.out.println(s));
		
		//::��������
		//���þ�̬����  Integer::valueOf
		//Ӧ�ö���ķ���  list::add
		//���ù��췽��  ArrayList::new
	}
}
