package com.caowei;

import java.io.Serializable;
//���һ���ഴ���Ķ�����Ҫ�����л�����ô�������ʵ��Serializable�ӿ�
//Serializable��һ����ǽӿڣ�û���κζ��壬Ϊ�˸���JVM�ö�����Ա����л�

//ʲôʱ�������Ҫ�����л��أ�
//1���Ѷ��󱣴浽�ļ��У��洢��������ʣ�
//2��������Ҫ�������ϴ���ʱ

//�������û��ʵ��Serializable����쳣//java.io.NotSerializableException
public class Dog implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String sex;
	private int age;
	private transient int id; // �����л��б����Ե����ԣ���ԭʱ���Ϊ0����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Dog() {
		super();
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
