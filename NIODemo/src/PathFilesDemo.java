import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class PathFilesDemo {

	public static void main(String[] args) {
		File file = new File("c:\\test\\m.jpg");
		//path
		Path p1 = Paths.get("c:\\test","m.jpg");
		System.out.println(p1);
		Path p2 = file.toPath();
		System.out.println(p2);
		Path p3 = FileSystems.getDefault().getPath("c:\\test\\�½��ı��ĵ� (2).txt");
		System.out.println(p3);
		
		//Files������
		Path p4 = Paths.get("c:\\test\\t.txt");
		String info = "��������ɵ��";
		try {
			Files.write(p4, info.getBytes(), StandardOpenOption.APPEND);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] bytes = null;
		try {
			bytes = Files.readAllBytes(p4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new String(bytes));
		
		//�����ļ�
//		try {
//			Files.copy(p3, Paths.get("d:\\mm.jpg"), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//�ƶ��ļ�
//				try {
//					Files.move(p3, Paths.get("d:\\mm.jpg"), StandardCopyOption.REPLACE_EXISTING);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				//ɾ���ļ�
//				try {
//					Files.delete(p3);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		//����Ŀ¼���������һ�����ܴ��ڣ����඼����
//		try {
//			Files.createDirectory(Paths.get("c:\\bb"));
//			Files.createDirectories(Paths.get("c:\\bb\\cc"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//�����ļ�
		try {
			Files.createFile(Paths.get("c:\\aa.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
