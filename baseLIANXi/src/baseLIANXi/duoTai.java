package baseLIANXi;

/**
 * ʲô�Ƕ�̬�������������еĶ���״̬��
 * ��̬��Ϊ���ࣺ��1�����������غ���д����2������Ķ�̬��
 * ����ת�ͣ��Զ�ת��
 *	����ת�ͣ�ǿ��ת��
 */

public class duoTai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ת�����ø��������ָ�������������ת�ͣ��Զ�ת��		
		Chicken yj = new YeChicken("СҰ��");
//		yj.eat();
		Chicken jj = new HomeChicken("С�Ҽ�");
//		jj.eat();
//		yj = jj;
//		yj.eat();
//		eat(yj);
//		eat(jj);
		Chicken jjj = new jianjiaoChicken();
//		jjj.eat();
		eat(jjj);
	}
	public static void eat(Chicken c) {
		System.out.println("���Է�");
		c.eat();
		jianjiaoChicken jjj = (jianjiaoChicken)c;
		jjj.song();
	}
}
//�������
abstract class Chicken{
	private String name;
	public Chicken() {}
	public Chicken(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void eat();
}
//���� �Ҽ�
class HomeChicken extends Chicken{
	public HomeChicken(String name) {
		super(name);
	}
	public void eat() {
		System.out.println(this.getName()+",�Ұ�����");
	}
}
class YeChicken extends Chicken{
	public YeChicken(String name) {
		super(name);
	}
	public void eat() {
		System.out.println(this.getName()+",�Ұ��Գ���");
	}
}
//���� ��߼�
class jianjiaoChicken extends Chicken{
	public void eat() {
		System.out.println("���Ǽ⽷�����Ҳ��Զ���");
	}
	public void song() {
		System.out.println("�����������Ǽ�м�");
	}
}
