package baseLIANXi;

public class Extends1 {
	public static void main(String[] args) {
		HomeDog h = new HomeDog("��ʿ��");
		h.print();
		h.eat();
	}
}

class Dog{
	protected String name;
	private String sex;
	public Dog(String name,String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("����Dog�Ĺ��췽��");
	}
//	public Dog() {
//		System.out.println("����Dog���޲ι��췽��");
//	}
	public void eat() {
		System.out.println("�Է�");
	}
}
class HomeDog extends Dog{
	public HomeDog(String name) {
		super(name,"��");
		this.name= name;
		System.out.println("����HomeDog�Ĺ��췽��");
	}
	public void print() {
		System.out.println(name+"����һֻ�ҹ�");
	}
}
