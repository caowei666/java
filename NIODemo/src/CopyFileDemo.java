import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
/**
 * 
 * IO�������ܱȽ�
 * 1���ڴ�ӳ�����
 * 2��NIO��д�ļ�
 * 3��ʹ���˻����IO��
 * 4���޻����IO��
 *
 */
public class CopyFileDemo {
	private static void randomAccessFileCopy() {
		try {
			RandomAccessFile in = new RandomAccessFile("c:\\Abstract1.jpg","r");
			RandomAccessFile out = new RandomAccessFile("c:\\test\\Abstract1.jpg","rw");
			FileChannel fcIn = in.getChannel();
			FileChannel fcOut = out.getChannel();
			long size = fcIn.size();  //�������ֽڴ�С
			//�������Ļ�����
			MappedByteBuffer inBuf = fcIn.map(MapMode.READ_ONLY, 0, size);
			//������Ļ�����
			MappedByteBuffer outBuf = fcOut.map(MapMode.READ_WRITE, 0, size);
			for(int i = 0;i < size;i++) {
				outBuf.put(inBuf.get());
			}
			//�ر�ͨ��ʱ��д�����ݿ�
			fcIn.close();
			fcOut.close();
			in.close();
			out.close();
			System.out.println("copy success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ͨ���ļ�ͨ��ʵ���ļ�����
	 */
	private static void copyFile() {
		try {
			//�����������ļ�ͨ��
			FileChannel fcIn = new FileInputStream("c:\\Abstract1.jpg").getChannel();
			//����һ������ļ�ͨ��
			FileChannel fcOut = new FileOutputStream("c:\\test\\Abstract1.jpg").getChannel();
			ByteBuffer buf = ByteBuffer.allocate(1024);
			while((fcIn.read(buf))!=-1) {
				buf.flip();
				fcOut.write(buf);
				buf.clear();
			}
			fcIn.close();
			fcOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		copyFile();
		randomAccessFileCopy();
	}

}
