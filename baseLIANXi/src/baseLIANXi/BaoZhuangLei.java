package baseLIANXi;

public class BaoZhuangLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ѻ�����������ת��Ϊ��װ�࣬��Ϊ�Զ�װ��
		Integer i1 = new Integer(10);
		//�Ѱ�װ��ת��Ϊ�����������ͣ���Ϊ�Զ�����
		int i2 = i1.intValue();
		
		Integer i3 = 10;
		
		Integer i4 = new Integer("123");
		
		String num1 = "12";
		int i5 = Integer.parseInt(num1);
		
		Integer i6 = Integer.valueOf(num1);
		
		//������
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		System.out.println(x1 == x2);   //false
		System.out.println(x1.equals(x2));   //true
		
		Integer x3 = new Integer(128);
		Integer x4 = new Integer(128);
		System.out.println(x3 == x4);   //false
		System.out.println(x3.equals(x4));   //true
		
		Integer x5 = 10;
		Integer x6 = 10;
		System.out.println(x5 == x6);   //true          ��Ԫģʽ���Ỻ��һ���ֽ����ڵ����ݣ�127��
		System.out.println(x5.equals(x6));   //true
		
		Integer x7 = 128;
		Integer x8 = 128;
		System.out.println(x7 == x8);   //false
		System.out.println(x7.equals(x8));   //true
	}

}
