package com.caowei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Properties:Properties���������������ļ�
 * Javaweb javaee�����о����õ������ļ�
 * 
 *ResourceBundleֻ����
 *Properties�ɶ���д
 */

public class PropertiesDemo {

	//��̬����飬ֻ��ִ��һ��
	public static String version = "";
	public static String username = "";
	public static String password = "";
	static{
//		readConfig();
	}
	public static void writeConfig(String version,String username,String password) {
		Properties p = new Properties();
		p.put("app.version",version);
		p.put("db.username",username);
		p.put("db.password",password);
		OutputStream out;
		try {
			out = new FileOutputStream("config.properties");
			//д�ļ�
			p.store(out, "update congig");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void readConfig() {
		Properties p = new Properties();
		InputStream inStream = null;
		try {
			inStream = new FileInputStream("config.properties");
			p.load(inStream);
			//��properties�л�ȡ����
			PropertiesDemo.version = p.getProperty("app.version");
			PropertiesDemo.username = p.getProperty("db.username");
			PropertiesDemo.password = p.getProperty("db.password");
			inStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeConfig("2","caowei","213");
		readConfig();
		System.out.println(PropertiesDemo.version);
		System.out.println(PropertiesDemo.username);
		System.out.println(PropertiesDemo.password);
	}
}
