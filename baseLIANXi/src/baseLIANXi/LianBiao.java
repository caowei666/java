package baseLIANXi;

/**
 * 
 * ����һ�ֳ��������ݽ������һ�����Ա����ǲ����ᰴ���Ե�˳��洢���ݣ�
 * ������ÿһ���ڵ������һ���ڵ��ָ�롣
 * �����ʺϲ��� ɾ�������˹���������ᵼ�±��������½���
 * ���飺�ʺϲ��ұ������̶����ȡ�
 *
 */
public class LianBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeManager nm = new NodeManager();
		System.out.println("------------add--------------");
		nm.add(5);
		nm.add(4);
		nm.add(3);
		nm.add(2);
		nm.add(1);
		nm.print();
		System.out.println("------------del--------------");
		nm.del(3);
		nm.print();
		System.out.println("------------find--------------");
		System.out.println(nm.find(1));
		System.out.println("------------update--------------");
		nm.update(1, 10);
		nm.print();
		System.out.println("------------insert--------------");
		nm.insert(3, 20);
		nm.print();
	}

}

class NodeManager{
	private Node root; //���ڵ�
	private int currentIndex = 0; //��ǰ�ڵ����ţ�ÿ�β�����0��ʼ
	public void add(int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			root.addNode(data);
		}
	}
	public void del(int data) {
		if(root == null)return;
		if(root.getData() == data) {
			root = root.next;
		}else {
			root.delNode(data);
		}
	}
	public void print() {
		if(root != null) {
			System.out.print(root.getData()+"-->");
			root.printNode();
			System.out.println();
		}
	}
	public boolean find(int data) {
		if(root == null)return false;
		if(root.getData() == data) {
			return true;
		}else {
			return root.findNode(data);
		}
	}
	public boolean update(int oldData,int newData) {
		if(root == null)return false;
		if(root.getData() == oldData) {
			root.setData(newData);
			return true;
		}else {
			return root.updataNode(oldData, newData);
		}
	}
	//������ǰ��	
	public void insert(int index,int data) {
		if(index<0)return;
		currentIndex = 0;
		if(index==currentIndex) {
			Node newNode = new Node(data);
//			root.next = new Node(data);  //���
			newNode.next = root;  //ǰ��
			root = newNode;
		}else {
			root.insertNode(index,data);
		}
	}
	
	private class Node{
		private int data;
		private Node next;//�ѵ�ǰ������Ϊ���ԣ�Java������ô�ã�
		public Node(int data) {
			this.data = data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getData() {
			return data;
		}
		//��ӽڵ�
		public void addNode(int data) {
			if(this.next==null) {
				this.next = new Node(data);
			}else {
				this.next.addNode(data);
			}
		}
		//ɾ���ڵ�
		public void delNode(int data) {
			if(this.next != null) {
				if(this.next.data == data) {
					this.next = this.next.next;
				}else {
					this.next.delNode(data);;
				}
			}
		}
		//������нڵ�
		public void printNode() {
			if(this.next != null) {
				System.out.print(this.next.data+"-->");
				this.next.printNode();
			}
		}
		//����һ��
		public boolean findNode(int data) {
			if(this.next != null) {
				if(this.next.data == data) {
					return true;
				}else {
					return this.next.findNode(data);
				}
			}
			return false;
		}
		//�޸Ľڵ�
		public boolean updataNode(int oldData,int newData) {
			if(this.next != null) {
				if(this.next.data == oldData) {
					this.next.data = newData;
					return true;
				}else {
					return this.next.updataNode(oldData, newData);
				}
			}
			return false;
		}
		//����ڵ�
		public void insertNode(int index,int data) {
			currentIndex++;
			if(index == currentIndex) {
				Node  newNode = new Node(data);
				newNode.next = this.next;
				this.next = newNode;
			}else {
				this.next.insertNode(index, data);
			}
		}
	}
}