package baseLIANXi;

public class keBianCanShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1,2,3,3,2,1);
	}
	//jdk1.5�ɱ����		
	//�ɱ����ֻ���ǲ����б�����һ��
	//�ɱ����������Ϊ����ʹ��	
	public static void print(int ...x) {
		int len = x.length;
		for(int i=0;i<len;i++) {
			System.out.println(x[i]);
		}
	}

}
